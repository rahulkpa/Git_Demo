package com.ikea.test;

public class Car {
	
	private Engine engine;
	
	private String carName;

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	public void print() {
		System.out.println("Car Name: "+carName+" "+"engine Model Year: "+engine.getModelYear());
	}

}
