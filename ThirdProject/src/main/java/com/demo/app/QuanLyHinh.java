package com.demo.app;

import com.demo.plmpoop.Hinh;

public class QuanLyHinh {

	public static void main(String[] args) {
		Hinh chuNhat = new ChuNhat(3, 4);
		Hinh hinhVuong = new HinhVuong(4);
		//Hinh hinhTron = new HinhTron(3);
		HinhTron hinhTron = new HinhTron(3);

		chuNhat.print();
		hinhVuong.print();
		hinhTron.print();
	}

}
