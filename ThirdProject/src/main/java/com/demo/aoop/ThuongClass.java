package com.demo.aoop;

public class ThuongClass implements ThuongInterface{

	// override o day thi no chay o day
	// neu khong override thi no chay o phan default interface kia
	// viet cung duoc ma khong viet cung duoc.
	// no la default co nghia la no chay duoc, cho du minh khong viet 
	// gi o do het. mien no la default, ok khong sao het.
	// va chung ta lam cho no gon cai code cua minh di
	@Override
	public void m1() {
		System.out.println("m1() o class override");
		
	}

	@Override
	public int m2(int a, int b) {
		System.out.println("day la o class override m2() tu interface ");
		return 0;
	}

}
