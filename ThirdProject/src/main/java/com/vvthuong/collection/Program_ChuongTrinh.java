package com.vvthuong.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

// chu y chuc nang sap xep
public class Program_ChuongTrinh {
	static Scanner scaner = new Scanner(System.in);
	static List<Item_SanPhamObject> list = new ArrayList<>();

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
	// chu y: chi dung duoc comparator khi va chi khi doi tuong khai bao field la wrapper
	// khong dung comparator voi kieu nguyen thuy primitive
	private static void filterByPrice() {
		System.out.println(" SAP XEP THEO GIA");
		Comparator<Item_SanPhamObject> comparator = new Comparator<Item_SanPhamObject>() {
			@Override
			public int compare(Item_SanPhamObject o1, Item_SanPhamObject o2) {
				o1.getPrice().compareTo(o2.getPrice());
				return 0;
			}
		};
		Collections.sort(list, comparator);
		
	}
	// chức năng hoán vị ngẫu nhiên
	private static void suffleRandom() {
		System.out.println("HOAN VI NGAU NHIEN");
		 Collections.shuffle(list);

	}

	private static void findAndDelete() {
		System.out.println("TIM VA XOA");
		System.out.println(" ma san pham can xoa: ");
		System.out.println();
		String id = scaner.nextLine();
		// dung vong lap de break duoc, vong lap string.foreach khong break duoc
		// xoa sp co nghia la xoa ca id va price, co nghia la xoa 1 phan tu trong list do.
		for (Item_SanPhamObject item : list) {
			if (id.equals(item.getId())) {
				list.remove(item);
				System.out.println("san pham co id = " + id + " da xoa thanh cong");
				break;
			}
		}

	}

	private static void findAndEdit() {
		System.out.println("TIM VA SUA");
		System.out.println(" ma san pham can sua: ");
		System.out.println();
		String id = scaner.nextLine();
		// dung vong lap de break duoc, vong lap string.foreach khong break duoc
		// neu id nhap ma bang id cua sp thi ta sua, co nghia la nhap lai gia moi nhe
		for (Item_SanPhamObject item : list) {
			if (id.equals(item.getId())) {
				System.out.println("vui long nhap gia moi: ");
				Double price = scaner.nextDouble();
				item.setPrice(price);
				break;
			}
		}

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
			Item_SanPhamObject item = new Item_SanPhamObject(id, price);
			list.add(item);

		}

	}

}
