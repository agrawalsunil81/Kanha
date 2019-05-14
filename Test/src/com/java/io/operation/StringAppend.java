package com.java.io.operation;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StringAppend {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		   list.add(1);
		   list.add(2);
		   list.add(3);
		   
		   StringBuilder sb = new StringBuilder();
		   list.forEach(sb::append);
		   
		   System.out.println(sb);
		   
		   String str = list.stream().map(e->e.toString()).reduce("",String::concat);
		   System.out.println(str);
		   
		   String s = list.stream().map(Object::toString).collect(Collectors.joining(","));
		   System.out.println(s);
	}

}
