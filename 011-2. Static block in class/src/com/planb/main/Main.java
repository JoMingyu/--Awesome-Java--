package com.planb.main;

public class Main {
	static {
		/*
		 * Ŭ������ JVM �������� �ö� �� ����Ǵ� ���
		 * static �޼ҵ常 �����ϴ� Ŭ�������� ������ �ʱ�ȭ �۾��� �Ҷ� �ַ� ���̰� �Ѵ�
		 */
		System.out.println("Static block");
	}
	
	public static void main(String[] args) {
		System.out.println("Hello World");
	}
}
