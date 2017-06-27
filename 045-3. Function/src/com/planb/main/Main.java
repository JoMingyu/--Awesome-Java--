package com.planb.main;

import java.util.function.BiFunction;
import java.util.function.DoubleFunction;
import java.util.function.Function;
import java.util.function.IntFunction;

public class Main {
	public static void main(String[] args) {
		/*
		 * Functional Interface
		 * - Function
		 * .applyXXX()
		 * �Ű����� �ְ� ���ϰ��� ����(��ü������ apply �޼ҵ带 ���� �Ѱ��ִ� ������ Ÿ�԰� ���� Ÿ���� �ٸ�)
		 * 
		 * Function, BiFunction
		 * DoubleFunction, IntFunction, LongFunction
		 * XxxToXxxFunction
		 * ToXxxFunction
		 * ToXxxBiFunction
		 */
		
		Function<String, Integer> function = t -> {
			// String�� Integer�� ����
			System.out.println("Function " + t);
			return 123;
		};
		int n =function.apply("Hello");
		
		BiFunction<String, Double, Integer> biFunction = (t, u) -> {
			// String�� Double�� Integer�� ����
			System.out.println("BiFunction " + t + " " + u);
			return 123;
		};
		n = biFunction.apply("Hello", 1.5);
		
		DoubleFunction<Integer> doubleFunction = d -> {
			// Double�� Integer�� ����
			return 1;
		};
		n = doubleFunction.apply(1.4);
		
		IntFunction<Double> intFunction = i -> {
			// Integer�� Double�� ����
			return 1.5;
		};
		double d = intFunction.apply(123);
		
		/*
		 * IntToDoubleFunction : Integer�� Double�� ����
		 * DoubleToIntFunction
		 * 
		 * IntToLongFunction : Integer�� Long���� ����
		 * LongToIntFunction
		 * 
		 * LongToDoubleFunction : Long�� Double�� ����
		 * DoubleToLongFunction
		 * 
		 * ToDoubleBiFunction<T, U> : ��ü T, U�� Double�� ����
		 * ToIntBiFunction<T, U> : ��ü T, U�� Integer�� ����
		 * ToLongBiFunction<T, U> : ��ü T, U�� Long���� ����
		 * 
		 * ToDoubleFunction<T> : ��ü T�� Double�� ����
		 * ToIntFunction<T> : ��ü T�� Integer�� ����
		 * ToLongFunction<T> : ��ü T�� Long���� ����
		 */
	}
}
