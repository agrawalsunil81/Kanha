package com.java.io.operation;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

//Requirements: Generate 100 random numbers between 1-1000.
//	Put the numbers into a Map.  Then move them to a Set.
//  Then move the numbers into a List.  Then sort the numbers.
//	Finally output the numbers, with one number on every row
public class CollectionFun {

	public static void main(String[] args) {
		CollectionFun collectionFun = new CollectionFun();
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < 100; i++) {
			Integer number = collectionFun.getGenerateRandomNo(1, 1000);
			map.put("test" + number, number);
		}
		List<Integer> al = map.entrySet().stream().map(e -> e.getValue()).collect(Collectors.toList());		
		Comparator<Integer> c = (n1, n2) -> (n1 > n2) ? 1 : (n1 < n2) ? -1 : 0;
		Collections.sort(al, c);
		al.stream().forEach(System.out::println);
	}

	private int getGenerateRandomNo(int min, int max) {
		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}

}
