package com.planb.main;

public class Main {
	public static void main(String[] args) {
		Tree appleTree = new Tree();
		Tree lemonTree = new Tree();
		// 일반적인 객체지향 언어에서 객체를 만드는 주체는 클래스
		
		appleTree.name = "Apple Tree";
		appleTree.height = 180;
		
		lemonTree.name = "Lemon Tree";
		lemonTree.height = 150;
		
		System.out.println(appleTree.getInfo());
		System.out.println(lemonTree.getInfo());
	}
}
