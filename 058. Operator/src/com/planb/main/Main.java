package com.planb.main;

import java.util.function.*;

public class Main {
	public static void main(String[] args) {
		/*
		 * Functional Interface
		 * - Operator
		 * .applyXXX()
		 * �Ű����� �ְ� ���ϰ��� ����
		 * Function�� ������ �������� ������ ���Һ��� ������ ������ �� ������ Ÿ������ �����ϴ� ����
		 */
		
		UnaryOperator<Integer> uo = i -> {
			// Function<T, R>�� ���� �������̽�
			return i + 1;
		};
		System.out.println(uo.apply(3));
		
		BinaryOperator<Integer> bo = (i1, i2) -> {
			// BiFunction<T, U, R>�� ���� �������̽�
			return i1 + i2 + 1;
		};
		System.out.println(bo.apply(2, 3));
		
		DoubleUnaryOperator iuo = (i1) -> {
			return i1 + 0.1;
		};
		System.out.println(iuo.applyAsDouble(1.5));
		
		DoubleBinaryOperator dbo = (d1, d2) -> {
			return d1 + d2 + 0.1;
		};
		System.out.println(dbo.applyAsDouble(1.4, 1.8));
		
		/*
		 * IntUnaryOperator
		 * IntBinaryOperator
		 * LongUnaryOperator
		 * LongBinaryOperator
		 */
	}
}
