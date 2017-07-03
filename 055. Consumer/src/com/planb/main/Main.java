package com.planb.main;

import java.util.function.*;

public class Main {
	public static void main(String[] args) {
		/*
		 * Functional Interface
		 * - Consumer
		 * .accept()
		 * 매개값이 있고 리턴값이 없음
		 * 
		 * Consumer, BiConsumer
		 * DoubleConsumer, ObjDoubleConsumer
		 * IntConsumer, ObjIntConsumer
		 * LongConsumer, ObjLongConsumer
		 */
		
		Consumer<String> c = t -> System.out.println("Consumer " + t);
		BiConsumer<String, Integer> bc = (t, u) -> System.out.println("BiConsumer " + t + " " + u);
		/*
		 * 일반적인 Consumer
		 * Consumer<T>
		 * BiConsumer<T, U>
		 */
		c.accept("Hello");
		bc.accept("Hello", 123);
		
		DoubleConsumer dc = d -> System.out.println("DoubleConsumer " + d);
		IntConsumer ic = i -> System.out.println("IntConsumer " + i);
		LongConsumer lc = l -> System.out.println("LongConsumer " + l);
		/*
		 * Consumer가 제네릭인데 왜 쓰는지 모르겠는 특화된 Consumer
		 * DoubleConsumer
		 * IntConsumer
		 * LongConsumer
		 */
		dc.accept(1.5);
		ic.accept(8);
		lc.accept(1500);
		
		ObjDoubleConsumer<String> odc = (t, d) -> System.out.println("ObjDoubleConsumer " + t + " " + d);
		ObjIntConsumer<String> oic = (t, i) -> System.out.println("ObjIntConsumer " + t + " " + i);
		ObjLongConsumer<String> olc = (t, l) -> System.out.println("ObjLongConsumer " + t + " " + l);
		/*
		 * BiConsumer 쓰지 왜 쓰는지 모르겠는 특화된 Consumer
		 * ObjDoubleConsumer<T>
		 * ObjIntConsumer<T>
		 * ObjLongConsumer<T>
		 */
		odc.accept("Hello", 1.5);
		oic.accept("Hello", 123);
		olc.accept("Hello", 156);
	}
}
