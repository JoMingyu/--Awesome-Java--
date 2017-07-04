package com.planb.main;

@SuppressWarnings("serial")
public class CustomEx extends Exception {
	// 커스텀 예외를 만들기 위해선 Exception 클래스를 상속
	
	public CustomEx(String msg) {
		// 생성자를 만들고 메시지를 상위 클래스로 넘겨줌
		super(msg);
	}
	
	public CustomEx() {
		// 빈 생성자도 오버로딩해두면 좋음
		super();
	}
}
