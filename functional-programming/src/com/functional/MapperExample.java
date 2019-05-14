package com.functional;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapperExample {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Peter","Sam","Greg","Ryan");
		//list.stream().filter(MapperExample::isNotSame).map(User::new).forEach(System.out::println);
		List<User> userList = list.stream().filter(MapperExample::isNotSame).map(User::new).collect(Collectors.toList());
		userList.forEach(System.out::println);
		int sum = userList.stream().mapToInt(User::getAge).sum();
		
		System.out.println(sum);
	}
	
	private static boolean isNotSame(String name) {
		return !name.equals("Sam");
	}


}
