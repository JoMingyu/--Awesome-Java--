package com.planb.main;

public class Main {
	public static void main(String[] args) {
		int a = 28; // 00011100
		int b = 17; // 00010001
		
		System.out.println(a & b); // AND
		System.out.println(a | b); // OR
		System.out.println(~a); // NOT
		System.out.println(a ^ b); // XOR
		
		System.out.println(a << 2); // Left shift
		System.out.println(a >> 2); // Right shift
		
		System.out.println(~(a & b)); // NAND
		System.out.println(~(a | b)); // NOR
		System.out.println(~(a ^ b)); // XNOR
	}
}
