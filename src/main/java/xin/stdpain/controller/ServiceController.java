package xin.stdpain.controller;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import xin.stdpain.domain.Person;
import xin.stdpain.pojo.Files;
import xin.stdpain.pojo.Logs;
import xin.stdpain.pojo.User;
import xin.stdpain.service.FilesService;
import xin.stdpain.service.IUserService;
import xin.stdpain.service.LogsService;

@Controller
@RequestMapping("/user")
public class ServiceController {
	
	@Resource
	private IUserService userService;
	@Resource
	private LogsService logsService;
	@Resource
	private FilesService filesService;
	
	@RequestMapping("")
	public String login(HttpServletRequest request){
		return "login";
	}
	@RequestMapping("/Login")
	public String login(HttpServletRequest request,User user,Model model) {
		if(request.getSession().getAttribute("user")!=null)
			return "redirect:/index";
		Logs logs = new Logs();
		logs.setOptype("Login");
		logs.setAuthor(user.getUsername());
		logs.setTime(new Date());
		User auser = userService.getByName(user.getUsername());
		if(user.equals(auser)){
			request.getSession().setAttribute("user", auser.getUsername());
			model.addAttribute("ans", "Login as"+user.getUsername()+"Address:"+request.getRemoteAddr());
			
			List<Files> uploadedFiles = filesService.listFile();
			model.addAttribute("files", uploadedFiles);
			logs.setContent("LoginStatus:successful");
		}
		else{
			model.addAttribute("ans", "username or password is wrong");
			logs.setContent("LoginStatus:fail");
		}
		logsService.insertLog(logs);
		return "ans";
	}
	@RequestMapping("Logout")
	public String Logout(HttpServletRequest request){
		request.getSession().setAttribute("user", null);
		return "login";
	}
	@RequestMapping("/download")
	public String download(Integer id,final HttpServletResponse response) throws IOException{
		Files files = filesService.getFileById(id);
		System.out.println(files.getData());
		response.reset();  
		response.setHeader("Content-Disposition", "attachment; filename=\"" + files.getFilename() + "\"");  
		response.addHeader("Content-Length", "" + files.getData().length);
		response.setContentType("application/octet-stream;charset=UTF-8");  
		OutputStream outputStream = new BufferedOutputStream(response.getOutputStream());  
		outputStream.write(files.getData());
		outputStream.flush();  
		outputStream.close();
		return null;
	}
	@RequestMapping("upload")
	public String upload(HttpServletRequest request,
            @Valid Person p,
            BindingResult bindingResult,
            Model model,
            @RequestParam("photo") MultipartFile photeFile) throws IOException{
		
		Files files = new Files();
		
		files.setFilename(photeFile.getOriginalFilename());
		byte[] bufferbytes = new byte[(int) photeFile.getSize()];  
		photeFile.getInputStream().read(bufferbytes);
		
		files.setData(bufferbytes);
		
		files.setUploadtime(new Date());
		
		filesService.upload(files);
		return "redirect:/user/listfiles";
	}
	@RequestMapping("listfiles")
	public String listfiles(Model model){
		List<Files> uploadedFiles = filesService.listFile();
		model.addAttribute("files", uploadedFiles);
		return "ans";
	}
	
	
	@RequestMapping("deleteFiles")
	public String deleteFiles(Integer id){
		filesService.delFileById(id);
		return "redirect:/user/listfiles";
	}
	
	
}
