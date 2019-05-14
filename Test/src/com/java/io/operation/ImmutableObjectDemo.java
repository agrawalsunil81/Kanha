package com.java.io.operation;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ImmutableObjectDemo {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Sunil");
		list.add("Sunil");
		Date date = new Date(876638462348L);
		ImmutableObject immutableObject = new ImmutableObject("Sunil", 35, date, list);		
		System.out.println(immutableObject);
		list.add("Mayank");
		date = new Date(876638468L);
		System.out.println(immutableObject);

	}

}
