package com.planb.main;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(3);
		list.add(2);
		
		print(list);
	}
	
	private static void print(List<? extends Number> list) {
		for(Number n : list) {
			System.out.println(n);
		}
	}
}
