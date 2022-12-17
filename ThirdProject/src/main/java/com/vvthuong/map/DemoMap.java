package com.vvthuong.map;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;
import java.util.TreeMap;

public class DemoMap {
	// ung dung Map lam gio hang cuc ky tien loi luon.
	public static void main(String[] args) {
		// demo1();
		// demo 2 la dung vong lap duyet
		// demo2();
		// demo3 la lam viec voi properties, khong can quy dinh kieu, vi no luon la
		// string
		// vi du lam tu dien tieng anh /
		demo3();

	}

	private static void demo3() {
		Properties props = new Properties();
		props.setProperty("one", "mot");
		props.setProperty("two", "hai");
		props.setProperty("three", "ba");
		props.setProperty("four", "bon");
		props.setProperty("five", "nam");

		System.out.println(props.toString());
		System.out.println(props);

		System.out.println(props.get("five"));
		System.out.println(props.get("phone"));
		System.out.println(props.getProperty("phone", "not found this word"));

		// luu vao file properties
		try {
			props.store(new FileWriter("/Users/laptrinh-congnghe-phanmem/Desktop/file/tudien.properties"),
					" this is comment");
			System.out.println("store .propeties file done !");
		} catch (IOException e) {
			e.printStackTrace();
		}
		// luu vao file xml
		
		try {
			props.storeToXML(new FileOutputStream("/Users/laptrinh-congnghe-phanmem/Desktop/file/tudien.xml"),
					" this is comment");
			System.out.println("store .xml file done !");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private static void demo2() {
		Map<String, Double> map = new TreeMap<>();
		// cap nhat cac phan tu - update several element
		map.put("Trong", 10.0);
		map.put("Dam", 11.0);
		map.put("Gi", 22.0);
		map.put("Dep", 33.0);
		map.put("Bang", 44.0);
		map.put("Sen", 0.0);

		// cach 1. dung lambda de duyet phan tu.
		map.forEach((key, value) -> {
			System.out.printf(">>cach1 %s / %.1f \r", key, value);
		});

		System.out.println("-----------");
		// cach 2. chi lay key thoi, tu key lay ra value.
		// giong cach ben tren thoi, chang co gi khac het.
		Set<String> keys = map.keySet();
		keys.forEach(key -> {
			Double value = map.get(key);
			System.out.printf(">>cach2 %s / %.1f \r", key, value);
		});
		// cach 3. ngay xua thi dung cach khac khac cach 1
		// dau tien lay tung cap entry ra
		System.out.println("-----------");
		Set<Entry<String, Double>> entries = map.entrySet();
		entries.forEach(entry -> {
			String key = entry.getKey();
			Double value = entry.getValue();
			System.out.printf(">>cach3 %s / %.1f \r", key, value);

		});

	}

	private static void demo1() {
		// yeu cau trong Map phai la object, co nghia la huong doi tuong roi.
		// Map<String, Double> map = new HashMap<>();
		// TreeMap cung la Map, ban chat nhu nhau, chi khac la sap xep key theo A-Z
		Map<String, Double> map = new TreeMap<>();
		// cap nhat cac phan tu - update several element
		map.put("Trong", 10.0);
		map.put("Dam", 11.0);
		map.put("Gi", 22.0);
		map.put("Dep", 33.0);
		map.put("Bang", 44.0);
		map.put("Sen", 0.0);

		System.out.println(map);
		System.out.println(map.toString());
		// danh sach key
		System.out.println(map.keySet());
		System.out.println(map.keySet().toString());

		// danh sach value
		System.out.println(map.values());
		System.out.println(map.values().toString());

		// so luong cac phan tu
		System.out.println(map.size());

		// kiem tra xem co rong khong
		System.out.println(map.isEmpty());

		// kiem tra su ton tai cua key
		System.out.println(map.containsKey("Thuong"));

		// kiem tra su ton tai cua value
		System.out.println(map.containsValue(0.0));

		// truy xuat phan tu theo key
		System.out.println(map.get("Thuong"));
		System.out.println(map.get("Sen"));
		System.out.println(map.get("0.0"));

	}

}
