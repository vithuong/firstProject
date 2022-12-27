package com.vvthuong.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JdbcDemo3 {
	private static String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	private static String dburl = "jdbc:sqlserver://localhost;database=EShop;encrypt=true;trustServerCertificate=true;";
	private static String user = "sa";
	private static String password = "123";

	public static void main(String[] args) {
		// insert();
		// query();
		inventoryQuery();

	}

	private static void inventoryQuery() {
		String procSql = "{CALL storeProceInventory()}";
		try {
			Class.forName(driver);
			Connection connection = DriverManager.getConnection(dburl, user, password);
			CallableStatement statement = connection.prepareCall(procSql);
			ResultSet rs = statement.executeQuery();
			while (rs.next()) {
				String name = rs.getString("TEN LOAI");
				double value = rs.getDouble("GIA TRI");
				System.out.printf("<------> %s , %.2f \n", name, value);
			}
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	private static void query() {
		String procSql = "{CALL storeProceSearchProduct(?,?)}";
		try {
			Class.forName(driver);
			Connection connection = DriverManager.getConnection(dburl, user, password);
			// CallableStatement
			CallableStatement statement = connection.prepareCall(procSql);
			// co the nhap tu ban phim vao day
			statement.setDouble(1, 5.0 );
			statement.setDouble(2, 10.0 );
			
			ResultSet rs = statement.executeQuery();
			while (rs.next()) { // doc 1 hang tu csdl vao bo nho RAM, sau do moi doc cot o hang hien tai, tra ve
								// la true.
				String name = rs.getString("name"); // doc 1 cot
				double price = rs.getDouble("UnitPrice");
				System.out.printf("<------> %s , %.2f \n", name, price);
			}
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	private static void insert() {
		String procSql = "{CALL storeProceInsertCategory(?,?)}";
		try {
			Class.forName(driver);
			Connection connection = DriverManager.getConnection(dburl, user, password);
			// CallableStatement
			CallableStatement statement = connection.prepareCall(procSql);
			// co the nhap tu ban phim vao day
			statement.setString(1, "Soda");
			statement.setString(2, "Nuoc Ngot co gas");
			statement.executeUpdate();
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
