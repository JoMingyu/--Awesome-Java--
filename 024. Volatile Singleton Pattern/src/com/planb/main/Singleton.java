package com.planb.main;

public class Singleton {
//	private static final Singleton instance = new Singleton();
	// 사용되지도 않았는데 미리 생성되어 자원이 낭비됨
	
	private volatile static Singleton instance;
	/*
	 * getInstance() 메소드에서 사용되는 DCL은
	 * 메모리 모델, 최적화(재배치), 리오더링과 같은 복잡한 문제로 동작하지 않을 수 있다 
	 */
	
	private Singleton() {}
	
	public static Singleton getInstance() {
		if(instance == null) {
			synchronized(Singleton.class) {
				if(instance == null) {
					/*
					 * DCL(Double-Checking Locking)
					 * 인스턴스가 null이면 동기화를 얻고 인스턴스화
					 */
					instance = new Singleton();
				}
			}
		}
		return instance;
	}
}
