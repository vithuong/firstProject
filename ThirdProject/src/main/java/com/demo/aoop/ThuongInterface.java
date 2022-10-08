package com.demo.aoop;

public interface ThuongInterface {
	// Luon luon la Public nhe
	//void m1();
	// viet la default thi khoi can override o class implement no
	// khong can viet gi o class implement thi van goi duoc ham m1.
	// viet cung duoc ma khoi viet cung duoc, khong sao het.
	default void m1() {
		System.out.println("day la default m1() o interface");

	}
	int m2(int a, int b);
}
