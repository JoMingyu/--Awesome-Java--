package com.planb.main;

public class Main {
	public static void main(String[] args) {
		Integer a;
		// Wrapper class�� Ư�� �⺻�� Ÿ���� ��Ÿ��
		
		a = new Integer(30);
		// Boxing
		a = 30;
		// Auto Boxing
		
		int b = a.intValue();
		// Unboxing
		b = a;
		// Auto Unboxing
	}
}
