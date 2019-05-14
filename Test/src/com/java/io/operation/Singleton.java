package com.java.io.operation;

public enum Singleton {
	INSTANCE;
	private Integer value;

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}
	
	
}
