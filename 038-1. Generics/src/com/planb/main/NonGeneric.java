package com.planb.main;

public class NonGeneric {
	// Object Ÿ���� ����ϸ� Ÿ�� ��ȯ�� ���� �߻�
	
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
