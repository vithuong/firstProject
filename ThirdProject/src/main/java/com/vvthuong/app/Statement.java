package com.vvthuong.app;

public class Statement {

	public static void main(String[] args) {
		ptb2();

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
