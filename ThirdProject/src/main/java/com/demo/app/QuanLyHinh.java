package com.demo.app;

import com.demo.aoop.ChuNhat;
import com.demo.aoop.Hinh;
import com.demo.aoop.HinhTron;
import com.demo.aoop.HinhVuong;

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
