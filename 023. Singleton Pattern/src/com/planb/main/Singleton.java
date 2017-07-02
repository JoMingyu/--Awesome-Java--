package com.planb.main;

public class Singleton {
	// �׻� �Ȱ��� ��ü�� ���������� �ϱ� ���� ������ ����
	private static Singleton instance = new Singleton();
	
	private Singleton() {}
	
	public static Singleton getInstance() {
		return instance;
	}
}
