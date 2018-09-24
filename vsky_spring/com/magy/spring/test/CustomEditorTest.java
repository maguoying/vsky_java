package com.magy.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.magy.spring.dto.Student;

import junit.framework.TestCase;

public class CustomEditorTest extends TestCase {

	public void testDateConverter() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("config/date-format.xml");
		Student student1 = (Student) ctx.getBean("student");
		System.out.println(student1.getName());
		System.out.println(student1.getBirthdate());
		Student student2 = (Student) ctx.getBean("student");
		System.out.println(student1 == student2);
	}
	
	/**
	 * 没有指定name或者ID的用类名#[编号]来访问
	 */
	public void testName() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("config/date-format.xml");
		Student student1 = (Student) ctx.getBean("com.magy.spring.dto.Student");
		System.out.println(student1.getName());
		Student student2 = (Student) ctx.getBean("com.magy.spring.dto.Student#1");
		System.out.println(student2.getName());
		Student student3 = (Student) ctx.getBean("com.magy.spring.dto.Student#2");
		System.out.println(student3.getName());
		
	}
}
