package com.planb.main;

public class Main {
	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		
		int i = 0;
		for(; ;) {
			if(i == 10) { 
				break;
			}
			i++;
			System.out.println(i);
		}
	}
}
