package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.UserDao;
import com.entity.User;
import com.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService 
{
	@Autowired
	private UserDao userDao;
	
	public User load(String id) {
		return null;
	}

	public User get(String id) {
		return null;
	}

	public List<User> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public void persist(User entity) {
		// TODO Auto-generated method stub

	}

	public String save(User user) {
		userDao.saveUser(user);
		return null;
	}

	public void saveOrUpdate(User entity) {
		// TODO Auto-generated method stub

	}

	public void delete(String id) {
		// TODO Auto-generated method stub

	}

	public void flush() {
		// TODO Auto-generated method stub

	}

}
