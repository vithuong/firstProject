package com.vvthuong.collection;

public class Item_SanPhamObject {
	String id;
	Double price;

	public Item_SanPhamObject() {

	}

	public Item_SanPhamObject(String id, Double price) {
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
