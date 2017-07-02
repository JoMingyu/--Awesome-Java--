package com.planb.main;

public class Tree {
	/*
	 * 객체들은 모두 속성과 행동을 가지고 있다
	 * 이걸 클래스화 시켜서 필드와 메소드로 표현한다
	 */
	
	String name;
	int height;
	
	String getInfo() {
		return "Name is " + name + ", height is " + height;
	}
}
