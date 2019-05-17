package com.java.io.operation;

public class Singleton1 {
	
	private volatile static Singleton1 INSTANCE;
	
	private Singleton1() {
		
	}	
	
	public static Singleton1 getInstance() {
		if(INSTANCE == null) {
			synchronized (Singleton1.class) {
				if(INSTANCE == null) {
					return new Singleton1();
				}
			}
		}
		return INSTANCE;
	}
}