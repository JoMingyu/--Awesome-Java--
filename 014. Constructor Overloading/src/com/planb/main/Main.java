package com.planb.main;

public class Main {
	public static void main(String[] args) {
		Tree appleTree = new Tree("Apple Tree", 180);
		Tree lemonTree = new Tree("Lemon Tree", 150);
		Tree unknownTree = new Tree();
		
		System.out.println(appleTree.getInfo());
		System.out.println(lemonTree.getInfo());
		System.out.println(unknownTree.getInfo());
	}
}
