package com.demo.aoop;

public class TestC1C2 {
	public static void main(String[] args) {
		C1 c1 = new C1();
		I1 i1 = new C1();
		I1 i1c2 = new C2();
		I2 i2 = new C1();
		C2 c2 = new C2();

		c1.m1();
		c1.m2();

		i1.m1();
		// i1.m2(); error
		i1c2.m1();
//		i1c2.m2(); error
//		i1c2.m3();	error

		i2.m1();
		i2.m2();

		c2.m1();
		c2.m2();
		c2.m3();

	}
}
