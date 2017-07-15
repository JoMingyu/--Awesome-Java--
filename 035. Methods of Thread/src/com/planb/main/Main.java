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
		// 메인 스레드와 함께 종료
		
		t.setName("My Thread");
		t.start();
		
		System.out.println(t.isAlive());
		// 살아있나
		
		System.out.println(t.getState());
		// 지금 상태
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
