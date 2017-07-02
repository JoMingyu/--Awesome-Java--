package com.planb.main;

public class Laptop implements Bootable {
	@Override
	public void boot() {
		System.out.println("Laptop is booting");
	}
}
