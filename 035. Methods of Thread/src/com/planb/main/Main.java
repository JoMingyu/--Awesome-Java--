package com.planb.main;

public class Main {
	public static void main(String[] args) {
		Thread t = new Thread(() -> {
			for(int i = 0; i < 20; i++) {
				try {
					Thread.sleep(100);
					System.out.println(Thread.currentThread().getName());
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		t.setDaemon(true);
		// ���� ������� �Բ� ����
		
		t.setName("My Thread");
		t.start();
		
		System.out.println(t.isAlive());
		// ����ֳ�
		
		System.out.println(t.getState());
		// ���� ����
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
