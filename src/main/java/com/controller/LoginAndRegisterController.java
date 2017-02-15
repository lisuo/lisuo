package com.controller;

import java.io.IOException;


import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.common.PasswordUtil;
import com.dao.UserDao;
import com.entity.User;
import com.service.UserService;

@RestController
@RequestMapping("/loginAndRegister")
public class LoginAndRegisterController 
{
	private static Logger log = Logger.getLogger(
			LoginAndRegisterController.class.getName());
	@Autowired
	private UserService userService;
	
	//@RequestParam
	@RequestMapping(value = "/register", method=RequestMethod.POST)
	
	public @ResponseBody String register(@RequestParam String email, String userName, String password)
	{
		
		log.info("用户 " + userName + "正在注册.");
		User user = new User();
		user.setName(userName);
		//xxxx为前台生成的随机数，后台从session中取得
		user.setPassword(password);
		user.setEmail(email);
		
		userService.save(user);
		return "success";
	}
	
	@RequestMapping(value = "/login", method=RequestMethod.POST)
	public @ResponseBody String register(String userName, String password)
	{
		
		log.info("用户 " + userName + "正在登录.");
		User user = UserDao.get
		user.setName(userName);
		try {
			user.setPassword(PasswordUtil.encrypt(password, "xxxx", PasswordUtil.getSalt()));
		} catch (Exception e) {
			log.error("用户密码加密出错..." + e);
		}
		
		//userService.save(user);
		return "success";
	}
	@RequestMapping(value = "/ls")
	public String register()
	{
		
		
		return "success";
	}
}
