package com.planb.main;

public class Main {
	static void sayHello() {
		// 009-1. Method의 예제 메소드
		System.out.println("Hello");
	}
	
	public static void main(String[] args) {
		sayHello();
		// static인 메소드는 즉시 접근 가능
		
//		int sum = sum(1, 2);
		// static이 아닌 메소드는 즉시 접근 불가
		
		Main main = new Main();
		int sum = main.sum(1, 2);
		// 인스턴스화 이후 사용 가능
		
		/*
		 * Static method는 클래스가 로딩될 때(JVM 스택에 올라갈 때) 메모리에 같이 올라간다
		 * 따라서 인스턴스화 없이도 사용할 수 있다(클래스명.메소드이름 = Main.sayHello())
		 * 
		 * 인스턴스화 없이 사용할 수 있다는 건 어떤 객체든 똑같은 값을 가진다
		 * 따라서 공유의 용도로 사용하기도 한다
		 * 
		 * 남발하면 메모리가 부족할 수도 있다
		 */
	}
	
	// Non-static method
	int sum(int a, int b) {
		return a + b;
	}
}
