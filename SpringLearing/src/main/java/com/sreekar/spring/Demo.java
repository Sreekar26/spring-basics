package com.sreekar.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext config= new AnnotationConfigApplicationContext(AppConfig.class);

		WindowsOS win = config.getBean(WindowsOS.class);

		win.specification();
		
		config.close();

	}

}
