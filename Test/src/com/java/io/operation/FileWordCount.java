package com.java.io.operation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FileWordCount {

	public static void main(String[] args) throws FileNotFoundException {
		Map<String, Integer> map = new HashMap<String, Integer>();
		FileInputStream fis = new FileInputStream("D:\\text.txt");
		Scanner scan = new Scanner(fis);
		Integer count=1;
		while(scan.hasNext()) {
			String word = scan.next();
			if(!map.containsKey(word)) {				
				map.put(word, count);
			}else {
				map.put(word, map.get(word)+1);
			}
		}
		map.entrySet().stream().forEach(System.out::println);		
	}

}
