package com.planb.main;

public class Main {
	public static void main(String[] args) {
		Super sup = new Under();
		sup.abstractHello();
		sup.defaultHello();
		
		Super.staticHello();
		/*
		 * Ŭ������ static �޼ҵ�� �޸� ��ü�� ���� ���� �Ұ�
		 * �������̽� �� ��Ʈ ���� ����� �̿��ؾ� ��
		 */
	}
}
