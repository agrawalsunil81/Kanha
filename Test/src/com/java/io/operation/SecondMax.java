package com.java.io.operation;

import java.util.Arrays;
import java.util.List;

public class SecondMax {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10,23,11,43,56,78,34);
		int first= list.get(0);
		int second = list.get(0);
		for(int i =1; i <list.size();i++) {
			if(first < list.get(i)) {
				second = first;
				first = list.get(i);
			}else if(second < list.get(i)) {
				second = list.get(i);
			}
		}		
		System.out.printf("The largest number is %d and seconnd largest Number is %d ", first, second);

	}

}
