package com.vvthuong.app;

public class Statement {

	public static void main(String[] args) {
		// ptb2();
		dayInMonth();
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
