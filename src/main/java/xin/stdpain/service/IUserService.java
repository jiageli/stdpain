package xin.stdpain.service;

import java.util.List;

import xin.stdpain.pojo.User;

public interface IUserService {
	public List<User> findAll();
	public User getByName(String name);
	public int deleteByName(String name);
	public int updateByKey(User user);
	public int insert(User user);
}