package com.java.io.operation;

public class StringRecursiveReversal {

	 String reverse = "";
	 
	public static void main(String[] args) {
		StringRecursiveReversal srr = new StringRecursiveReversal();
        System.out.println("Result: "+srr.reverseString("Java2novice"));
	}

	private String reverseString(String str) {
		if(str.length() == 1){
            return str;
        } else {
            reverse += str.charAt(str.length()-1)
                    +reverseString(str.substring(0,str.length()-1));
            return reverse;
        }
	}

}