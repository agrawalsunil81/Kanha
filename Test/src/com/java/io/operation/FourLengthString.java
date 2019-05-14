package com.java.io.operation;

public class FourLengthString {

	public static void main(String[] args) {
		String str = "AAAABBBBBCCCCCDDDDAAAABBBB";
		for(int i =0; i < str.length()-1;i++) {
			int count =1;
			while(i < str.length()-1 && str.charAt(i) == str.charAt(i+1)) {
				count++;
				i++;
			}
			
			System.out.print(count);
			System.out.print(str.charAt(i));
		}

	}

}
