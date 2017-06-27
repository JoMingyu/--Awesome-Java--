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
		 * 매개값이 있고 리턴값이 있음(대체적으로 apply 메소드를 통해 넘겨주는 데이터 타입과 리턴 타입이 다름)
		 * 
		 * Function, BiFunction
		 * DoubleFunction, IntFunction, LongFunction
		 * XxxToXxxFunction
		 * ToXxxFunction
		 * ToXxxBiFunction
		 */
		
		Function<String, Integer> function = t -> {
			// String을 Integer로 매핑
			System.out.println("Function " + t);
			return 123;
		};
		int n =function.apply("Hello");
		
		BiFunction<String, Double, Integer> biFunction = (t, u) -> {
			// String과 Double을 Integer로 매핑
			System.out.println("BiFunction " + t + " " + u);
			return 123;
		};
		n = biFunction.apply("Hello", 1.5);
		
		DoubleFunction<Integer> doubleFunction = d -> {
			// Double을 Integer로 매핑
			return 1;
		};
		n = doubleFunction.apply(1.4);
		
		IntFunction<Double> intFunction = i -> {
			// Integer를 Double로 매핑
			return 1.5;
		};
		double d = intFunction.apply(123);
		
		/*
		 * IntToDoubleFunction : Integer를 Double로 매핑
		 * DoubleToIntFunction
		 * 
		 * IntToLongFunction : Integer를 Long으로 매핑
		 * LongToIntFunction
		 * 
		 * LongToDoubleFunction : Long을 Double로 매핑
		 * DoubleToLongFunction
		 * 
		 * ToDoubleBiFunction<T, U> : 객체 T, U를 Double로 매핑
		 * ToIntBiFunction<T, U> : 객체 T, U를 Integer로 매핑
		 * ToLongBiFunction<T, U> : 객체 T, U를 Long으로 매핑
		 * 
		 * ToDoubleFunction<T> : 객체 T를 Double로 매핑
		 * ToIntFunction<T> : 객체 T를 Integer로 매핑
		 * ToLongFunction<T> : 객체 T를 Long으로 매핑
		 */
	}
}
