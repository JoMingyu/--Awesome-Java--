package com.planb.main;

public class Main {
	public static void main(String[] args) {
		Tree appleTree = new Tree();
		Tree lemonTree = new Tree();
		// �Ϲ����� ��ü���� ���� ��ü�� ����� ��ü�� Ŭ����
		
		appleTree.name = "Apple Tree";
		appleTree.height = 180;
		
		lemonTree.name = "Lemon Tree";
		lemonTree.height = 150;
		
		System.out.println(appleTree.getInfo());
		System.out.println(lemonTree.getInfo());
	}
}
