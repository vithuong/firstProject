package com.vvthuong.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Demo {
	public static void main(String[] args) {
		// demo1();
		// demo2();
		// demo3();
		// demo4();
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
				System.out.println(nameOnly);
			}
		}

	}

	private static void demo2() {
		String s = "1,2'2' 5,6,7";

		byte[] tt = s.getBytes();
		System.out.println(s);
		System.out.println(">>> in thu" + tt);
		System.out.println(">>> HTML Encoding (Character Sets)" + Arrays.toString(tt));

		// Convert String to Array
		String[] ss = s.split("[,' ]+");
		System.out.println("String split to Array \n " + "print Array ra phai dung library Arrays.toString(): "
				+ Arrays.toString(ss));

		// Convert Array to Set
		Set<Integer> set = new HashSet<Integer>();
		for (String d : ss) {
			int e = Integer.parseInt(d);
			set.add(e);
		}
		System.out.println("Array to Set: " + set.toString());

		// Convert Array to List
		List<Integer> list = new ArrayList<Integer>();
		for (String f : ss) {
			int g = Integer.parseInt(f);
			list.add(g);
		}
		System.out.println("Array to List: " + list.toString());
		// Convert List to Set
		Set<Integer> set1 = new HashSet<Integer>();
		set1.addAll(list);
		System.out.println("Convert List to set: " + set1.toString());

		// Convert Set to List
		List<Integer> list1 = new ArrayList<Integer>();
		list1.addAll(set);
		System.out.println("Cnvert Set to List: " + list1.toString());

		// Print even number to Screen.
		for (String a : ss) {
			int b = Integer.parseInt(a);
			if (b % 2 == 0) {
				System.out.println("evenNumber: " + b);
			}
		}
		// Mot cach khac chuyen tu Array sang List kieu tuong ung.
		List<String> listNew = Arrays.asList(ss);
		System.out.println("cach khac Arrays_as_List nhanh: " + listNew);
		// Tu list doi sang
		Set<String> setNew = new HashSet<String>();
		setNew.addAll(listNew);
		System.out.println("chuyen cai list nhanh ben tren thanh set add all: " + setNew);

		// binary Search trong Array
		int iBinarySearch = Arrays.binarySearch(ss, "7");
		System.out.println("vi tri so string 7 la: " + iBinarySearch);

		// Sap xep mang theo thu tu tang dan
		Arrays.sort(ss);
		System.out.println("Array sau khi dung Arrays.sort(ss) se la: " + Arrays.toString(ss));

		// Gan 1 gia tri cho tat ca cac phan tu trong mang
		Arrays.fill(ss, "7");
		System.out.println("gan str 7 cho tat ca cac element trong mang: " + Arrays.toString(ss));
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
