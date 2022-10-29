package com.vvthuong.string;

public class Demo {
	public static void main(String[] args) {
		demo1();
	}

	private static void demo1() {
		String s = "Xuat thong tin hinh chu nhat ra man hinh    ";
		
		System.out.println(">> Chieu Dai Leng(): " + s.length());
		System.out.println(">> Hoa Thuong toUpperCase: " + s.toUpperCase() + " >> " + s.toLowerCase());
		System.out.println(">> cat bo khoang trang Trim(): " + s.trim());
		System.out.println(">> Chuoi con sub String: " + s.substring(5, 10));
		System.out.println(">> co chua contains : " + s.contains("hinh"));
		System.out.println(">> indexOf : " + s.indexOf("hinh"));
		System.out.println(">> Last indexOf : " + s.lastIndexOf("hinh"));
		System.out.println(">> Start With: " + s.startsWith("Xuat"));
		
		
		
	}
}
