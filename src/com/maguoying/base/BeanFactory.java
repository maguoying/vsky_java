package com.maguoying.base;

public class BeanFactory {
	public static Object getBean(String beanName) {
		try {
			return Class.forName(beanName).getDeclaredConstructor().newInstance();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
