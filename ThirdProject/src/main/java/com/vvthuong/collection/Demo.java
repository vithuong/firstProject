package com.vvthuong.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Demo {
	public static void main(String[] args) {
		demo1();
		demo2();
	}

	private static void demo2() {
		List<Integer> list1 = new ArrayList<>();
		list1.add(100);
		list1.add(200);
		list1.add(200);
		
		List<Integer> list2 = new ArrayList<>();
		list2.add(100);
		list2.add(300);
		
		System.out.println(list1.size());
		System.out.println(list1.isEmpty());
		System.out.println(list1.get(1));
		
		list1.removeAll(list2);
		System.out.println(list1.toString());
		System.out.println(list1);
	}

	private static void demo1() {
		List<Integer> list = new ArrayList<>();
		list.add(100);
		list.add(200);
		list.add(200);
		System.out.println(list.toString());
		
		Set<Integer> set = new TreeSet<>();
		set.add(10);
		set.add(20);
		set.add(20);
		System.out.println(set.toString());
		
		set.addAll(list);
		System.out.println(set.toString());
		
	}
}
