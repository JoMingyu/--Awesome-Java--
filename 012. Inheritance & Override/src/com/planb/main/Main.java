package com.planb.main;

public class Main {
	public static void main(String[] args) {
		// Korean ��ü�� �����ϴ� ����� �ΰ����� ����
		
		Korean korean = new Korean();
		// �������� ���
		korean.sayHello();
		
		Person person = new Korean();
		// ���� Ŭ���� Ÿ������ �����ϰ�, Korean Ŭ������ �ν��Ͻ�ȭ �ϴ� ���
		person.sayHello();
		
		/*
		 * Ŭ���� ���� ��� ���迡��, ���� Ŭ���� Ÿ������ �����ϰ�
		 * ���� Ŭ������ �ν��Ͻ�ȭ �ϴ� ������� ��ü���� ���α׷����� '������'�� �����Ѵ�
		 * 013. Polymorphism���� �ٽ� ����
		 */
	}
}
