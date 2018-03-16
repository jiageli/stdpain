package xin.stdpain.service;

import java.util.List;

import xin.stdpain.pojo.Task;

public interface TaskService {
	public int insert(Task task);
	public List<Task> listPublic();
}
