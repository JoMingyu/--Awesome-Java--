package com.planb.main;

public class NonGeneric {
	// Object 타입을 사용하면 타입 변환이 자주 발생
	
	Object field;
	
	public NonGeneric(Object field) {
		this.field = field;
	}
	
	public Object get() {
		return field;
	}
	
	public int getInt() {
		return (int) field;
	}
	
	public String getString() {
		return field.toString();
	}
	
	public double getDouble() {
		return (double) field;
	}
}
