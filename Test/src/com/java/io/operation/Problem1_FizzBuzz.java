package com.java.io.operation;

import java.util.Arrays;
import java.util.List;

//Requirements: Output the numbers 1-100, with one number on every row.
//	If the number is a multiple of 3 output an F instead of the number.
//	If the number is a multiple of 5 output an B instead of the number.
//	If the number is a multiple of 15 output output an FB instead of the number.
public class Problem1_FizzBuzz {

	public static void main(String[] args) {

		List<Integer> al = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22,
				23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48,
				49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74,
				75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99,
				100);

		// Older Pattern

		/*
		 * for (int i = 1; i <= al.size(); i++) { if (i % 3 == 0 && i % 15 != 0) {
		 * System.out.println("F "); } else if (i % 5 == 0 && i % 15 != 0) {
		 * System.out.println("B "); } else if (i % 15 == 0) {
		 * System.out.println("FB "); } else { System.out.println(i + " "); } }
		 */

		// Java 1.8 Pattern

		/*
		 * al.stream().map(e -> { if (e % 3 == 0 && e % 15 != 0) return "F"; else if (e
		 * % 5 == 0 && e % 15 != 0) return "B"; else if (e % 15 == 0) return "FB"; else
		 * return e; }).forEach(System.out::println);
		 */
		
		al.stream().map(Problem1_FizzBuzz::getModify).forEach(System.out::println);

	}
	
	
	private static String getModify(Integer e) {
		if (e % 3 == 0 && e % 15 != 0)
			return "F";
		else if (e % 5 == 0 && e % 15 != 0)
			return "B";
		else if (e % 15 == 0)
			return "FB";
		else
			return String.valueOf(e);
		
	}

}
