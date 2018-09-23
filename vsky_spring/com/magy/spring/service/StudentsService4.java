package com.magy.spring.service;

import java.util.List;
import java.util.Map;

import com.magy.spring.dao.StudentsDAO;
import com.magy.spring.dto.Student;

/**
 * 静态工厂/实例工厂测试
 * 
 * @author maguoying@188.com
 * @date 2018年9月23日下午8:02:18
 */
public class StudentsService4 {
	private StudentsDAO sdao;
	private Student s;
	private List<String> cities;
	private Map<String, Integer> grades;
	
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

	public List<String> getCities() {
		return cities;
	}

	public void setCities(List<String> cities) {
		this.cities = cities;
	}
	
	public Map<String, Integer> getGrades() {
		return grades;
	}

	public void setGrades(Map<String, Integer> grades) {
		this.grades = grades;
	}

	public void save() {
		sdao.saveStudents(s);
	}
}
