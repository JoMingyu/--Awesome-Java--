package com.planb.main;

public class Generic<T> {
	// ���׸� Ÿ��
	// Ÿ���� �Ķ���ͷ� ������ Ŭ������ �������̽�
	
	T field;
	
	public Generic(T field) {
		this.field = field;
	}
	
	public T get() {
		return field;
	}
}
