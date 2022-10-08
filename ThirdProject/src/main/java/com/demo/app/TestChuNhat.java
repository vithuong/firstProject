package com.demo.app;

import com.demo.oop.ChuNhat;

public class TestChuNhat {
	public static void main(String[] args) {
		ChuNhat cn = new ChuNhat(3);
		cn.setDai(44);
		double dt = cn.getDienTich();
		cn.print("thong tin hinh chu nhat");	
	}
}
