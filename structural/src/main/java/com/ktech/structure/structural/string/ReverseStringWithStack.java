package com.ktech.structure.structural;

import java.util.Stack;

public class ReverseStringWithStack {

	public static void main(String[] args) {
		String str  = "This is my first program";
		Stack<Character> stack = new Stack<Character>(); 
		for (int i = 0; i < str.length(); i++) {
			stack.push(str.charAt(i));			
		}
		for (int i = 0; i < str.length(); i++) {
			System.out.print(stack.pop());			
		}
		

	}

}
