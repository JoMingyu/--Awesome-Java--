package com.planb.main;

public class Main {
	public static void main(String[] args) {
		// Korean 객체를 생성하는 방법은 두가지가 있음
		
		Korean korean = new Korean();
		// 전형적인 방법
		korean.sayHello();
		
		Person person = new Korean();
		// 상위 클래스 타입으로 선언하고, Korean 클래스를 인스턴스화 하는 방법
		person.sayHello();
		
		/*
		 * 클래스 간의 상속 관계에서, 상위 클래스 타입으로 선언하고
		 * 하위 클래스로 인스턴스화 하는 방식으로 객체지향 프로그래밍의 '다형성'을 구현한다
		 * 013. Polymorphism에서 다시 설명
		 */
	}
}
