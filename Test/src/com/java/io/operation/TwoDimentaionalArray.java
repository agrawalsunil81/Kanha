package com.java.io.operation;

public class TwoDimentaionalArray {

	public static void main(String[] args) {
		
		Integer [][] arr = {{1,2,3},{2,3,4},{5,4,5}};
		Integer sum =0;
		
		Integer [][] array = new Integer[2][3];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = i+1 * j+1;				
			}			
		}
		System.out.println("Array Elements------>> ");	
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j]);				
			}	
			System.out.println();	
		}
		
		System.out.println("2nd Array Elements------>> ");
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]);				
			}	
			System.out.println();	
		}
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(i == j )
					System.out.print(arr[i][j]);				
			}	
			System.out.println();	
		}
		System.out.println();
		for (int i = arr.length-1; i >= 0; i--) {
			for (int j = arr[i].length; j >= 0; j--) {
				if(i == j )
					System.out.print(arr[i][j]);				
			}	
			System.out.println();	
		}
		
		System.out.println();
		for (int i = arr.length-1; i >= 0; i--) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]);				
			}	
			System.out.println();	
		}
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(i == j )
					sum = sum + arr[i][j];				
			}	
			System.out.println();	
		}
		
		System.out.println(sum);
	}

}
