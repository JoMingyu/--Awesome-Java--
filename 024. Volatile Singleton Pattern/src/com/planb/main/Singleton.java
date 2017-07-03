package com.planb.main;

public class Singleton {
//	private static final Singleton instance = new Singleton();
	// �������� �ʾҴµ� �̸� �����Ǿ� �ڿ��� �����
	
	private volatile static Singleton instance;
	/*
	 * getInstance() �޼ҵ忡�� ���Ǵ� DCL��
	 * �޸� ��, ����ȭ(���ġ), ���������� ���� ������ ������ �������� ���� �� �ִ� 
	 */
	
	private Singleton() {}
	
	public static Singleton getInstance() {
		if(instance == null) {
			synchronized(Singleton.class) {
				if(instance == null) {
					/*
					 * DCL(Double-Checking Locking)
					 * �ν��Ͻ��� null�̸� ����ȭ�� ��� �ν��Ͻ�ȭ
					 */
					instance = new Singleton();
				}
			}
		}
		return instance;
	}
}
