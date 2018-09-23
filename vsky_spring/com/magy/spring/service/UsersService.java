package com.magy.spring.service;

import com.magy.spring.dao.UsersDAO;
import com.magy.spring.dto.User;

public class UsersService {

	private UsersDAO udao;
	private User u;
	public UsersDAO getUdao() {
		return udao;
	}
	public void setUdao(UsersDAO udao) {
		this.udao = udao;
	}
	public User getU() {
		return u;
	}
	public void setU(User u) {
		this.u = u;
	}
	
	public void save() {
		udao.saveUser(u);
	}
}
