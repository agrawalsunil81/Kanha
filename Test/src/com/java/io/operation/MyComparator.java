package com.java.io.operation;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;

public class MyComparator {

	public static void main(String[] args) {
		List<Integer> al = Arrays.asList(12,23,45,10,20,5,23,46);
		System.out.println("UnSorted ArrayList");
		al.stream().forEach(System.out::println);
		System.out.println();
		System.out.println("Sorted ArrayList");
		Comparator<Integer> c = (e1,e2) -> (e1 > e2)?1:(e2 > e1)?-1:0;
		Collections.sort(al,c);
		al.stream().forEach(System.out::println);		
		Integer sum = al.stream().reduce(0, (e1, e2)->e1+e2);		
		System.out.println("Sum--->"+sum);	
		OptionalDouble sum1= al.stream().mapToDouble(i->i * i).average();		
		System.out.println("Sum1--->"+sum1);
	}

}
