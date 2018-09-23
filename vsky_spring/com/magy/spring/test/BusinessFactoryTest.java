package com.magy.spring.test;

import com.magy.spring.base.BusinessFactory;
import com.magy.spring.dao.StudentsDAO;
import com.magy.spring.dao.UsersDAO;
import com.magy.spring.dto.Student;
import com.magy.spring.dto.User;

import junit.framework.TestCase;

/**
 * 测试工程模式
 * @author maguoying@188.com
 * @date 2018年9月23日下午7:48:38
 */
public class BusinessFactoryTest extends TestCase {

	public void testFactoryModUser() {
		User user= new User("admin", "123456");
		BusinessFactory factory = new BusinessFactory();
		UsersDAO userdao = (UsersDAO) factory.getInstance(UsersDAO.class.getName());
		userdao.saveUser(user);
	}
	public void testFactoryModStudent() {
		Student s = new Student(11, "张三丰", "男");
		BusinessFactory factory = new BusinessFactory();
		StudentsDAO userdao = (StudentsDAO) factory.getInstance(StudentsDAO.class.getName());
		userdao.saveStudents(s);
	}
	
}
