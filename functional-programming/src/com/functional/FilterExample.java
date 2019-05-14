package com.functional;

import java.util.Arrays;
import java.util.List;

public class FilterExample {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Peter","Sam","Greg","Ryan");
		
		 System.out.println("Imretive Style"); 
		  for (String name : list) { if(!name.equals("Sam")) {
		  System.out.println(name); } }
		  System.out.println(); 
		  
		  
		  
		  System.out.println("Functional Style");
		list.stream().filter(FilterExample::isNotSame).forEach(System.out::println);
	}
	
	
	private static boolean isNotSame(String name) {
		return !name.equals("Sam");
	}

}
