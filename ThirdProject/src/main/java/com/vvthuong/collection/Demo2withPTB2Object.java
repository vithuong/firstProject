package com.vvthuong.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.demo.oop.PhuongTrinhBacHaiObject;

public class Demo2withPTB2Object {
	// collection dung rat nhieu, tap trung vao phan nay, de hieu thoi.
	public static void main(String[] args) {
		// demo1();
		demo2();

	}

	// tao ra 1 list de chua phuong trinh bac 2
	private static void demo2() {
		List<PhuongTrinhBacHaiObject> list = new ArrayList<>();
		list.add(new PhuongTrinhBacHaiObject(2, 3, -5));
		list.add(new PhuongTrinhBacHaiObject(2, 4, 2));
		list.add(new PhuongTrinhBacHaiObject(1, 2, 3));
		
		Comparator<PhuongTrinhBacHaiObject> soSanhComparator = new Comparator<PhuongTrinhBacHaiObject>() {
			@Override
			public int compare(PhuongTrinhBacHaiObject o1, PhuongTrinhBacHaiObject o2) {
				// TODO Auto-generated method stub
				// bay gio no dang sap xep theo he so b
				if (o1.getB() <  o2.getB()) {
					return -1;
				}
				if (o1.getB() == o2.getB()) {
					return 0;
				}
				return 1;
				
			}
		};
		
		Collections.sort(list, soSanhComparator);
		System.out.println(list.toString());

		list.forEach(p -> {
			p.giaiPhuongTrinhBacHai();
			System.out.println("--------");
		});

	}

	private static void demo1() {
		List<Integer> list = Arrays.asList(2, 6, 0, 7, 1, 9, 8, 7);
		// vong lap for each
		for (Integer x : list) {
			System.out.println(x);
		}
		System.out.println("-----xap sep----");
		Collections.sort(list);
		// vong lap lambda, 2 vong lap tuong duong nhau nhe
		list.forEach(x -> {
			System.out.println(">> " + x);
		});
		System.out.println("----tim kiem-----");
		// tim kiem
		int i = Collections.binarySearch(list, 7);
		System.out.println("vi tri cua 7 la: " + i);
		System.out.println("----hoan vi 1<->4----");
		// trao doi 2 vi tri cho nhau.
		Collections.swap(list, 1, 2);
		System.out.println(list);
		System.out.println("----xoay-----");
		// xoay
		Collections.rotate(list, 2);
		System.out.println(list);

		System.out.println("----ngau nhien-----");
		// ngau nhien, neu no khong viet thi minh tu viet cung duoc het.
		// day la ham rat manh cua class collections, 1 lop tien ich giup ta duoc rat
		// nhieu thu
		Collections.shuffle(list);
		System.out.println(list);

	}

}
