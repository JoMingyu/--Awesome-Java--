package com.planb.main;

public class Main {
	public static void main(String[] args) {
		/*
		 * ��ü���� ���α׷��� ����� Ư¡ �� �ϳ��� ������(Polymorphism)
		 * �ϳ��� ��ü�� ���� Ÿ���� ���� �� ����
		 */
		
		Bootable laptop = new Laptop();
		Bootable desktop = new Desktop();
		
		laptop.boot();
		desktop.boot();
	}
}
