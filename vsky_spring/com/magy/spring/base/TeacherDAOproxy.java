package com.magy.spring.base;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

public class TeacherDAOproxy implements MethodInterceptor {
	private Object obj;
	
	public Object bind(Object obj) {
		this.obj=obj;
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(obj.getClass());
		enhancer.setCallback(this);
		return enhancer.create();
	}
	public void preInvoke() {
		System.out.println("进入动态代理。。。");
	}

	@Override
	public Object intercept(Object obj, Method method, Object[] arg, MethodProxy proxy) throws Throwable {
		preInvoke();
		Object result = proxy.invokeSuper(obj, arg);
		return result;
	}

	
}
