package com.planb.main;

public class Main {
	private static int count;
	
	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(() -> {
			for(int i = 0; i < 50000; i++) {
				update();
			}
		});
		
		Thread t2 = new Thread(() -> {
			for(int i = 0; i < 50000; i++) {
				update();
			}
		});
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println(getCount());
	}
	
	private synchronized static void update() {
		// ���� �����尡 ���ÿ� ������ ��� ������ �߻�
		// synchronized ó��
		count++;
	}
	
	private static int getCount() {
		return count;
	}
}
