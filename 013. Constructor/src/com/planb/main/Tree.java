package com.planb.main;

public class Tree {
	String name;
	int height;
	
	Tree(String name, int height) {
		// 생성자는 인스턴스화 당시의 초기화 작업을 담당한다
		
		this.name = name;
		this.height = height;
		
		// this는 호출자 객체를 나타낸다
		// 비슷한 예로 python의 self가 있다
	}
	
	String getInfo() {
		return "Name is " + name + ", height is " + height;
	}
}
