package com.magy.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.magy.spring.dto.MathTeacher;
import com.magy.spring.service.DIService;

import junit.framework.TestCase;

public class AbstractClassTest extends TestCase {

	/**
	 * 测试继承抽象类
	 */
	public void testAbstract() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("config/abstact-bean.xml");
		MathTeacher mt = (MathTeacher) ctx.getBean("mathTeacher");
		System.out.println(mt.getNumber());
		System.out.println(mt.getName());
		System.out.println(mt.getAge());
	}
	
	/**
	 *  测试scan方式扫描包下的注解标签注入
	 * <context:component-scan base-package="com.magy.spring.dto"></context:component-scan>
	 * ctx中包含student、teacher、mathTeacher，其中student就是注解注入的
	 * 
	 */
	public void testScan() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("config/abstact-bean.xml");
		for(String name : ctx.getBeanDefinitionNames()) {
			System.out.println(name);
		}
	}
	
	/**
	 * 用Resource注解方式在DIService中注入englishTeacher
	 */
	public void testResource() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("config/abstact-bean.xml");
		DIService dis = (DIService) ctx.getBean("diService");
		dis.getEnglishTeacher().teach();
	}
	
}
