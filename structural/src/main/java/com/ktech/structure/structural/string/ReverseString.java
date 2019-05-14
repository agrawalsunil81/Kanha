package com.ktech.structure.structural.string;

public class ReverseString {

	public static void main(String[] args) {
		String str = "this is my demo program";
		ReverseString reverseString = new ReverseString();		
		System.out.println(reverseString.getReverseStringSB(str));
		
		char[] ch = str.toCharArray();
		reverseString.getReverseStringIndex(ch,0,str.length()-1);
		reverseString.printArray(ch);
		
		System.out.println();
		reverseString.getReverseStringRecursion(ch,0,str.length()-1);
		reverseString.printArray(ch);

	}
	
	
	/**
	 * Using String Buffer
	 */
	
	private  String getReverseStringSB(String str) {
		StringBuffer sb = new StringBuffer(str);		
		return sb.reverse().toString();
	}
	
	/**
	 *  using index
	 */
	
	private  void getReverseStringIndex(char[] ch, int start, int end) {
		char temp;		
		while(start < end) {
			temp = ch[start];
			ch[start]=ch[end];
			ch[end]=temp;
			start++;
			end--;
		}
	}
	
	/**
	 *  using Reursion
	 */

	private  void getReverseStringRecursion(char[] ch, int start, int end) {
		char temp;		
		if(start < end) 
			return; 
		temp = ch[start];
		ch[start]=ch[end];
		ch[end]=temp;
		getReverseStringRecursion(ch, start+1, end-1);
	}
	
	/**
	 * print array
	 */
	
	private void printArray(char[] ch) {
		for (int i = 0; i < ch.length; i++) {
			char c = ch[i];
			System.out.print(c);
		}
	}
}
