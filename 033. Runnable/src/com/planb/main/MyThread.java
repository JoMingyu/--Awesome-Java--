package com.planb.main;

public class MyThread implements Runnable {
	@Override
	public void run() {
		// �����带 ����� ��� 2. Runnable �������̽� ����
		while(true) {
			System.out.println("Thread is running");
		}
	}
}
