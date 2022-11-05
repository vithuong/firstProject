package com.vvthuong.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DemoDate {
	public static void main(String[] args) {
		// convert time format to String
		//Demo1();
		Demo2(); // convert String to time type

	}

	private static void Demo2() {
		// kinh nghiem xuong mau khi lam cho quoc gia khac
		// neu lam dung het ma sai dinh dang thoi gian la error ca toan bo phan mem luon.
		// khi parse thi chuong trinh so ta dua khong dung dinh dang thi se xay ra ngoai le
		SimpleDateFormat sdf = new SimpleDateFormat();
		String s = "26 ~ 2022/11";
		sdf.applyPattern("mm ~ yyyy/mm");
		try {
			Date date = sdf.parse(s );
			System.out.println(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		
	}

	private static void Demo1() {
		Date now = new Date();
		System.out.println(">>now.gettime(): " + now.getTime());
		SimpleDateFormat sdf = new SimpleDateFormat();
		sdf.applyPattern("EEEE hh:mm:ssa dd/mm/yyyy");
		String s = sdf.format(now);
		System.out.println(">>today is: " + s);

	}

}
