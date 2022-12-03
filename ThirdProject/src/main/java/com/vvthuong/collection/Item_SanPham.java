package com.vvthuong.collection;

public class Item_SanPham {
	String id;
	// String name; bo cai name di, ten va id cung chi nhu nhau, bo bot de giam cong
	// viec phai xu ly
	Double price;
//	bo constructor di, ta chi nhap tu ban phim thoi
//	public Item_SanPham(String id, Double price) {
//		super();
//		this.id = id;
//		this.price = price;
//	}
	public Item_SanPham(String id, Double price) {
		super();
		this.id = id;
		this.price = price;
	}
	
	public String getId() {
		return id;
	} 
	public void setId(String id) {
		this.id = id;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}

	

}
