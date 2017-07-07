package com.planb.main;

public class Main {
	public static void main(String[] args) {
		Thread t = new MyThread();
		t.start();
		// main 스레드가 종료돼도 계속해서 진행함
		// 나중에 스레드 관련 메소드를 따로 공부하면 메인 스레드와 함께 종료되는 스레드를 만들자
	}
}
