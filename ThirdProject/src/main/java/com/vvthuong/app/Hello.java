package com.vvthuong.app;

import java.util.Scanner;

public class Hello {
	public static void main(String[] args) {
		hello();//fix error because Static method only work with static method.
		//vua roi la to chuc theo huong thu tuc, tu ham nay ta goi ham khac.
		input();
	}
	private static void input() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		System.out.print(">>Name: ");
		String fullname = scanner.nextLine();
		
		System.out.print(">>Salary: ");
		double salary = scanner.nextDouble();
		
		System.out.print(">>Age: ");
		int age = scanner.nextInt();
		
		System.out.printf("Input done: %s, %f, %d", fullname, salary, age);
	}
	private static void hello() {
		System.out.println("Vi");
		System.out.println("Thường");
		
		String s = "Vi Thường";
		int d = 100;
		System.out.printf("%s can nang la %d kg", s, d);

	}
}
