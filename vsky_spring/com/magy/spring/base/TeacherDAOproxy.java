package com.magy.spring.base;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class TeacherDAOproxy implements InvocationHandler {
	private Object obj;
	
	public Object bind(Object obj) {
		this.obj=obj;
		obj = Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), this);
		return obj;
	}
	public void preInvoke() {
		System.out.println("进入动态代理。。。");
	}

	@Override
	public Object invoke(Object obj, Method method, Object[] arg2) throws Throwable {
		preInvoke();
		Object result = method.invoke(this.obj, arg2);
		return result;
	}

	
}
