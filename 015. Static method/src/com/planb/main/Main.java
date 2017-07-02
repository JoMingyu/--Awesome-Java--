package com.planb.main;

public class Main {
	static void sayHello() {
		// 009-1. Method�� ���� �޼ҵ�
		System.out.println("Hello");
	}
	
	public static void main(String[] args) {
		sayHello();
		// static�� �޼ҵ�� ��� ���� ����
		
//		int sum = sum(1, 2);
		// static�� �ƴ� �޼ҵ�� ��� ���� �Ұ�
		
		Main main = new Main();
		int sum = main.sum(1, 2);
		// �ν��Ͻ�ȭ ���� ��� ����
		
		/*
		 * Static method�� Ŭ������ �ε��� ��(JVM ���ÿ� �ö� ��) �޸𸮿� ���� �ö󰣴�
		 * ���� �ν��Ͻ�ȭ ���̵� ����� �� �ִ�(Ŭ������.�޼ҵ��̸� = Main.sayHello())
		 * 
		 * �ν��Ͻ�ȭ ���� ����� �� �ִٴ� �� � ��ü�� �Ȱ��� ���� ������
		 * ���� ������ �뵵�� ����ϱ⵵ �Ѵ�
		 * 
		 * �����ϸ� �޸𸮰� ������ ���� �ִ�
		 */
	}
	
	// Non-static method
	int sum(int a, int b) {
		return a + b;
	}
}
