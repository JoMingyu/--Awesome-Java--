package com.planb.main;

public class Main {
	public static void main(String[] args) {
		Super sup = new Under();
		sup.abstractHello();
		sup.defaultHello();
		
		Super.staticHello();
		/*
		 * 클래스의 static 메소드와 달리 객체를 통한 접근 불가
		 * 인터페이스 명에 도트 연산 방식을 이용해야 함
		 */
	}
}
