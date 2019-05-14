package com.java.io.operation;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public final class ImmutableObject {
	
	private final String name;
	private final Integer age;
	private final Date date;
	private final List<String> list;
	
	public ImmutableObject(String name, Integer age, Date date, List<String> list) {
		this.name = name;
		this.age = age;
		Date dt = new Date(date.getTime());
		this.date = dt;
		List<String> lt = list.stream().collect(Collectors.toList());
		this.list = lt;
	}
	
	
	public String getName() {
		return name;
	}
	public Integer getAge() {
		return age;
	}
	public Date getDate() {
		return date;
	}
	public List<String> getList() {
		return this.list;
	}


	@Override
	public String toString() {
		return "ImmutableObject [name=" + name + ", age=" + age + ", date=" + date + ", list=" + list + "]";
	}
	
	
	
	
	

}
