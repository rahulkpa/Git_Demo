package com.ikea.Test;

public class Car {
	
	private Engine engine;
	
	//if in bean element, autowire = "constructor" then only default 
	// constructor should be defined then only object will be created
	
	
	//Concept:- default Autowire always choose default constructor to create object
	//while constructor prefer parametrized constructor to create bean
	Car(){
		System.out.println("Default Constructor");
	}
	
	Car(Engine e){
		this.engine = e;
		System.out.println("Parametrized Constructor");
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	
	public void printData(){
		System.out.println("model year: "+engine.getModelYears());
	}

}
