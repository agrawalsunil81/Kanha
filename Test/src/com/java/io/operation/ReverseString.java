package com.java.io.operation;

public class ReverseString {

	public static void main(String[] args) {
		String input = "GeeksforGeeks";
		
		byte [] strAsByteArray = input.getBytes(); 
		byte [] result = new byte [strAsByteArray.length];   
        for (int i = 0; i<strAsByteArray.length; i++) 
            result[i] = strAsByteArray[strAsByteArray.length-i-1];  
        System.out.println(new String(result)); 
        
        StringBuilder input1 = new StringBuilder();         
        input1.append(input);   
        input1 = input1.reverse();  
        System.out.println(input1); 

        char[] try1 = input.toCharArray();        
        for (int i = try1.length-1; i>=0; i--) 
            System.out.print(try1[i]); 
        
        System.out.println();
        char[] temparray = input.toCharArray(); 
        int left, right=0; 
        right = temparray.length-1;  
        for (left=0; left < right ; left++ ,right--) 
        { 
            // Swap values of left and right 
            char temp = temparray[left]; 
            temparray[left] = temparray[right]; 
            temparray[right]=temp; 
        } 
  
        for (char c : temparray) 
            System.out.print(c); 
        System.out.println(); 
	}

}
