package com.planb.main;

import java.util.function.*;

public class Main {
	public static void main(String[] args) {
		/*
		 * Functional Interface
		 * - Operator
		 * .applyXXX()
		 * 매개값이 있고 리턴값이 있음
		 * Function과 동일한 구조지만 매핑의 역할보단 연산을 수행한 후 동일한 타입으로 리턴하는 역할
		 */
		
		UnaryOperator<Integer> uo = i -> {
			// Function<T, R>의 하위 인터페이스
			return i + 1;
		};
		System.out.println(uo.apply(3));
		
		BinaryOperator<Integer> bo = (i1, i2) -> {
			// BiFunction<T, U, R>의 하위 인터페이스
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
