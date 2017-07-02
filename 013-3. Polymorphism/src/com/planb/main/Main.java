package com.planb.main;

public class Main {
	public static void main(String[] args) {
		/*
		 * 객체지향 프로그래밍 언어의 특징 중 하나인 다형성(Polymorphism)
		 * 하나의 객체가 여러 타입을 가질 수 있음
		 */
		
		Bootable laptop = new Laptop();
		Bootable desktop = new Desktop();
		
		laptop.boot();
		desktop.boot();
	}
}
