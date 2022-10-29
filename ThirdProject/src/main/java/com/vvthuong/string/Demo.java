package com.vvthuong.string;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		// demo1();
		// demo2();
		// demo3();
		demo4();
	}

	private static void demo4() {
		// kiem tra email
		// String s = "abc.def.ijk.lmn.opw.twx-yz.com";
		String s = "abc.def.ijk.lmn.opw.twx@yz.com";
		String reEmail = "\\w+(\\.\\w+)+@\\w+(\\.\\w+){1,2}";
		System.out.println(s.matches(reEmail));
		// kiem tra bien so xe sai gon
		String s1 = "52A3-123.45";
		String reEmail1 = "5\\d[A-Z]\\d-((\\d{4})|(\\d{3}\\.\\d{2}))";
		System.out.println(s1.matches(reEmail1));

	}

	private static void demo3() {
		String[] names = new String[5];
		Scanner scanner = new Scanner(System.in);

		System.out.println("vui long nhap ho va ten 5 nguoi: ");
		for (int i = 0; i < names.length; i++) {
			names[i] = scanner.nextLine();

		}
		// xuat hovaten cua nhung nguoi co ho la nguyen va ten la tuan
		for (String name : names) {
			if (name.startsWith("Nguyen") || name.endsWith("Tuan")) {
				System.out.println(name.toUpperCase());
			}
		}
		// xuat ten cua nhung nguoi co ho lot la thi
		for (String name : names) {
			if (name.contains("thi")) {
				String nameOnly = name.substring(name.lastIndexOf(" ") + 1);
			}
		}

	}

	private static void demo2() {
		String s = "1,2'3' 5,6,7";
		String[] ss = s.split("[,' ]+");
		for (String a : ss) {
			int b = Integer.parseInt(a);
			// System.out.println(b);
			// tach chuoi s cho vao arrray, sau do duyet array, chuyen string sang int va
			// lay so le
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
