package com.planb.main;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class Main {
	public static void main(String[] args) {
		/*
		 * �÷��� �����ӿ�ũ
		 * Collection �������̽� �Ʒ��� List, Set, Map �������̽��� �ְ�
		 * �� �������̽����� �����ؼ� ���� Ŭ������ ������
		 */
		
		/*
		 * List
		 * ������ ����Ʈ�� ������ �Ǻ�
		 * 
		 * ArrayList
		 * Vector
		 * LinkedList
		 * Stack
		 */
		
		// ArrayList�� ��������, ����Ʈ ��ü�� �����ϴ� �������� ���
//		Collection list = new ArrayList<String>();
//		List<String> list = new ArrayList<String>();
//		ArrayList<String> list = new ArrayList<String>();
		
		// ArrayList
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("First");
		arrayList.add("Second");
		arrayList.add("Third");
		arrayList.remove(0);
		// ���� �ε����� �����Ǹ� �� ���� �ε����� ������ �Ʒ��� �̵�
		System.out.println(arrayList.get(0));
		
		// Vector
		Vector<String> vector = new Vector<>();
		vector.add("First");
		vector.add("Second");
		// ArrayList�� �Ȱ����� Thread-Safe�ϴٴ� Ư¡�� ����
		
		// LinkedList
		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.add("First");
		linkedList.add("Second");
		linkedList.add("Third");
		linkedList.add(2, "Another");
		/*
		 * 2�� �ڸ��� �� ����
		 * �ٸ� List �÷����� ��� �߰��� ���� ���������� ����
		 * ���� �� ������ �ּҸ� �����ϴ� ������ linked list�� ���� �߰��� �����ϰ� �����ϴ� ���� ���� ����
		 */
		System.out.println(linkedList.toString());
		
		// Stack
		Stack<String> stack = new Stack<>();
		stack.push("First");
		stack.push("Second");
		stack.pop();
		/*
		 * �츮�� �ƴ� �� �ڷᱸ�� ����
		 * LIFO
		 */
		System.out.println(stack.toString());
	}
}
