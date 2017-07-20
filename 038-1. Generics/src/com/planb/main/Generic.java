package com.planb.main;

public class Generic<T> {
	// 제네릭 타입
	// 타입을 파라미터로 가지는 클래스와 인터페이스
	
	T field;
	
	public Generic(T field) {
		this.field = field;
	}
	
	public T get() {
		return field;
	}
}
