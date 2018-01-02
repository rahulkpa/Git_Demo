package com.ikea.test;

public class Test {
	
	Test(String name,int age){
		System.out.println("This is argumented constructor...."+name+" Age: "+age);
	}
	Test(int age){
		System.out.println("This is argumented constructor...."+age);
	}
	
	public void help(String name) {
		System.out.println("Hello"+name+"!");
	}
	
}
