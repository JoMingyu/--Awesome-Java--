package com.planb.main;

public class Main {
	public static void main(String[] args) {
		Integer a;
		// Wrapper class�� Ư�� �⺻�� Ÿ���� ��Ÿ��
		
		a = new Integer(30);
		// Boxing - �⺻ Ÿ���� Wrapper class��
		a = 30;
		// Auto Boxing
		
		int b = a.intValue();
		// Unboxing - Wrapper class�� �ν��Ͻ��� �⺻ Ÿ������
		b = a;
		// Auto Unboxing
	}
}
