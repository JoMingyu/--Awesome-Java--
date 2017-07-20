package com.planb.main;

public class Generic<T extends Number> {
	// 제네릭의 장점 중 하나는 의도하지 않은 타입의 객체를 저장하는 것을 막을 수 있다는 것
	T field;
	
	public T get() {
		return field;
	}
}
