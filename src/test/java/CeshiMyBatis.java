import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import xin.stdpain.pojo.Files;
import xin.stdpain.pojo.Logs;
import xin.stdpain.pojo.Task;
import xin.stdpain.pojo.User;
import xin.stdpain.service.*;

import java.io.IOException;
import java.util.Date;

import javax.annotation.Resource;

/**
 */
@RunWith(SpringJUnit4ClassRunner.class)		//表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:beans.xml"})
public class CeshiMyBatis {
	@Resource
	private IUserService userService;
	@Resource
	private FilesService fileService;
	@Resource
	private LogsService logsService;
	@Resource
	private TaskService taskService;
	
    @Test
    public void ceshi() throws IOException {
//    	for(User user : userService.findAll()){
//    		//System.out.println(user);
//    	}
//       System.out.println();
//       System.out.println(userService.getByName(""));

//    	Files files = new Files();
//    	files.setFilename("ans222");
//    	byte[]bytes = new byte[2];
//    	bytes[0]=1;
//    	bytes[1]=2;
//    	files.setData(bytes);
//    	fileService.upload(files);
    	
//    	userService.deleteByName("admin2");
    	
//    	User user = new User();
//    	user.setId(2);
//    	user.setUsername("admin");
//    	user.setPassword("pass");
//    	user.setType("admin");
//    	
//    	java.util.Date date = new java.util.Date();
//    	userService.updateByKey(user);
//    	user.setCreatedTime(date);
//    	userService.insert(user);

//    	Logs log = new Logs();
//    	log.setAuthor("Feng");
//    	log.setContent("wan");
//    	log.setOptype("insert");
//    	log.setTime(new Date());
//    	
//    	logsService.insertLog(log);
//    	for(Logs alog:logsService.listAll()){
//    		System.out.println(alog);
//    	}
    	System.out.println();
//    	Task task = new Task();
//    	task.setStartTime(new Date());
//    	task.setEndTime(new Date());
//    	task.setTitle("ans");
//    	task.setFrom("public");
//    	taskService.insert(task);
    	
//    	for(Task atask:taskService.listPublic()){
//    		System.out.println(atask);
//    	}
    	
//    	for(Files files1 :fileService.listFile()){
//    		System.out.println(files1.getFilename());
//    	}
//    	
//    	System.out.println(fileService.getFileById(4));
//    	
//    	System.out.println(fileService.delFileById(4));
//    	
//    	System.out.println(fileService.getFileById(4));
    	
    	System.out.println(fileService.getFileById(5).getData());
    	
    }
}