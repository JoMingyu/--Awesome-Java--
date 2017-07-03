package com.planb.main;

import java.util.function.IntBinaryOperator;

public class Main {
	private static int[] array = {5, 2, 13, 2, 89, 10, 29};
	
	public static void main(String[] args) {
		int max = maxOrMin((num1, num2) -> {
			if(num1 < num2) {
				return num2;
			} else return num1;
		});
		
		int min = maxOrMin((num1, num2) -> {
			if(num1 < num2) {
				return num1;
			} else return num2;
		});
		
		System.out.println(max + " " + min);
	}

	private static int maxOrMin(IntBinaryOperator operator) {
		int result = array[0];
		
		for(int num : array) {
			result = operator.applyAsInt(result, num);
		}
		
		return result;
	}
}
