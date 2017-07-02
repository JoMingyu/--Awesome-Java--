package com.planb.main;

public interface Super {
	abstract void abstractHello();
	
	static void staticHello() {
		System.out.println("Static Hello");
	}
	
	default void defaultHello() {
		System.out.println("Default Hello");
	}
	/*
	 * 인터페이스에 선언할 수 있는 메소드
	 * - 추상 메소드
	 * - static 메소드
	 * - default 메소드
	 */
}
