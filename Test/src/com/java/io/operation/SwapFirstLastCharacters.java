package com.java.io.operation;

public class SwapFirstLastCharacters {

	public static void main(String[] args) {
		String str = "geeks for geeks"; 
        System.out.println(count(str)); 
       }
	
	static String count(String str) 
    { 
        char[] ch = str.toCharArray(); 
        for (int i = 0; i < ch.length; i++) { 
  
            int k = i; 
            while (i < ch.length && ch[i] != ' ')  
                i++; 
              
            // Swapping 
            char temp = ch[k]; 
            ch[k] = ch[i - 1]; 
            ch[i - 1] = temp; 
  
            // We assume that there is only one space 
            // between two words. 
        } 
        return new String(ch); 
    } 

}
