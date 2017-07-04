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
		 * Key�� ���� �Ǻ�
		 * 
		 * HashMap
		 * TreeMap
		 * Hashtable
		 */
		
		// HashMap
		HashMap<String, Integer> hashMap = new HashMap<>();
		hashMap.put("key1", 1);
		hashMap.put("key2", 2);
		// Ű�� ������ null�� ���
		
		// Map�� �ݺ���Ű�� ��� 1. keySet�� ���� for-each
		for(String key : hashMap.keySet()) {
			System.out.println(hashMap.get(key));
		}
		hashMap.remove("key1");
		
		// TreeMap
		TreeMap<String, Integer> treeMap = new TreeMap<>();
		treeMap.put("c", 3);
		treeMap.put("a", 1);
		treeMap.put("b", 2);
		// �ڵ� ����
		
		// Map�� �ݺ���Ű�� ��� 2. Iterator(�ݺ���) �̿�
		Iterator<String> it = treeMap.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.println(treeMap.get(key));
		}
		
		// Hashtable
		Hashtable<String, Integer> hashtable = new Hashtable<>();
		hashtable.put("key1", 1);
		/*
		 *  Ű�� ������ null�� ������ ����
		 *  ����ȭ ����
		 */
		
		// Map�� �ݺ���Ű�� ��� 3. Map.Entry �̿�
		for(Map.Entry<String, Integer> entry : hashtable.entrySet()) {
			System.out.println(entry.toString());
		}
	}
}
