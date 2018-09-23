package com.magy.spring.dao.impl;

import com.magy.spring.dao.StudentsDAO;
import com.magy.spring.dto.Student;

public class StudentsDAOimpl implements StudentsDAO {

	@Override
	public void saveStudents(Student s) {
		System.out.println("保存成功，学生信息：");
		System.out.print("编号:" + s.getId() + " ");
		System.out.print("姓名:" + s.getName() + " ");
		System.out.println("性别:" + s.getSex());
	}

}
