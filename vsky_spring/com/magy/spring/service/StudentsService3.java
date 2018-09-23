package com.magy.spring.service;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.magy.spring.dao.StudentsDAO;
import com.magy.spring.dto.Student;
/**
 *  构造器注入测试：如果没有指定name或者Qualifier的话，会按类型去匹配，有多个类型匹配到的话报错，需要指定名字
 * 
 * @author maguoying@188.com
 * @date 2018年9月23日下午12:06:03
 */
public class StudentsService3 {
//	@Resource
//	private StudentsDAO sDao;
	@Autowired
	private StudentsDAO sDao;
	
	@Resource(name="student1")
	private Student s1;
	
	@Autowired
	@Qualifier("student2")
	private Student s2;

	public void service() {
		sDao.saveStudents(s1);
		sDao.saveStudents(s2);
	}
}
