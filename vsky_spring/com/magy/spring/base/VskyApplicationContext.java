package com.magy.spring.base;

import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.input.SAXBuilder;

/**
 * 创建自己的BeanFactory
 * @author maguoying@188.com
 * @date 2018年9月23日下午1:43:18
 */
public class VskyApplicationContext {
	Map<String, Object> beans = new HashMap<String, Object>();
	public VskyApplicationContext(String xmlName) throws Exception {
		
		SAXBuilder builder = new SAXBuilder();
		InputStream input = this.getClass().getClassLoader().getResourceAsStream(xmlName);
		Document doc = builder.build(input);//获取文档对象
		Element root = doc.getRootElement();//获取根元素
		List<Element> beanlist = root.getChildren();//获取所有名字为bean的元素
		for(Element e : beanlist) {
			if(!"bean".equals(e.getName())) {
				continue;
			}
			String id = e.getAttributeValue("id");
			String clazz = e.getAttributeValue("class");
			Object o = Class.forName(clazz).getConstructor().newInstance();
			beans.put(id, o);
			for(Element pe : e.getChildren()) {
				if(!"property".equals(pe.getName())) {
					continue;
				}
				String name = pe.getAttributeValue("name");
				String ref = pe.getAttributeValue("ref");
				Object po = beans.get(ref);
				String methodName = "set" + name.substring(0, 1).toUpperCase() + name.substring(1);
				Method m;
				if(name.contains("dao")) {
					m = o.getClass().getMethod(methodName, po.getClass().getInterfaces()[0]);
				} else {
					m = o.getClass().getMethod(methodName, po.getClass());
				}
				m.invoke(o, po);
			}
		}
	}
	public Object getBean(String beanName) {
		return beans.get(beanName);
	}
}
