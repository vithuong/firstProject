package com.demo.aoop;

public class HinhVuong extends ChuNhat {
	double canh;

	// bo String name di, khong co ten nhe
	public HinhVuong(double canh) {
		super(canh, canh);
		this.name = "Hinh Vuong";
	}
	// dien tich cua no khong can viet, ta viet ben trong hinh chu nhat roi
}
