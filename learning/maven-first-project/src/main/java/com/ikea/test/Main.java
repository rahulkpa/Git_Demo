package com.ikea.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
 public static void main(String ordp[]) {
	 ApplicationContext ac = new ClassPathXmlApplicationContext("Spring-dispatcher.xml");
	 Test t = (Test) ac.getBean("test");
	 t.help();
 }
 
}
