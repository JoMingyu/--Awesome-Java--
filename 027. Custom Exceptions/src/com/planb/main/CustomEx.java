package com.planb.main;

@SuppressWarnings("serial")
public class CustomEx extends Exception {
	// Ŀ���� ���ܸ� ����� ���ؼ� Exception Ŭ������ ���
	
	public CustomEx(String msg) {
		// �����ڸ� ����� �޽����� ���� Ŭ������ �Ѱ���
		super(msg);
	}
	
	public CustomEx() {
		// �� �����ڵ� �����ε��صθ� ����
		super();
	}
}
