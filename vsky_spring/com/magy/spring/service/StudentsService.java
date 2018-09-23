package com.magy.spring.service;

import com.magy.spring.dao.StudentsDAO;
import com.magy.spring.dto.Student;

/**
 * set方法注入测试
 * 
 * @author maguoying@188.com
 * @date 2018年9月23日下午12:07:00
 */
public class StudentsService {

	private StudentsDAO sdao;

	public void setSdao(StudentsDAO sdao) {
		this.sdao = sdao;
	}

	public void service(Student s) {
		sdao.saveStudents(s);
	}
}
