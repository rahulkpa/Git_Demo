package com.ikea.test;

import org.springframework.beans.factory.annotation.Required;

public class Car {
    
	private String car;
	private Engine engine;
	public String getCar() {
		return car;
	}
	
	@Required
	public void setCar(String car) {
		this.car = car;
	}
	public Engine getEngine() {
		return engine;
	}
	
	@Required
	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public void printData() {
		System.out.println("Car name: "+car+"   "+"model year"+engine.getModelYear());
	}
}
