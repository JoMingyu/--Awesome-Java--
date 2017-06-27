package com.planb.main;

import java.util.function.*;

public class Main {
	public static void main(String[] args) {
		/*
		 * Functional Interface
		 * - Predicate
		 * .test()
		 * 매개값이 있고 boolean형 리턴값이 있음
		 */
		
		Predicate<Integer> p = i -> {
			if(i % 2 == 0) {
				return true;
			} else return false;
		};
		
		BiPredicate<Integer, Integer> bp = (i1, i2) -> {
			if((i1 + i2) % 2 == 0) {
				return true;
			} else return false;
		};
		
		DoublePredicate dp = d -> {
			if(d < 1.0) {
				return true;
			} else return false;
		};
		
		IntPredicate ip = i -> {
			if(i % 2 == 0) {
				return true;
			} else return false;
		};
		
		LongPredicate lp = l -> {
			if(l % 2 == 0) {
				return true;
			} else return false;
		};
	}
}
