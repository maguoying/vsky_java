package com.magy.spring.base;

import com.magy.spring.dao.StudentsDAO;
import com.magy.spring.dao.UsersDAO;
import com.magy.spring.dao.impl.StudentsDAOImpl;
import com.magy.spring.dao.impl.UsersDAOImpl;

/**
 * 工厂模式中的实例注入：与静态模式的区别是少了static
 * @author maguoying@188.com
 * @date 2018年9月23日下午8:00:26
 */
public class BusinessFactory3 {

	public StudentsDAO getStudentsDAOInstance() {
		return new StudentsDAOImpl();
	}
	public UsersDAO getUsersDAOInstance() {
		return new UsersDAOImpl();
	}
}
