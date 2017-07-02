package com.planb.main;

public class Main {
	public static void main(String[] args) {
		System.out.println(sum(1, 2));
		System.out.println(sum(1, 2, 3));
	}
	
	/**
	 * @param a
	 * @param b
	 * @return
	 */
	static int sum(int a, int b) {
		return a + b;
	}
	
	/**
	 * @param a
	 * @param b
	 * @param c
	 * @return
	 */
	static int sum(int a, int b, int c) {
		return a + b + c;
	}
}
