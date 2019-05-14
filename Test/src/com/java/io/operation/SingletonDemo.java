package com.java.io.operation;

public class SingletonDemo {

	public static void main(String[] args) {
		Singleton singleton = Singleton.INSTANCE; 
		Singleton singleton1 = Singleton.INSTANCE; 
		
		System.out.println(singleton.getValue());
		singleton1.setValue(3);
		System.out.println(singleton.getValue());
		System.out.println(singleton1.getValue());
		singleton.setValue(2);
		System.out.println(singleton.getValue());
		System.out.println(singleton1.getValue());
	}

}
