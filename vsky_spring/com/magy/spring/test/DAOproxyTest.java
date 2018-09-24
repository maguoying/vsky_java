package com.magy.spring.test;

import com.magy.spring.base.StudentsDAOproxy;
import com.magy.spring.base.TeacherDAOproxy;
import com.magy.spring.dao.StudentsDAO;
import com.magy.spring.dao.TeacherDAO;
import com.magy.spring.dao.impl.StudentsDAOImpl;
import com.magy.spring.dao.impl.TeacherDAOImpl;
import com.magy.spring.dto.Student;

import junit.framework.TestCase;

public class DAOproxyTest extends TestCase {

	/**
	 * 动态代理测试
	 */
	public void testProxy() {
		Student s = new Student(2, "张三丰", "男");
		StudentsDAO dao = new StudentsDAOImpl();
		StudentsDAOproxy proxy = new StudentsDAOproxy();
		dao = (StudentsDAO) proxy.bind(dao);
		dao.saveStudents(s);
	}
	
	/**
	 * Cglib代理测试
	 */
	public void testCglib() {
		TeacherDAO dao = new TeacherDAOImpl();
		TeacherDAOproxy proxy = new TeacherDAOproxy();
		dao = (TeacherDAO) proxy.bind(dao);
		dao.teach();
	}
}
