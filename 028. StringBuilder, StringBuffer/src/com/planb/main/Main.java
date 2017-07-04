package com.planb.main;

public class Main {
	public static void main(String[] args) {
		String s = "";
		s += "Hello ";
		s += "World";
		/*
		 * String은 immutable(불변)
		 * 문자열 내용이 변할 경우 새로운 문자열이 생성되고 다시 리턴됨
		 * 속도가 느리다
		 */
		
		StringBuilder builder = new StringBuilder();
		/*
		 * 하나의 객체를 가지고 문자열을 추가하고 삭제할 수 있음
		 * 속도가 빠르다
		 */
		builder.append("Hello ");
		builder.append("World");
		
		StringBuffer buffer = new StringBuffer();
		/*
		 * 메소드가 동기화처리 되어 있음
		 * Thread-Safe
		 * StringBuilder보단 속도가 느리다
		 */
		buffer.append("Hello ");
		buffer.append("World");
	}
}
