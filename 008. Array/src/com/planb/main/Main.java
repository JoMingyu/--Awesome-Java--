package com.planb.main;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		/*
		 * �迭�� ���� Ÿ��
		 * 
		 * ���� Ÿ���� ����
		 * 1. Ŭ����
		 * 2. �������̽�
		 * 3. ������(Enum)
		 * 4. �迭
		 */
		
		int[] array;
		// ���� 1
		int array2[];
		// ���� 2
		
		array = new int[10];
		// �⺻������ �ν��Ͻ�ȭ
		
		int[] array3 = new int[]{1, 2, 3};
		// ���ͷ� �ʱ�ȭ 1
		
		int[] array4 = {1, 2, 3};
		// ���ͷ� �ʱ�ȭ 2
		
		array4[0] = 3;
		array4[1] = 5;
		Arrays.sort(array4);
		// Arrays Ŭ������ �̿��� ����
		
		for(int i = 0; i < array4.length; i++) { // length �ʵ�� final
			System.out.println(array4[i]);
		}
	}
}
