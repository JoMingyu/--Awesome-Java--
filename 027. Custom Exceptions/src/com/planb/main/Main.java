package com.planb.main;

public class Main {
	public static void main(String[] args) {
		try {
			ExceptionThrower.access();
			// ���ܸ� throw�ϴ� �޼ҵ忡 ������ �� ����ó���� ����� ��
		} catch (CustomEx e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
