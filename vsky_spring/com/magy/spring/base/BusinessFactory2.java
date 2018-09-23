package com.magy.spring.base;

import com.magy.spring.dao.StudentsDAO;
import com.magy.spring.dao.UsersDAO;
import com.magy.spring.dao.impl.StudentsDAOImpl;
import com.magy.spring.dao.impl.UsersDAOImpl;

/**
 * 静态工厂
 * @author maguoying@188.com
 * @date 2018年9月23日下午8:00:26
 */
public class BusinessFactory2 {

	public static StudentsDAO getStudentsDAOInstance() {
		return new StudentsDAOImpl();
	}
	public static UsersDAO getUsersDAOInstance() {
		return new UsersDAOImpl();
	}
}
