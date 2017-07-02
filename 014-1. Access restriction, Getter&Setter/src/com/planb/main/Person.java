package com.planb.main;

public class Person {
	/*
	 * 캡슐화
	 * - 객체의 속성과 행위를 하나로 묶고
	 * - 실제 구현 내용 일부를 외부에 감추어 은닉한다
	 */
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	// 원래는 getter/setter 에서 값에 대한 검증을 해야 의미있는 접근 제어가 됨
}
