package com.planb.main;

public class Main {
	public static void main(String[] args) {
		Integer a;
		// Wrapper class는 특정 기본형 타입을 나타냄
		
		a = new Integer(30);
		// Boxing - 기본 타입을 Wrapper class로
		a = 30;
		// Auto Boxing
		
		int b = a.intValue();
		// Unboxing - Wrapper class의 인스턴스를 기본 타입으로
		b = a;
		// Auto Unboxing
	}
}
