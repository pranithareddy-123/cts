package com.cts.project;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"Spring-Module.xml");

		Helloworld obj = (Helloworld) context.getBean("helloBean");
		obj.printHello();
	}
	}


