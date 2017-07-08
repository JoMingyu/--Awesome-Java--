package com.planb.main;

public class MyThread implements Runnable {
	@Override
	public void run() {
		// 스레드를 만드는 방법 2. Runnable 인터페이스 구현
		while(true) {
			System.out.println("Thread is running");
		}
	}
}
