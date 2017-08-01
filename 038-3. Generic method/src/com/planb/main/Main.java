package com.planb.main;

public class Main {
	public static void main(String[] args) {
		print("asdfasdf", 123);
	}
	
	private static <K, V> void print(K key, V value) {
		System.out.println("Key is " + key + " [" + key.getClass().getSimpleName() + "]");
		System.out.println("Value is " + value + " [" + value.getClass().getSimpleName() + "]");
	}
}
