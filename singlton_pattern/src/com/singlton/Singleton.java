package com.singlton;

public class Singleton {
	
	private static Singleton sin;
	
	private Singleton(){};
	
	public static synchronized  Singleton getInstance() {
		
		if(sin==null) {
			sin=new Singleton();
			return sin;
		}
		return sin;
			
	}; 
	
	public void connection() {
		
		System.out.println("Reading database");
	}
	

}
