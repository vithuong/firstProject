package com.vvthuong.app;

public class For {
	public static void main(String[] args) {
		// demo4();
		// demo3();
		// demo2();
		demo1();
	}

	private static void demo4() {
		int[] a = { 1, 2, 3, 4, 5, 6 };
		int total = 0;

		// for each
		for (int i : a) {
			if (i % 2 == 1) {
				total += i;
			}
		}
		System.out.println("tong cac so le la: " + total);

	}

	private static void demo3() {
		int[] a = { 1, 2, 3, 4, 5, 6 };
		int total = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 1) {
				total += a[i];
			}
		}
		System.out.println("tong cac so le la: " + total);

	}
	
	private static void demo2() {
		int[] a = { 1, 2, 3, 4, 5, 6 };
		for (int i = 0; i < a.length; i++) {
			System.out.printf("a[%d]=%d \r \n", i, a[i]);
		}

	}
	// bang cuu chuong - multiplication tables
	private static void demo1() {
		for (int i = 1; i <= 10; i++) {
			System.out.printf("%d * %d = %d \r \n", 7, i, 7 * i);

		}
	}
}
