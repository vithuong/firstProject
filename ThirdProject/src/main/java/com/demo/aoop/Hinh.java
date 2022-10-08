package com.demo.aoop;

public class Hinh {
	protected String name;

	public Hinh(String name) {
		super();
		this.name = name;
	}

	// de protected cho ke thua thi khoi can getter setter cung duoc

	public double getDienTich() {
		// chua biet tinh gi nen cu de return -1 di, co biet hinh gi dau ma tinh
		return -1;
	}
	
	public void print() {
		System.out.println(">> Ten: " + this.name);
		System.out.println(">> Dien Tich: " + this.getDienTich());
	}
}
