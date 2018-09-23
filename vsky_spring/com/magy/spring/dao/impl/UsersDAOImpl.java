package com.magy.spring.dao.impl;

import com.magy.spring.dao.UsersDAO;
import com.magy.spring.dto.User;

public class UsersDAOImpl implements UsersDAO {

	@Override
	public void saveUser(User user) {
		System.out.println("登录成功");
		System.out.println("用户名：" + user.getUsername() + " " + "密码：" + user.getPassword());
	}

}
