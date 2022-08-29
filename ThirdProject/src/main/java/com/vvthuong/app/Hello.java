package com.vvthuong.app;

public class Hello {
	public static void main(String[] args) {
		hello();//fix error because Static method only work with static method.
		//vua roi la to chuc theo huong thu tuc, tu ham nay ta goi ham khac.
	}
	@SuppressWarnings("unused")
	private static void hello() {
		System.out.println("Vi");
		System.out.println("Thuong");
		
		String s = "Vi Thuong";
		int d = 100;
		System.out.printf("%s can nang la %d kg", s, d);

	}
}
