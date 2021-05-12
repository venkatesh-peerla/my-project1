package com.ex;

public class Test {

	public static void main(String[] args) {
		
		calling(new Ctwo());
		

	}

	private static void calling(Cone c) {
	Object o = c.m1();
		System.out.println(((Integer)o).intValue());
	}

}
