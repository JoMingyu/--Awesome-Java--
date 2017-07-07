package com.planb.main;

public class MyThread extends Thread {
	// 스레드를 만드는 방법 1. Thread 클래스 상속
	@Override
	public void run() {
		while(true) {
			System.out.println("Thread is running");
		}
	}
}
