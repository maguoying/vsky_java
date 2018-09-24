package com.magy.spring.test;

import com.magy.spring.base.TeacherDAOproxy;
import com.magy.spring.dao.TeacherDAO;
import com.magy.spring.dao.impl.TeacherDAOImpl;

import junit.framework.TestCase;

public class TeacherDAOproxyTest extends TestCase {

	/**
	 * 动态代理测试
	 */
	public void testProxy() {
		TeacherDAO dao = new TeacherDAOImpl();
		TeacherDAOproxy proxy = new TeacherDAOproxy();
		dao = (TeacherDAO) proxy.bind(dao);
		dao.teach();
	}
}
