package com.planb.main;

public class Generic<T extends Number> {
	// ���׸��� ���� �� �ϳ��� �ǵ����� ���� Ÿ���� ��ü�� �����ϴ� ���� ���� �� �ִٴ� ��
	T field;
	
	public T get() {
		return field;
	}
}
