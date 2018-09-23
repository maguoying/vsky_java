package com.magy.spring.base;

import com.magy.spring.dao.impl.StudentsDAOImpl;
import com.magy.spring.dao.impl.UsersDAOImpl;
/**
 * 工厂类测试：根据类名
 * @author maguoying@188.com
 * @date 2018年9月23日下午8:00:02
 */
public class BusinessFactory {

	public Object getInstance(String clazz) {
		if(clazz.equals("com.magy.spring.dao.UsersDAO")) {
			return new UsersDAOImpl();
		} else if(clazz.equals("com.magy.spring.dao.StudentsDAO")) {
			return new StudentsDAOImpl();
		}
		return null;
	}
}
