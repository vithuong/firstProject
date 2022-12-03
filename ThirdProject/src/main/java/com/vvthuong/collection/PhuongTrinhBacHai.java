package com.vvthuong.collection;

public class PhuongTrinhBacHai {
	double a, b, c;

	public PhuongTrinhBacHai(double a, double b, double c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}
	// Class nay de mo ta cai phuong trinh bac 2.
	// Delta la phuong thuc noi bo nen de private
	// Giai PT la cong khai
	// tao ra 1 constructor de dua abc vao

	private double getDelta() {
		return Math.pow(b, 2) - 4 * a * c;
	}

	public void giaiPhuongTrinhBacHai() {
		double delta = this.getDelta();
		if (delta < 0) {
			System.out.println(">> vo nghiem");
		} else if (delta == 0) {
			double x0 = b / (2 * a);
			System.out.println(">> nghiem kep x0 = " + x0);
		} else {
			double x1 = (-b + Math.sqrt(delta)) / (2 * a);
			double x2 = (-b - Math.sqrt(delta)) / (2 * a);
			System.out.println(">> phuong trinh co 2 nghiem phan biet");
			System.out.println(" x1 = " + x1);
			System.out.println(" x2 = " + x1);
		}
	}
}
