package com.vvthuong.app;

public class Function {

	public static void main(String[] args) {
		demo1();

	}

	private static void demo1() {
		double n = 2.67;
		
		double x = Math.sqrt(n);
		double y = Math.round(n);
		double z = Math.pow(n, 3);
		double w = Math.random();
		double a = Math.ceil(n);
		double b = Math.floor(n);
		
		System.out.println("sqrt = "+ x);
		System.out.println("round = "+ y);
		System.out.println("pow = "+ z);
		System.out.println("random = "+ w);
		System.out.println("ceil = "+ a);
		System.out.println("floor = "+ b);
				
		
	}

}
