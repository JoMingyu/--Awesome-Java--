package com.planb.main;

public class Main {
	public static void main(String[] args) {
		Thread t = new Thread(new MyThread());
		// Thread�� �����ڿ� Runnable �������̽��� ������ Ŭ������ �ν��Ͻ��� ����
		
		t.start();
	}
}
