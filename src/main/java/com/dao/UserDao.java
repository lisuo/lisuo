package com.dao;

import com.entity.User;

public interface UserDao 
{
	void saveUser(User user);
	void getUser(String userName);
}
