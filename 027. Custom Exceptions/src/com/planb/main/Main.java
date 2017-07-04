package com.planb.main;

public class Main {
	public static void main(String[] args) {
		try {
			ExceptionThrower.access();
			// 예외를 throw하는 메소드에 접근할 때 예외처리를 해줘야 함
		} catch (CustomEx e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
