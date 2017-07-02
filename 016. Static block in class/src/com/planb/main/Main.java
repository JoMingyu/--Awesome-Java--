package com.planb.main;

public class Main {
	static {
		/*
		 * 클래스가 JVM 스택으로 올라갈 때 실행되는 블록
		 * static 메소드만 존재하는 클래스같은 곳에서 초기화 작업을 할때 주로 쓰이곤 한다
		 */
		System.out.println("Static block");
	}
	
	public static void main(String[] args) {
		System.out.println("Hello World");
	}
}
