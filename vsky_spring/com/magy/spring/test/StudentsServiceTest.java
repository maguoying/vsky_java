package com.magy.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.magy.spring.dto.Student;
import com.magy.spring.service.StudentsService;
import com.magy.spring.service.StudentsService2;
import com.magy.spring.service.StudentsService3;

import junit.framework.TestCase;

public class StudentsServiceTest extends TestCase {

	/**
	 * setter方法测试
	 */
	public void testSetter() {
		Student s = new Student(007, "张三丰", "男");
		ApplicationContext ctx = new ClassPathXmlApplicationContext("application-context.xml");
		StudentsService service = (StudentsService) ctx.getBean("studentsService");
		service.service(s);
	}
	
	/**
	 * 构造器注入测试
	 */
	public void testConstructor() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("application-context.xml");
		StudentsService2 service = (StudentsService2) ctx.getBean("studentsService2");
		service.service();
	}
	
	/**
	 * 注解方法注入测试
	 */
	public void testAnnotation() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("application-context.xml");
		StudentsService3 service = (StudentsService3) ctx.getBean("studentsService3");
		service.service();
	}
}
