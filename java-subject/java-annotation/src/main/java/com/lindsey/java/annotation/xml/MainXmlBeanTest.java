package com.lindsey.java.annotation.xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainXmlBeanTest {
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
		String[] names = applicationContext.getBeanDefinitionNames();
		for (String name : names) {
			System.out.println(name);
		}

	}
}
