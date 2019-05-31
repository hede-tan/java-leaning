package com.lindsey.java.annotation.configuration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainConfigurationTest {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				BeanConfig.class);
		String[] names = applicationContext.getBeanDefinitionNames();
		for (String name : names) {
			System.out.println(name);
		}
	}
}
