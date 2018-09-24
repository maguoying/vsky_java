package com.magy.spring.dao.impl;

import com.magy.spring.dao.TeacherDAO;

public class TeacherDAOImpl implements TeacherDAO {

	@Override
	public void teach() {
		System.out.println("开始上课");
	}

}
