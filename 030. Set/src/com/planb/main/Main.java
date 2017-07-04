package com.planb.main;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		/*
		 * Set
		 * ������ ����, ����� �ߺ��� ������� ����
		 * 
		 * HashSet
		 * LinkedHashSet
		 * TreeSet
		 */
		
		// HashSet
		HashSet<String> hashSet = new HashSet<>();
		hashSet.add("value1");
		hashSet.add("value2");
		for(String s : hashSet) {
			System.out.println(s);
		}
		hashSet.remove("value1");
		// ���� ���� ���� ���� �ӵ�, ������ ������ �� ����
		
		// LinkedHashSet
		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
		linkedHashSet.add("value1");
		linkedHashSet.add("value2");
		// Set�� ���Ե� ������ �ο��ϱ� ���� 1.4���� ����
		
		// TreeSet
		TreeSet<String> treeSet = new TreeSet<>();
		treeSet.add("c");
		treeSet.add("b");
		treeSet.add("a");
		for(String s : treeSet) {
			System.out.println(s);
		}
		// Comparator�� ���� ���Ұ� ���ĵ�
	}
}
