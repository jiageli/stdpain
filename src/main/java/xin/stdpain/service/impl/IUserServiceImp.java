package xin.stdpain.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import xin.stdpain.dao.*;
import xin.stdpain.pojo.*;
import xin.stdpain.service.*;
@Service("userService")
public class IUserServiceImp implements IUserService{
	@Resource
	private UserMapper userDao;

	@Override
	public List<User> findAll() {
		return userDao.findAll();
	}
	@Override
	public User getByName(String name){
		return userDao.getByName(name);
	}
	@Override
	public int deleteByName(String name) {
		return userDao.deleteByName(name);
	}
	@Override
	public int updateByKey(User user) {
		return userDao.updateByKey(user);
	}
	@Override
	public int insert(User user) {
		return userDao.insert(user);
	}
}
