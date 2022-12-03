package com.vvthuong.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program_ChuongTrinh {
	// khai bao o day de dung chung cho moi phuong thuc
	// vi moi phuong thuc la static nen ta them static moi dung duoc
	static Scanner scaner = new Scanner(System.in);
	// khi nhap vao ta can 1 cai list dung chung cho moi ham nen nhap o day
	static List<Item_SanPham> list = new ArrayList<>();

	public static void main(String[] args) {
		while (true) {
			menu();
		}

	}

	private static void menu() {
		System.out.println("---INPUT PRODUCT LIST HERE: ---");
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
		// TODO Auto-generated method stub
		
	}

	private static void output() {
		// TODO Auto-generated method stub
		
	}

	private static void input() {
		while (true) {
			System.out.println("QUAN LY SAN PHAM");
			// neu khong dung constructor trong object item_sanpham thi:
//			Item_SanPham item = new Item_SanPham();
//			System.out.println(">>> id Product ? ");
//			item.setId(scaner.nextLine());
//			System.out.println(">>> price Product ? ");
//			item.setPrice(scaner.nextDouble());
//			// van con thua dau enter nen thai hoi Enter
//			scaner.nextLine();
//			// nhap xong thi bo vao list
//			list.add(item);
			// viet the nay thi qua ruom ra, nhung nhu the nay thi de hieu.
			System.out.println(">>> id Product ? ");
			String id = scaner.nextLine();
			// khi nao dung lai ? khi ma id null thi dung lai, nghia la nguoi ta khong nhap
			// nua
			if (id.trim().length() == 0) {
				break;
			}

			System.out.println(">>> price Product ? ");
			Double price = scaner.nextDouble();
			scaner.nextLine();

			list.add(new Item_SanPham(id, price));

		}

	}

}
