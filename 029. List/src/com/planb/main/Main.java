package com.planb.main;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class Main {
	public static void main(String[] args) {
		/*
		 * 컬렉션 프레임워크
		 * Collection 인터페이스 아래에 List, Set, Map 인터페이스가 있고
		 * 그 인터페이스들을 구현해서 세부 클래스로 나뉜다
		 */
		
		/*
		 * List
		 * 순서로 리스트의 값들을 판별
		 * 
		 * ArrayList
		 * Vector
		 * LinkedList
		 * Stack
		 */
		
		// ArrayList를 기준으로, 리스트 객체를 생성하는 여러가지 방법
//		Collection list = new ArrayList<String>();
//		List<String> list = new ArrayList<String>();
//		ArrayList<String> list = new ArrayList<String>();
		
		// ArrayList
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("First");
		arrayList.add("Second");
		arrayList.add("Third");
		arrayList.remove(0);
		// 하위 인덱스가 삭제되면 그 상위 인덱스의 값들이 아래로 이동
		System.out.println(arrayList.get(0));
		
		// Vector
		Vector<String> vector = new Vector<>();
		vector.add("First");
		vector.add("Second");
		// ArrayList와 똑같지만 Thread-Safe하다는 특징이 있음
		
		// LinkedList
		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.add("First");
		linkedList.add("Second");
		linkedList.add("Third");
		linkedList.add(2, "Another");
		/*
		 * 2의 자리에 값 삽입
		 * 다른 List 컬렉션의 경우 중간에 값을 끼워넣으면 느림
		 * 값과 값 사이의 주소를 참조하는 형식의 linked list를 쓰면 중간에 삽입하고 삭제하는 등의 일이 빠름
		 */
		System.out.println(linkedList.toString());
		
		// Stack
		Stack<String> stack = new Stack<>();
		stack.push("First");
		stack.push("Second");
		stack.pop();
		/*
		 * 우리가 아는 그 자료구조 스택
		 * LIFO
		 */
		System.out.println(stack.toString());
	}
}
