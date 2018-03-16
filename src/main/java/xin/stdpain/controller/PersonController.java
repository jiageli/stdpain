package xin.stdpain.controller;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import xin.stdpain.domain.Person;
import xin.stdpain.service.PersonService;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * Created by 维C果糖 on 2017/1/26.
 */

@Controller
public class PersonController {
    @Resource
    PersonService ps;    // 注入 service 层

    @RequestMapping(value = "/person/all")
    public String findAll(Map<String,Object> model){     // 声明 model 用来传递数据
        List<Person> personList = ps.findAll();
        model.put("personList",personList);           // 通过这一步，JSP 页面就可以访问 personList
        //model.put("wan", "FHA");
        System.out.println("personList "+personList);
        return "/person/list";                    // 跳转到 jPersonList 页面
    }
   
    @RequestMapping("/person/toCreatePersonInfo")
    public String toCteatePersonInfo(){  // 跳转新增页面
        return "/person/create";
    }
   
    @RequestMapping("/person/updatePersonList")
    public String updatePersonList(HttpServletRequest request,
                                   @Valid Person p,
                                   BindingResult bindingResult,
                                   Model model,
                                   @RequestParam("photo") MultipartFile photeFile) throws IOException {  // 更新人员信息
        if (p.getId() == null) {
            ps.insert(p);   // 调用 Service 层方法，插入数据
        } else {
        	
        	System.out.println(p);
            if(bindingResult.hasErrors()){          // 判断校验是否发现错误
            	System.out.println("Wrong");
                model.addAttribute("bindingResult", bindingResult);
                model.addAttribute("p",p);
                return "/person/update";     // 校验错误，返回错误页面，进行错误提示
            }
            String dir = request.getSession().getServletContext().getRealPath("/") + "/upload/";
            String fileName = photeFile.getOriginalFilename();                  // 原始的文件名
            String extName = fileName.substring(fileName.lastIndexOf("."));     // 扩展名
            fileName = fileName.substring(0, fileName.lastIndexOf(".")) + System.nanoTime() + extName;     // 防止文件名冲突
            FileUtils.writeByteArrayToFile(new File(dir + fileName), photeFile.getBytes());                // 写文件到 upload 目录

            p.setPhotoPath("/upload/" + fileName);

            ps.update(p);   // 调用 Service 层方法，更新数据
        }
        return "redirect:/person/all.action";        // 转向人员列表 action
    }


    @RequestMapping("/person/toUpdatePersonInfo")
    public String toUpdatePersonInfo(Integer id, Model model) {  // 跳转修改页面
        Person p = ps.get(id);             // 获得要修改的记录，重新设置页面的值
        model.addAttribute("p", p);         // 将数据放到 response
        return "/person/update";
    }

    @RequestMapping("/person/deleteById")
    public String deleteById(Integer id){  // 删除单条记录
        ps.deleteById(id);
        return "redirect:/person/all.action";        // 转向人员列表 action
    }

    @RequestMapping("/person/deleteMuch")
    public String deleteMuch(@RequestParam("id") Integer[] ids){  // 批量删除记录
        for (Integer delId : ids){
            ps.deleteById(delId);
        }
        return "redirect:/person/all.action";        // 转向人员列表 action
    }

}
