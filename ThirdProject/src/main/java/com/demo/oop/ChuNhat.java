package com.demo.oop;

// hoc ham theo kieu doc huong dan o document
// co kieu type thi return ve kieu gi
// co kieu void thi tham so la gi
// THU VIEN VIET KHA NHIEU, CHI VIEC DUNG HAM DO THOI. VIET LA VIEC CUA HO, DUNG LA VIEC CUA TA.
// giong nhu system.out.print() thi ta dau can biet ham do viet gi, chi viec su dung no thoi hehe
// dung cai lop nay, cai lop nay viet ra no nam im do no khong chay duoc dau.
// su dung lop khac de chay no.
public class ChuNhat {
	// cai nay goi la field
	double rong;
	double dai;

	// contructor trung ten class
	// bo width vao cai rong, bo length vao cai dai
	// ta co 3 phuong thuc, 1 contructor, 2 field
	public ChuNhat(double side) {
		// goi lai contructor ben duoi
		this(side, side);
	}

	// tham so o day goi la parameter hay aguiment deu duoc nhe.
	public ChuNhat(double width, double length) {
		this.rong = width;
		this.dai = length;
	}

	// ke den viet 2 phuong thuc de thuc hien 2 hanh vi la tinh dien tich va tinh
	// chu vi
	// tinh dien tich
	/**
	 * Tinh Dien Tich
	 * 
	 * @return Dien tich neu kieu cua ham khac void, void la khong co gi thi bat
	 *         buoc ben trong phuong thuc phai co lenh return return ve cai gia tri
	 *         tuong ung voi kieu cua no
	 */
	public double getDienTich() {
		return this.rong * this.dai;
	}

	// tinh chu vi
	public double getChuVi() {
		return (this.rong + this.dai) * 2;
	}

	// them 1 phuong thuc la xuat du lieu ra
	/**
	 * Xuat thong tin ra man hinh
	 */
	public void print() {
		System.out.println(">> chieu rong: " + this.rong);
		System.out.println(">> chieu dai: " + this.dai);
		System.out.println(">> dien tich: " + this.getDienTich());
		System.out.println(">> chu vi: " + this.getChuVi());
	}

	// viet them 1 phuong thuc nua, nhan them 1 chuoi thong bao
	/**
	 * xuat thong tin hinh chu nhat ra man hinh
	 * 
	 * @param message la chuoi thong bao
	 */
	public void print(String message) {
		// xuat thong bao ra truoc
		System.out.println(message);
		// goi phuong thuc print o ben tren sau
		// tu khoa this la de truy xuat thanh vien, co 2 loai thanh vien
		// 1 la method - member function
		// 2 la field - member variable
		this.print();
	}

}
