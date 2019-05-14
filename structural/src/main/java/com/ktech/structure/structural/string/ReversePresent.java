package com.ktech.structure.structural.string;

import java.util.Arrays;
import java.util.List;

public class ReversePresent {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("geeks","for","skeeg");
		ReversePresent reversePresent = new ReversePresent();
		System.out.println(reversePresent.getWorld(list, list.size()));

	}

	private String getWorld(List<String> list, int size) {
		
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if(isReverseWord(list.get(i), list.get(j)))
					return list.get(i);
			}			
		}
		
		return "-1";
		
	}

	private boolean isReverseWord(String str1, String str2) {

		if(str1.length() != str2.length())
			return false;
		
		for (int i = 0; i < str1.length(); i++) {
			if(str1.charAt(i) != str2.charAt(str1.length() - i- 1))
				return false;			
		}		
		return true;
	}
}
