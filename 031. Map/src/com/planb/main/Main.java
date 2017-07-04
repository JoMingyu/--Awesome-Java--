package com.planb.main;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {
		/*
		 * Map
		 * Key로 값을 판별
		 * 
		 * HashMap
		 * TreeMap
		 * Hashtable
		 */
		
		// HashMap
		HashMap<String, Integer> hashMap = new HashMap<>();
		hashMap.put("key1", 1);
		hashMap.put("key2", 2);
		// 키와 값으로 null이 허용
		
		// Map을 반복시키는 방법 1. keySet에 대해 for-each
		for(String key : hashMap.keySet()) {
			System.out.println(hashMap.get(key));
		}
		hashMap.remove("key1");
		
		// TreeMap
		TreeMap<String, Integer> treeMap = new TreeMap<>();
		treeMap.put("c", 3);
		treeMap.put("a", 1);
		treeMap.put("b", 2);
		// 자동 정렬
		
		// Map을 반복시키는 방법 2. Iterator(반복자) 이용
		Iterator<String> it = treeMap.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.println(treeMap.get(key));
		}
		
		// Hashtable
		Hashtable<String, Integer> hashtable = new Hashtable<>();
		hashtable.put("key1", 1);
		/*
		 *  키와 값으로 null이 허용되지 않음
		 *  동기화 지원
		 */
		
		// Map을 반복시키는 방법 3. Map.Entry 이용
		for(Map.Entry<String, Integer> entry : hashtable.entrySet()) {
			System.out.println(entry.toString());
		}
	}
}
