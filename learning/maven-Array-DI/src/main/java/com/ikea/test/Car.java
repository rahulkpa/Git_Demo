package com.ikea.test;

public class Car {
	
	private Engine engine[];
	
	private String carName[];

	
	
	public Engine[] getEngine() {
		return engine;
	}



	public void setEngine(Engine[] engine) {
		this.engine = engine;
	}



	public String[] getCarName() {
		return carName;
	}



	public void setCarName(String[] carName) {
		this.carName = carName;
	}



	public void print() {
	   for(int i=0;i<carName.length;i++) {
		   System.out.println("car name:  "+carName[i]+"  "+"model year:  "+engine[i].getModelYear());
	   }
	}

}
