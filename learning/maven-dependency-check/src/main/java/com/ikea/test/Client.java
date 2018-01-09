package com.ikea.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("Spring-dispatcher.xml");
		Car c = (Car)ac.getBean("c");
		c.printData();
	}

}
