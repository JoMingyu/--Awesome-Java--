package com.planb.main;

public class Main {
	public static void main(String[] args) {
		try {
			System.out.println(1 / 0);
		} catch(ArithmeticException e) {
			/*
			 * 오류가 날 수 있는 코드의 경우 try로 묶고
			 * 오류가 날 때 분기되기 위한 catch 블럭 정의
			 */
			System.out.println("Error");
		}
	}
}
