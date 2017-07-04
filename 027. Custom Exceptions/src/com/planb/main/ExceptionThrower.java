package com.planb.main;

public class ExceptionThrower {
	public static void access() throws CustomEx {
		throw new CustomEx("던진다 예외");
	}
}
