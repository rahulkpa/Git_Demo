package com.ikea.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Car {

	@Autowired
	@Qualifier(value="e1")
	private Engine engine;

	public void printData(){
		System.out.println("model year: "+engine.getModelYears());
	}

}
