package com.planb.main;

public class Main {
	public static void main(String[] args) {
		Thread t = new Thread(new MyThread());
		// Thread의 생성자에 Runnable 인터페이스를 구현한 클래스의 인스턴스를 넣자
		
		t.start();
	}
}
