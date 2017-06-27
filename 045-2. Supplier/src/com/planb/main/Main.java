package com.planb.main;

import java.util.function.*;

public class Main {
	public static void main(String[] args) {
		/*
		 * Functional Interface
		 * - Supplier
		 * .get()
		 * 매개값이 없고 리턴값이 있음
		 * 
		 * Supplier
		 * BooleanSupplier
		 * DoubleSupplier
		 * IntSupplier
		 * LongSupplier
		 */
		
		Supplier<String> s = () -> { return "Hello"; };
		System.out.println(s.get());
		
		BooleanSupplier b = () -> { return true; };
		System.out.println(b.getAsBoolean());
		
		DoubleSupplier d = () -> { return 1.5; };
		System.out.println(d.getAsDouble());
		
		IntSupplier i = () -> { return 123; };
		System.out.println(i.getAsInt());
		
		LongSupplier l = () -> { return 12345; };
		System.out.println(l.getAsLong());
	}
}
