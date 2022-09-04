package com.vvthuong.app;

public class Statement {

	public static void main(String[] args) {
		// ptb2();
		// dayInMonth();
		detachmentNumber();

	}

	private static void detachmentNumber() {
		int n = 123, total = 0, count = 0, reverse = 0;
		// Xuat tat ca cac chu so cua n ra man hinh ( bat dau tu hang don vi)
		while (n > 0) {
			int x = n % 10;
			System.out.println(x);
			n = n / 10;
			total += x;
			if (x % 2 == 1) {
				count++;
			}
			reverse = reverse * 10 + x;
		}
		// Xuat tong cac chu so cua n
		System.out.println("Tong: " + total);
		// Xuat cac chu so le cua n
		System.out.println("Tong so so le: " + count);
		// Xuat cac uoc so cua n
		int m = 7, i = 1, total2 = 0;
		System.out.println("cac uoc so cua " + m + " la: ");
		while (i < m / 2) {
			if (m % i == 0) {
				System.out.println(i);
				total2 += i;
			}
			i++;
		}
		// Xuat so dao nguoc cua n
		System.out.println("so dao nguoc = " + reverse);
		// Kiem tra n co phai so hoan thien hay khong
		if (total2 == m) {
			System.out.println(m + " la so hoan thien");
		} else {
			System.out.println(m + " khong phai so hoan thien");
		}
		// Kiem tra n co phai so nguyen to hay khong
		boolean isNguyenTo = true;
		i = 2;
		while (i < m / 2) {
			if (m % i == 0) {
				isNguyenTo = false;
			}
			i++;
		}
		System.out.println(isNguyenTo ? m + " la so nguyen to" : m + " khong phai la so nguyen to");
	}

	private static void dayInMonth() {
		// int year = 2022, month = 9;
		// int year = 2022, month = 8;
		int year = 2024, month = 2;
		switch (month) {
		case 2:
			int days = (year % 4 == 0 & year % 100 != 0) ? 29 : 28;
			System.out.printf("Son ngay cua thang 2/%d la %d", year, days);
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.printf("So ngay cua thang %d/%d la 30", month, year);
			break;
		default:
			System.out.printf("So ngay cua thang %d/%d la 31", month, year);
			break;
		}

	}

	private static void ptb2() {
		// co the dung Scanner de nhap tu ban phim, nhung ta gan truoc cung duoc.
		// double a = 1, b = 2, c = 1; // nghiem kep
		// double a = 2, b = 6, c = 7; // vo nghiem
		double a = -2, b = 6, c = 7; // 2 nghiem phan biet
		double delta = Math.pow(b, 2) - 4 * a * c;
		if (delta < 0) {
			System.out.println("Vo Nghiem");
		} else if (delta == 0) {
			double x0 = -b / (2 * a);
			System.out.println("Nghiem Kep x0 = " + x0);
		} else {
			double x1 = (-b + Math.sqrt(delta) / (2 * a));
			double x2 = (-b - Math.sqrt(delta) / (2 * a));
			System.out.println("Hai nghiem phan biet: ");
			System.out.println(">>x1 = " + x1);
			System.out.println(">>x2 = " + x2);
		}
	}

}
