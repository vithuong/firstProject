package com.demo.app;

import com.demo.oop.ChuNhat;

public class TestChuNhat {
	// chi co duy nhat tao ra doi tuong la dung 2 tham so kia
	// neu la hinh vuong thi ta them 1 constructor ben trong doi tuong ChuNhat
	// y nghia cua constructor la cu viet 1 constructor se tao ra 1 cach tao ra doi tuong
	public static void main(String[] args) {
//		ChuNhat cn = new ChuNhat(3, 4);
//		double dt = cn.getDienTich();
		ChuNhat cn = new ChuNhat(3);
		double dt = cn.getDienTich();
		//cn.print();
		//cai nay goi la overloading
		cn.print("thong tin hinh chu nhat");

	}

}
