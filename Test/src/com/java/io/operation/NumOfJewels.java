package com.java.io.operation;

public class NumOfJewels {

	public static void main(String[] args) {
		String k = "aA", S = "aAAbbbb";
		int count=0;
		char[] c = k.toCharArray();
		for(int i=0;i<c.length;i++) {
			char[] c2 = S.toCharArray();
			for(int j=0;j<c2.length;j++) {
				if(c[i] == c2[j]) {
					count = count + 1; 
				}
			}
			
		}
		
		System.out.println(count);
		

	}

}
