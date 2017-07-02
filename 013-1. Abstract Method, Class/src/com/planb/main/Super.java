package com.planb.main;

abstract public class Super {
	abstract void abstractHello();
	/*
	 * body가 없는 메소드
	 * 클래스에 추상 메소드를 하나 이상 선언할 경우
	 * 클래스는 추상 클래스가 되어야 함
	 */
	
	void hello() {
		System.out.println("Hello");
	}
	// 추상 클래스엔 일반 메소드도 선언할 수 있음
}
