package com.magy.spring.test;

import com.magy.spring.base.BeanFactory;
import com.magy.spring.service.Disk;

import junit.framework.TestCase;
/**
 * testRead()和testRead()测试IoC，testBeanFactory()测试工厂模式
 * @author maguoying@188.com
 * @date 2018年9月22日下午2:15:59
 */
public class DiskTest extends TestCase {
	private Disk disk;
	
	public void setDisk(Disk disk) {
		this.disk = disk;
	}

	public void testRead() {
//		ApplicationContext ctx = new ClassPathXmlApplicationContext("application-context.xml");
//		Disk disk = (Disk) ctx.getBean("movedisk");
		disk.read();
	}
	
	public void testWrite() {
//		ApplicationContext ctx = new ClassPathXmlApplicationContext("application-context.xml");
//		Disk disk = (Disk) ctx.getBean("usbdisk");
		disk.write("vsky");
	}
	
	public void testBeanFactory() {
		Disk disk = (Disk) BeanFactory.getBean("com.magy.spring.service.MoveDisk");
		disk.read();
	}
}
