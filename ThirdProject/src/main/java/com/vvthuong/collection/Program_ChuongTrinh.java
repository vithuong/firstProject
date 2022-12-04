package com.vvthuong.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program_ChuongTrinh {
	static Scanner scaner = new Scanner(System.in);
	static List<Item_SanPham> list = new ArrayList<>();

	public static void main(String[] args) {
		while (true) {
			menu();
			System.out.println();
		}

	}

	private static void menu() {
		System.out.println("__________________");
		System.out.println("VUI LONG CHON DANH SACH CHUC NANG: ");
		System.out.println("---------");
		System.out.println("1. Input Product");
		System.out.println("2. Output Product");
		System.out.println("3. Outphut Price");
		System.out.println("4. Find and Edit");
		System.out.println("5. Find and Delete");
		System.out.println("6. Shuffle random");
		System.out.println("7. Filter by Price");
		System.out.println("8. Filter by Id");
		System.out.println("9. Turn Off Program");
		System.out.println("---------");
		System.out.println(">> Press Choose action ?? ");

		// scaner khai bao dung chung cho moi ham nen ta khong khai bao o day
		// Scanner scaner = new Scanner(System.in);
		int choose = scaner.nextInt();
		scaner.nextLine();// avoid button ENTER when press, the line will Skip.

		switch (choose) {
		case 1:
			input();
			break;
		case 2:
			output();
			break;

		case 3:
			outPutByPrice();
			break;

		case 4:
			findAndEdit();
			break;

		case 5:
			findAndDelete();
			break;

		case 6:
			suffleRandom();
			break;

		case 7:
			filterByPrice();
			break;

		case 8:
			filterById();
			break;

		case 9:
			System.exit(0);
			break;

		default:
			break;
		}
	}

	private static void filterById() {
		// TODO Auto-generated method stub

	}

	private static void filterByPrice() {
		// TODO Auto-generated method stub

	}

	private static void suffleRandom() {
		// TODO Auto-generated method stub

	}

	private static void findAndDelete() {
		// TODO Auto-generated method stub

	}

	private static void findAndEdit() {
		// TODO Auto-generated method stub

	}

	private static void outPutByPrice() {
		System.out.println("________________________");
		System.out.println("TIM THEO KHOANG GIA SAN PHAM");
		System.out.println("gia min: ");
		double min = scaner.nextDouble();
		System.out.println("gia max: ");
		double max = scaner.nextDouble();
		
		list.forEach(item -> {
			if (item.getPrice() >= min && item.getPrice() <= max) {
				System.out.println(">>ID...." + item.getId() + ".....PRICE...." + item.getPrice());
			}
			
		});

	}

	private static void output() {
		System.out.println("________________________");
		System.out.println("XUAT DANH SACH SAN PHAM");
		list.forEach(Item_SanPham -> {
			System.out.println(">>ID...." + Item_SanPham.getId() + ".....PRICE...." + Item_SanPham.getPrice());
		});

	}

	private static void input() {
		while (true) {
			System.out.println("NHAP SO LIEU SAN PHAM O DAY");
			
			System.out.println("ID = ");
			String id = scaner.nextLine();
			if (id.trim().length() == 0) {
				break;
			}
			System.out.println("PRICE = ");
			Double price = scaner.nextDouble();
			scaner.nextLine();
			Item_SanPham item = new Item_SanPham(id, price);
			list.add(item );

		}

	}

}
