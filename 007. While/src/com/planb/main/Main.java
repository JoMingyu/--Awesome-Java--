package com.planb.main;

public class Main {
	public static void main(String[] args) {
		int i =0;
		
		while(true) {
			if(i++ == 10) {
				break;
			}
		}
		
		i = 0;
		while(i < 10) {
			i++;
			System.out.println(i);
		}
	}
}
