package com.planb.main;

public class Main {
	public static void main(String[] args) {
		try {
			System.out.println(1 / 0);
		} catch(ArithmeticException e) {
			/*
			 * ������ �� �� �ִ� �ڵ��� ��� try�� ����
			 * ������ �� �� �б�Ǳ� ���� catch �� ����
			 */
			System.out.println("Error");
		}
	}
}
