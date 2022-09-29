package com.demo.app;

import com.demo.plmpoop.Hinh;

public class ChuNhat extends Hinh {
	double rong;
	double dai;

	public ChuNhat(double rong, double dai) {
		// super la goi lai constructor cua lop cha
		super("Chu Nhat");
		this.rong = rong;
		this.dai = dai;
	}

	@Override
	public double getDienTich() {
		return this.dai * rong;
	}
}
