package com.demo.aoop;

public class HinhTron extends Hinh {
	double banKinh;
	// bo String name di, khong co ten nhe
	public HinhTron(double banKinh) {
		super("Hinh Tron");
		this.banKinh = banKinh;
	}

	// tinh dien tich hinh tron
	@Override
	public double getDienTich() {
		return Math.PI * Math.pow(this.banKinh, 2);
	}
}
