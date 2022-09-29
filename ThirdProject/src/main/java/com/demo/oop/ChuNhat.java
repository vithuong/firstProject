package com.demo.oop;

public class ChuNhat {
	private double rong;
	private double dai;

	public ChuNhat(double side) {
		this(side, side);
	}

	
	

	public ChuNhat(double rong, double dai) {
		super();
		this.rong = rong;
		this.dai = dai;
	}




	public double getRong() {
		return rong;
	}

	public void setRong(double rong) {
		this.rong = rong;
	}

	public double getDai() {
		return dai;
	}

	public void setDai(double dai) {
		this.dai = dai;
	}

	public double getDienTich() {
		return this.rong * this.dai;
	}

	public double getChuVi() {
		return (this.rong + this.dai) * 2;
	}

	public void print() {
		System.out.println(">> chieu rong: " + this.rong);
		System.out.println(">> chieu dai: " + this.dai);
		System.out.println(">> dien tich: " + this.getDienTich());
		System.out.println(">> chu vi: " + this.getChuVi());
	}

	public void print(String message) {
		System.out.println(message);
		this.print();
	}

}
