package com.planb.main;

public class Main {
	public static void main(String[] args) {
		String s = "";
		s += "Hello ";
		s += "World";
		/*
		 * String�� immutable(�Һ�)
		 * ���ڿ� ������ ���� ��� ���ο� ���ڿ��� �����ǰ� �ٽ� ���ϵ�
		 * �ӵ��� ������
		 */
		
		StringBuilder builder = new StringBuilder();
		/*
		 * �ϳ��� ��ü�� ������ ���ڿ��� �߰��ϰ� ������ �� ����
		 * �ӵ��� ������
		 */
		builder.append("Hello ");
		builder.append("World");
		
		StringBuffer buffer = new StringBuffer();
		/*
		 * �޼ҵ尡 ����ȭó�� �Ǿ� ����
		 * Thread-Safe
		 * StringBuilder���� �ӵ��� ������
		 */
		buffer.append("Hello ");
		buffer.append("World");
	}
}
