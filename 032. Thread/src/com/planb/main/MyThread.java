package com.planb.main;

public class MyThread extends Thread {
	// �����带 ����� ��� 1. Thread Ŭ���� ���
	@Override
	public void run() {
		while(true) {
			System.out.println("Thread is running");
		}
	}
}
