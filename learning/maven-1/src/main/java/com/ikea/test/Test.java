package com.ikea.test;

public class Test {
	private String gender;
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void help(String name) {
		System.out.println("Hello"+gender+name+"!");
	}
	
}
