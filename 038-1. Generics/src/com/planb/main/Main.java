package com.planb.main;

public class Main {
	public static void main(String[] args) {
		NonGeneric ng = new NonGeneric(15);
		System.out.println(ng.getInt());
		System.out.println(ng.getString());
		
		Generic<Double> g = new Generic<>(1.5);
		// 넘겨주는 클래스를 타입 파라미터라고 부름
		System.out.println(g.get());
	}
}
