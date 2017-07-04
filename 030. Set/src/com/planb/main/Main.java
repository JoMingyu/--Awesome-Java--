package com.planb.main;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		/*
		 * Set
		 * 집합을 정의, 요소의 중복을 허용하지 않음
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
		// 가장 빠른 임의 접근 속도, 순서를 예측할 수 없음
		
		// LinkedHashSet
		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
		linkedHashSet.add("value1");
		linkedHashSet.add("value2");
		// Set에 삽입된 순서를 부여하기 위해 1.4부터 등장
		
		// TreeSet
		TreeSet<String> treeSet = new TreeSet<>();
		treeSet.add("c");
		treeSet.add("b");
		treeSet.add("a");
		for(String s : treeSet) {
			System.out.println(s);
		}
		// Comparator에 의해 원소가 정렬됨
	}
}
