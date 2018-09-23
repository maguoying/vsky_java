package com.magy.spring.service;

import com.magy.spring.dao.StudentsDAO;
import com.magy.spring.dto.Student;
/**
 * 构造器注入测试
 * 
 * @author maguoying@188.com
 * @date 2018年9月23日下午12:06:03
 */
public class StudentsService2 {
	private StudentsDAO sDao;
	private Student s;

	public StudentsService2(StudentsDAO sDao, Student s) {
		super();
		this.sDao = sDao;
		this.s = s;
	}

	public void service() {
		sDao.saveStudents(s);
	}
}
