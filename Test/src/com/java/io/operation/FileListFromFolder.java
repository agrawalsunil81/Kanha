package com.java.io.operation;

import java.io.File;

public class FileListFromFolder {

	public static void main(String[] args) {
		File file = new File("C:\\Program Files");
		
		String[] files = file.list();
		
		for (String name : files) {
			System.out.println(name);
		}

	}

}
