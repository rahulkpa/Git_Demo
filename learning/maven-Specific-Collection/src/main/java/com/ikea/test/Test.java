package com.ikea.test;

import java.util.Hashtable;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

public class Test {
	
	private Vector<String> fruits;
	
	private TreeSet<String> cricketers;
	
	private Hashtable<String,String> cc;

	
	

	public Vector<String> getFruits() {
		return fruits;
	}




	public void setFruits(Vector<String> fruits) {
		this.fruits = fruits;
	}




	public TreeSet<String> getCricketers() {
		return cricketers;
	}




	public void setCricketers(TreeSet<String> cricketers) {
		this.cricketers = cricketers;
	}




	public Hashtable<String, String> getCc() {
		return cc;
	}




	public void setCc(Hashtable<String,String> cc) {
		this.cc = cc;
	}




	public void print() {
		System.out.println("***************List of fruits*********************");
	   for(Object obj:fruits) {
		   System.out.println(obj.toString());
	   }
	   
	   System.out.println("***************List of Cricketers*********************");
	   for(Object obj:cricketers) {
		   System.out.println(obj.toString());
	   }
	   
	   System.out.println("***********Country and their Capitals*********");
	   
	   Set<String> keys = cc.keySet();
	   for(Object key: keys) {
		   System.out.println("Country: : "+key+":::"+"Capitals: "+cc.get(key));
	   }
	   
	}

}
