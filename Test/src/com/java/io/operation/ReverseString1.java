package com.java.io.operation;

//Requirements: reverse the input string by using recursion.
public class ReverseString1 {

	public static void main(String[] args) {
		ReverseString1 reverseString = new ReverseString1();
		String str = "This is American Express";
		reverseString.reverseString(str);
	}

	private void reverseString(String str) {

		int length = str.length();
		if (str == null || (length <= 1)) {
			System.out.print(str);
		} else {
			System.out.print(str.charAt(length - 1));
			reverseString(str.substring(0, length - 1));
		}
	}

}
