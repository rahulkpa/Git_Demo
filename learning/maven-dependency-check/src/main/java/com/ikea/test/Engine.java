package com.ikea.test;

import org.springframework.beans.factory.annotation.Required;

public class Engine {

	private String modelYear;

	public String getModelYear() {
		return modelYear;
	}
    @Required
	public void setModelYear(String modelYear) {
		this.modelYear = modelYear;
	}
	
}
