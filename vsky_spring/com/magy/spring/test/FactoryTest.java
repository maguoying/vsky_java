package com.magy.spring.test;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.magy.spring.service.StudentsService4;
import com.magy.spring.service.UsersService;

import junit.framework.TestCase;

/**
 * 测试工程模式
 * @author maguoying@188.com
 * @date 2018年9月23日下午7:48:38
 */
public class FactoryTest extends TestCase {

	public void testUser() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-factory.xml");
		UsersService usersService = (UsersService) ctx.getBean("usersService");
		usersService.save();
	}
	
	public void testStudent() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-factory.xml");
		StudentsService4 usersService = (StudentsService4) ctx.getBean("studentsService");
		usersService.save();
	}
	
	public void testFactoryInstanceStudent() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-factory.xml");
		StudentsService4 usersService = (StudentsService4) ctx.getBean("studentsInstanceService");
		usersService.save();
	}
	
	public void testFactoryInstanceUser() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-factory.xml");
		UsersService usersService = (UsersService) ctx.getBean("usersInstanceService");
		usersService.save();
	}
	
	public void testContainer() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-factory.xml");
		StudentsService4 usersService = (StudentsService4) ctx.getBean("studentsInstanceService");
		Iterator i = usersService.getCities().iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("=========================================");
		Set<Entry<String, Integer>> entrys = usersService.getGrades().entrySet();
		for(Entry<String, Integer> entry : entrys) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
	}
}
