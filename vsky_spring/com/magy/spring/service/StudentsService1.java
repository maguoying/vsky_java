package com.magy.spring.service;

import com.magy.spring.dao.StudentsDAO;
import com.magy.spring.dto.Student;
/**
 * 构造器注入测试
 * 
 * @author maguoying@188.com
 * @date 2018年9月23日下午12:06:03
 */
public class StudentsService1 {
	private StudentsDAO sdao;
	private Student s;

	public void setSdao(StudentsDAO sdao) {
		this.sdao = sdao;
	}

	public void setS(Student s) {
		this.s = s;
	}

	public StudentsService1(StudentsDAO sDao, Student s) {
		super();
		this.sdao = sDao;
		this.s = s;
	}

	public void service() {
		sdao.saveStudents(s);
	}
	
	public StudentsService1() {
		super();
	}
	
}
