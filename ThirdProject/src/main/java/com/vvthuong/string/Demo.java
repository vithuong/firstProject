package com.vvthuong.string;

public class Demo {
	public static void main(String[] args) {
		// demo1();
		demo2();
	}

	

	private static void demo2() {
		String s = "1,2'3' 5,6,7";
		String[] ss = s.split("[,' ]+");
		for (String a : ss) {
			int b = Integer.parseInt(a);
			//System.out.println(b);
			// tach chuoi s cho vao arrray, sau do duyet array, chuyen string sang int va lay so le
			if (b % 2 == 1) {
				System.out.println(b);
			}
			
		}
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
		System.out.println(">> Start With: " + s.startsWith("thong"));

	}
}
