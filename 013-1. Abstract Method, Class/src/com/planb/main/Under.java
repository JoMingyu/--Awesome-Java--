package com.planb.main;

public class Under extends Super {
	@Override
	void abstractHello() {
		System.out.println("Implemented");
	}
	// 상속 시 추상 메소드를 무조건 override해야 함
}
