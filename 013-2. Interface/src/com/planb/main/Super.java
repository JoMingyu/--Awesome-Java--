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
	 * �������̽��� ������ �� �ִ� �޼ҵ�
	 * - �߻� �޼ҵ�
	 * - static �޼ҵ�
	 * - default �޼ҵ�
	 */
}
