package com.planb.main;

public class Tree {
	String name;
	int height;
	
	Tree() {
		// 아직 name과 height가 정해지지 않은 나무가 있을 수 있다
		// 메소드 오버로딩과 같다
	}
	
	Tree(String name, int height) {
		this.name = name;
		this.height = height;
	}
	
	String getInfo() {
		return "Name is " + name + ", height is " + height;
	}
}
