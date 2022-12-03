package com.vvthuong.date;

//import java.text.ParseException;
//import java.text.SimpleDateFormat;
import java.util.Date;

public class DemoDate {
	public static void main(String[] args) {
		// Thoi gian, chuoi, tat ca moi thu deu co thu vien het, kiem o dau do hoac
		// khong co thi ta tu build ra va ta se tu tao thu vien XDate
		// convert time format to String
		// Demo1();
		// Demo2(); // convert String to time type
		Demo3();

	}

	private static void Demo3() {
		// vd : toi se tao ra 1 ngay cach thoi diem nay 1 thang.
		// nho chuyen int sang long, neu khong se bi overflow tran bo dem
		Date date = XDate.dateAdd(new Date(), 30*24);
		System.out.println(date);
		
	}

	private static void Demo2() {
		// kinh nghiem xuong mau khi lam cho quoc gia khac
		// neu lam dung het ma sai dinh dang thoi gian la error ca toan bo phan mem
		// luon.
		// khi parse thi chuong trinh so ta dua khong dung dinh dang thi se xay ra ngoai
		// le
//		SimpleDateFormat sdf = new SimpleDateFormat();
//		String s = "26 ~ 2022/11";
//		sdf.applyPattern("mm ~ yyyy/mm");
//		try {
//			Date date = sdf.parse(s);
//			System.out.println(date);
//		} catch (ParseException e) {
//			e.printStackTrace();
//		}
		String s = "26 ~ 2022/11";
		Date date = XDate.dateParse(s, "mm ~ yyyy/mm");
		System.out.println(date);
	}

	private static void Demo1() {
//		Date now = new Date();
//		System.out.println(">>now.gettime(): " + now.getTime());
//		SimpleDateFormat sdf = new SimpleDateFormat();
//		sdf.applyPattern("EEEE hh:mm:ssa dd/mm/yyyy");
//		String s = sdf.format(now);
//		System.out.println(">>today is: " + s);
		String s = XDate.dateFormat(new Date(), "EEEE hh:mm:ssa dd/MMMM/yyyy");
		System.out.println(">>today is: " + s);
	}

}
