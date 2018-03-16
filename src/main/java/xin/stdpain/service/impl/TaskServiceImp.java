package xin.stdpain.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import xin.stdpain.dao.TaskMapper;
import xin.stdpain.pojo.Task;
import xin.stdpain.service.TaskService;
@Service("taskService")
public class TaskServiceImp implements TaskService{

	@Resource
	private TaskMapper taskDao;
	
	@Override
	public int insert(Task task) {
		return taskDao.insert(task);
	}

	@Override
	public List<Task> listPublic() {
		return taskDao.listPublic();
	}

}
