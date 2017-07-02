package com.planb.main;

public class Main {
	public static void main(String[] args) {
		Singleton singleton = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();
		
		NonSingleton nonSingleton = new NonSingleton();
		NonSingleton nonSingleton2 = new NonSingleton();
		
		System.out.println(singleton == singleton2);
		System.out.println(singleton.equals(singleton2));
		
		System.out.println(nonSingleton == nonSingleton2);
		System.out.println(nonSingleton.equals(nonSingleton2));
	}
}
