package com.java.io.operation;

public class MyThread {

	public static void main(String[] args) {

		Runnable r = ()->{
			
			for(int i =0;i<10;i++) {
				System.out.println("Child Tread!!!");
			}
		};
		
		Thread t = new Thread(r);
		t.start();

		for(int i =0;i<10;i++) {
			System.out.println("Main Tread!!!");
		}
		
	}

}
