// JdbcDemo2.java
package com.vvthuong.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;


public class JdbcDemo2 {
	private static String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	private static String dburl = "jdbc:sqlserver://localhost;database=EShop;encrypt=true;trustServerCertificate=true;";
	private static String user = "sa";
	private static String password = "123";

	public static void main(String[] args) {
		// insert();
		// update();
		//query();
		query2();
	}

	private static void query2() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("ban muon tim cai gi:");
		String keyword = scanner.nextLine();
		StringBuffer buffer = new StringBuffer(keyword);
		buffer.insert(0, "%").append("%");
		//System.out.println(buffer.toString());
		// cau lenh select la dung nhieu nhat, cu lay cau lenh thay the vao day
		String sql = "select * from Products where name like ?";
		try {
			Class.forName(driver);
			Connection connection = DriverManager.getConnection(dburl, user, password);
			// PreparedStatement
			PreparedStatement statement = connection.prepareStatement(sql);
			// co the nhap tu ban phim vao day
			statement.setString(1, buffer.toString());
			
			ResultSet rs = statement.executeQuery();
			while (rs.next()) { // doc 1 hang tu csdl vao bo nho RAM, sau do moi doc cot o hang hien tai, tra ve
								// la true.
				String name = rs.getString("name"); // doc 1 cot
				double price = rs.getDouble("UnitPrice");
				System.out.printf(">>%s , %.2f \n", name, price);
			}
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		
	}

	private static void query() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("min = ?");
		double min = scanner.nextDouble();
		System.out.println("max = ?");
		double max = scanner.nextDouble();
		
		// trong sql server khong phan biet chu upcase lowcase, mysql cung vay. o rdbms
		// khac co phan biet nhu oracle
		// neu lap trinh dung jdbc thi 95% dung phuong phap prepareStatement nay, con
		// lai 5% phuong phap khac
		String sql = "select * from Products where UnitPrice between ? and ?";
		try {
			Class.forName(driver);
			Connection connection = DriverManager.getConnection(dburl, user, password);
			// PreparedStatement
			PreparedStatement statement = connection.prepareStatement(sql);
			// co the nhap tu ban phim vao day
			statement.setDouble(1, min);
			statement.setDouble(2, max);

			ResultSet rs = statement.executeQuery();
			while (rs.next()) { // doc 1 hang tu csdl vao bo nho RAM, sau do moi doc cot o hang hien tai, tra ve
								// la true.
				String name = rs.getString("name"); // doc 1 cot
				double price = rs.getDouble("UnitPrice");
				System.out.printf(">>%s , %.2f \n", name, price);
			}
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static void update() {
		String sql = "UPDATE Customers SET Fullname = ? , Email = ? WHERE Id = ?";
		try {
			Class.forName(driver);
			Connection connection = DriverManager.getConnection(dburl, user, password);
			// PreparedStatement
			PreparedStatement statement = connection.prepareStatement(sql);
			// co the nhap tu ban phim vao day
			statement.setString(3, "SleepNow");
			statement.setString(1, "update Buon Ngu Qua");
			statement.setString(2, "updateviettel@viettel.com.vn");

			statement.executeUpdate();
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static void insert() {
		String sql = "INSERT INTO Customers(Id, Password, Fullname, Email, Photo, Activated, Admin) VALUES(?, ?, ?, ?, ?, ?, ?)";
		try {
			Class.forName(driver);
			Connection connection = DriverManager.getConnection(dburl, user, password);
			// PreparedStatement
			PreparedStatement statement = connection.prepareStatement(sql);
			// co the nhap tu ban phim vao day
			statement.setString(1, "SleepNow");
			statement.setString(2, "123456");
			statement.setString(3, "Buon Ngu Qua");
			statement.setString(4, "viettel@viettel.com.vn");
			statement.setString(5, "SleepNow.jpg");
			statement.setBoolean(6, true);
			statement.setBoolean(7, true);

			statement.executeUpdate();
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
