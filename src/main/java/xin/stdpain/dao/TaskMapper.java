package xin.stdpain.dao;

import java.util.List;

import xin.stdpain.pojo.Task;

public interface TaskMapper {
	public int insert(Task task);
	public List<Task>listPublic();
}
