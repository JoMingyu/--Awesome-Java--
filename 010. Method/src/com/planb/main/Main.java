package com.planb.main;

public class Main {
	public static void main(String[] args) {
		sayHello();
		System.out.println(sum(1, 2));
	}
	
	static void sayHello() {
		System.out.println("Hello");
	}
	
	/**
	 * @param a
	 * @param b
	 * @return
	 */
	static int sum(int a, int b) {
		return a + b;
	}
}
