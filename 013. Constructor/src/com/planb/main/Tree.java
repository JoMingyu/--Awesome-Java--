package com.planb.main;

public class Tree {
	String name;
	int height;
	
	Tree(String name, int height) {
		// �����ڴ� �ν��Ͻ�ȭ ����� �ʱ�ȭ �۾��� ����Ѵ�
		
		this.name = name;
		this.height = height;
		
		// this�� ȣ���� ��ü�� ��Ÿ����
		// ����� ���� python�� self�� �ִ�
	}
	
	String getInfo() {
		return "Name is " + name + ", height is " + height;
	}
}
