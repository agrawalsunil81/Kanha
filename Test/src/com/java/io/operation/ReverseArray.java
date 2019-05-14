package com.java.io.operation;

public class ReverseArray {

	static void rvereseArray(int arr[], int start, int end) 
    { 
        int temp; 
        if (start >= end) 
            return; 
        temp = arr[start]; 
        arr[start] = arr[end]; 
        arr[end] = temp; 
        rvereseArray(arr, start+1, end-1); 
    } 
	
	static void rvereseArray(char arr[], int start, int end) 
    { 
        char temp; 
        if (start >= end) 
            return; 
        temp = arr[start]; 
        arr[start] = arr[end]; 
        arr[end] = temp; 
        rvereseArray(arr, start+1, end-1); 
    } 
	
	static void printArray(int arr[], int size) 
    { 
        for (int i=0; i < size; i++) 
            System.out.print(arr[i] + " "); 
        System.out.println(""); 
    }
	
	static void printArray(char arr[], int size) 
    { 
        for (int i=0; i < size; i++) 
            System.out.print(arr[i] + " "); 
        System.out.println(""); 
    }
	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 5, 6}; 
        printArray(arr, arr.length); 
        rvereseArray(arr, 0, arr.length-1); 
        System.out.println("Reversed array is "); 
        printArray(arr, arr.length); 

        char[] ch="abcdefghijkl".toCharArray();
        
        printArray(ch, ch.length); 
        rvereseArray(ch, 0, ch.length-1); 
        System.out.println("Reversed array is "); 
        printArray(ch, ch.length); 
	}

}
