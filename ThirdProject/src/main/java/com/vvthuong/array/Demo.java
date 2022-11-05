package com.vvthuong.array;

import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {
		// Demo1();
		// Demo2();
		// Demo3();// min & max
		// Demo4(); // tu viet ra thuat toan rieng, cau truc dl va giai thuat co nhieu
		// thuat toan,
		// thuc ra minh viet nhung khi can dung thi minh cung phai dung ham cua no thoi
		Demo5();
	}

	private static void Demo5() {
		// marks vi tri tuong ung voi so cua tung phan tu string trong names, yeu cau
		// sap xep
		// cai nay khong co cach nao ma sort duoc bang arrays, ma phai tu viet thuat
		// toan sap xep thoi :))
		String[] names = { "Mua", "Xuan", "Con", "En", "Dua", "Thoi", "Thieu", "Quang", "Chin", "Chuc", "Da", "Ngoai",
				"Sau", "Muoi" };
		double[] marks = { 10, 21, 13, 45, 52, 16, 79, 38, 49, 110, 119, 212, 13, 14 };

		for (int i = 0; i < marks.length; i++) {
			System.out.printf("%s : %.1f \n", names[i], marks[i]);

		}
		// sap xep lai chi bang cach tu viet thuat toan nhu demo4()
		// sap xep tang dan theo diem
		for (int i = 0; i < marks.length; i++) {
			for (int j = i + 1; j < marks.length; j++) {
				if (marks[i] > marks[j]) {
					Double temporary001 = marks[i];
					marks[i] = marks[j];
					marks[j] = temporary001;

					String temporary002 = names[i];
					names[i] = names[j];
					names[j] = temporary002;

				}

			}
		}
		System.out.println("----------tang dan theo diem-------");
		for (int i = 0; i < marks.length; i++) {
			System.out.printf("%.1f - %s \n", marks[i], names[i]);

		}
		System.out.println("----------giam dan theo diem-------");
		for (int i = 0; i < marks.length; i++) {
			for (int j = i + 1; j < marks.length; j++) {
				if (marks[i] < marks[j]) {
					Double temporary001 = marks[i];
					marks[i] = marks[j];
					marks[j] = temporary001;

					String temporary002 = names[i];
					names[i] = names[j];
					names[j] = temporary002;

				}

			}
		}
		for (int i = 0; i < marks.length; i++) {
			System.out.printf("%.1f - %s \n", marks[i], names[i]);

		}

	}

	private static void Demo4() {
		int[] ar = { 2, 6, 0, -7, 1, 9, 8, 7 };
		// su dung 2 vong lap, toc do kieu rua bo :))
		// su dung i va j, voi j = i + 1 tuc la sau i, gia thiet la i < j
		// neu ar[i] > ar[j] thi phai dao nguoc lai, hoi kho hieu nhung cu lam di :))
		// left > right thi bo left vao tempo, dat left = right, sau do dat right =
		// tempo - vay la xong, hoac cung co the lam : bo right vao tempo, dat right =
		// left, sau do dat left = tempo, cai nao cung duoc

		System.out.println("ar truoc khi sap xep: " + Arrays.toString(ar));
		Arrays.sort(ar);
		System.out.println("dung arrays.sort(): " + Arrays.toString(ar));

		// tom lai la cai nay truu tuong kho giai thich lam, moi nguoi giai thich 1
		// kieu, can xap xep thi cu dao
		// nguoc no lai, khong la cai nay thi la cai kia :)) khong tang dan thi la giam
		// dan, the thoi
		for (int i = 0; i < ar.length; i++) {
			for (int j = i + 1; j < ar.length; j++) {
				if (ar[i] > ar[j]) {
					int temporary = ar[i];
					ar[i] = ar[j];
					ar[j] = temporary;

				}

			}
		}
		System.out.println("ar sau khi sap xep tang dan: " + Arrays.toString(ar));
		// tom lai la cai nay truu tuong kho giai thich lam, moi nguoi giai thich 1
		// kieu, can xap xep thi cu dao
		// nguoc no lai, khong la cai nay thi la cai kia :)) khong tang dan thi la giam
		// dan, the thoi
		for (int i = 0; i < ar.length; i++) {
			for (int j = i + 1; j < ar.length; j++) {
				if (ar[i] < ar[j]) {
					int temporary = ar[i];
					ar[i] = ar[j];
					ar[j] = temporary;

				}

			}
		}
		System.out.println("ar sau khi sap xep giam dan: " + Arrays.toString(ar));
		// cung co the dung cach don gian hon la viet thuat toan, nhung co truong hop
		// khong the dung cai co san ma phai tu viet, gap truong hop khong co cach nao
		// thi moi dung thoi, dung arrays.sort() sap xep tang dan cung duoc, cha sao,
		// nhung co truong hop
		// phai tu viet, dau phai luc nao cung thuan loi dau.

	}

	private static void Demo3() {
		int[] ar = { 2, 6, 0, -7, 1, 9, 8, 7 };
		int min = ar[0]; // gia su phan tu nay nho nhat, gia su de so sanh.
		int max = ar[1]; // lay element nao cung duoc, khong quan trong.
		int total = 0;
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] < min) {
				min = ar[i];
			}
			if (ar[i] > max) {
				max = ar[i];
			}
			total += ar[i]; // cong don vo thoi.
		}
//		for (int i = 0; i < ar.length; i++) {
//			if (ar[i] > max) {
//				max = ar[i];
//			}
//
//		}
		System.out.println(">> min: " + min);
		System.out.println(">> max: " + max);
		System.out.println(">> max: " + total);
	}

	private static void Demo2() {
		int[] ar = { 2, 6, 0, 7, 1, 9, 8, 7 };
		Arrays.sort(ar);
		System.out.println(">>sort: " + Arrays.toString(ar));
		int i = Arrays.binarySearch(ar, 3);
		System.out.println("index of 7 elemon is: " + i);

	}

	private static void Demo1() {
		int[] ar = { 1, 2, 3, 4, 5 };

		System.out.println(">> Length: " + ar.length);
		System.out.println(">> a[2]: " + ar[2]);
		System.out.println(">> Array to String: " + Arrays.toString(ar));
		ar[2] = ar[1] * 100;
		System.out.println(">> ar[2]=ar[1]*100: " + Arrays.toString(ar));
	}

}
