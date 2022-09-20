package com.vvthuong.app;

import java.util.Scanner;

public class Catch {

	public static void main(String[] args) {
		Scanner scaner = new Scanner(System.in);
		
		while (true) {
			try {
				System.out.println("Nhap so: ");
				int a = scaner.nextInt();
				System.out.println("so vua nhap: " + a);
				break;
			} catch (Exception e) {
				System.out.println("vui long nhap so !");
				scaner.nextLine(); // thai du lieu thua ra khoi Ram
			}
		}

		

	}

}
