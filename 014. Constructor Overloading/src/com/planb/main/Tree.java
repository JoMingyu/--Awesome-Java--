package com.planb.main;

public class Tree {
	String name;
	int height;
	
	Tree() {
		// ���� name�� height�� �������� ���� ������ ���� �� �ִ�
		// �޼ҵ� �����ε��� ����
	}
	
	Tree(String name, int height) {
		this.name = name;
		this.height = height;
	}
	
	String getInfo() {
		return "Name is " + name + ", height is " + height;
	}
}
