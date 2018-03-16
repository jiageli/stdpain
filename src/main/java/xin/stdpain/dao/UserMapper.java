package xin.stdpain.dao;

import java.util.List;

import xin.stdpain.pojo.User;


public interface UserMapper {
	public List<User> findAll();
	public User getByName(String username);
	public int deleteByName(String username);
	public int updateByKey(User user);
	public int insert(User user);
}