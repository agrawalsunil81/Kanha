package com.java.io.operation;

interface MathOpertaion{
	public Integer operation(Integer a, Integer b);
}
public class LamdaDemo {

	public static void main(String[] args) {
		MathOpertaion add = (a,b)->a+b;
		MathOpertaion sub = (a,b)->a-b;
		MathOpertaion mul = (a,b)->a*b;
		MathOpertaion div = (a,b)->a/b;
		MathOpertaion mod = (a,b)->a%b;
		System.out.println("Addition---->> "+add.operation(25, 10));
		System.out.println("Subtraction---->> "+sub.operation(25, 10));
		System.out.println("Multiplication---->> "+mul.operation(25, 10));
		System.out.println("Division---->> "+div.operation(25, 10));
		System.out.println("Mod---->> "+mod.operation(25, 10));
	}

}
