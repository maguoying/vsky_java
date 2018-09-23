package com.magy.spring.service;

import com.magy.spring.dao.StudentsDAO;
import com.magy.spring.dto.Student;

/**
 * 静态工厂测试
 * @author maguoying@188.com
 * @date 2018年9月23日下午8:02:18
 */
public class StudentsService4 {
	private StudentsDAO sdao;
	private Student s;
	public StudentsDAO getSdao() {
		return sdao;
	}
	public void setSdao(StudentsDAO sdao) {
		this.sdao = sdao;
	}
	public Student getS() {
		return s;
	}
	public void setS(Student s) {
		this.s = s;
	}
	
	public void save() {
		sdao.saveStudents(s);
	}
}
