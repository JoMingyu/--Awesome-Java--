package com.planb.main;

public class Singleton {
	// 항상 똑같은 객체를 가져가도록 하기 위한 디자인 패턴
	private static Singleton instance = new Singleton();
	
	private Singleton() {}
	
	public static Singleton getInstance() {
		return instance;
	}
}
