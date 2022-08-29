package com.vvthuong.app;

public class Hello {
	public static void main(String[] args) {
		hello();//error because Static method only work with static method.
	}
	private void hello() {
		System.out.println("Vi");
		System.out.println("Thuong");
		
		String s = "Vi Thuong";
		int d = 100;
		System.out.printf("%s can nang la %d kg", s, d);

	}
}
