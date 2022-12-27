//jdbcDemo1.java
package com.vvthuong.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcDemo1 {
	private static String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	private static String dburl = "jdbc:sqlserver://localhost;database=EShop;encrypt=true;trustServerCertificate=true;";
	private static String user = "sa";
	private static String password = "123";

	public static void main(String[] args) {
		// insert();
		// SQLServerDriver. copy dong import roi paste vao driver.
//		String sql = "INSERT INTO Customers(Id, Password, Fullname, Email, Photo, Activated, Admin)"
//				+ " VALUES(N'2', N'2', N'2', N'javaToSQL', N'2', 1, 1)";
		//String sql = "DELETE FROM Customers WHERE id = '2'";
		// lenh nay thuc thi duoc 3 cau lenh INSERT, UPDATE, DELETE.
		// executeUpdate(sql);
		String sql = "SELECT * FROM Products";
		executeQuery(sql);
	}

	private static void executeQuery(String sql) {
		try {
			// Step1. nap driver
			Class.forName(driver);
			// Step2. tao ket noi den rdbms
			Connection connection = DriverManager.getConnection(dburl, user, password);
			// Step3. tao statement,(dong goi cau lenh) no giong nhu container goi hang hoa
			// vay !
			Statement statement = connection.createStatement();
			// Step4. tao thuc thi cau lenh SQL (gui cau lenh SQL di)
			//statement.executeUpdate(sql); thay doi o day, van co 4 buoc nhung buoc 4 thay doi.
			ResultSet rs = statement.executeQuery(sql);
			// ham di chuyen: first, last, next, foward.
			// co the dung ten cot hoac vi tri cua cot.
			while(rs.next()) {
				String name = rs.getString("Name");
				double price = rs.getDouble("UnitPrice");
				boolean status = rs.getBoolean("Available");
				int quantity = rs.getInt("Quantity");
				String description = rs.getString("Description");
				System.out.printf("%s -- %.2f -- %d -- %b \n", name, price, quantity, status);
				//System.out.println(description);
				
			}
			// Step5. dong ket noi
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// 5 STEP By STEP
	// ham nay ta dung muon doi.
	// nhu vay ta da tham so hoa cac ham, bay gio chi can viet cau lenh SQL la xong.
	private static void executeUpdate(String sql) {
		try {
			// Step1. nap driver
			Class.forName(driver);
			// Step2. tao ket noi den rdbms
			Connection connection = DriverManager.getConnection(dburl, user, password);
			// Step3. tao statement,(dong goi cau lenh) no giong nhu container goi hang hoa
			// vay !
			Statement statement = connection.createStatement();
			// Step4. tao thuc thi cau lenh SQL (gui cau lenh SQL di)
			statement.executeUpdate(sql);
			// Step5. dong ket noi
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
//	private static void insert() {
//		try {
//			// Step1. nap driver
//			Class.forName(driver);
//			// Step2. tao ket noi den rdbms
//			Connection connection = DriverManager.getConnection(dburl, user, password);
//			// Step3. tao statement,(dong goi cau lenh) no giong nhu container goi hang hoa
//			// vay !
//			Statement statement = connection.createStatement();
//			// Step4. tao thuc thi cau lenh SQL (gui cau lenh SQL di)
//			String sql = "INSERT INTO Customers(Id, Password, Fullname, Email, Photo, Activated, Admin)"
//					+ " VALUES(N'2', N'2', N'2', N'2', N'2', 1, 1)";
//			statement.executeUpdate(sql);
//			// Step5. dong ket noi
//			connection.close();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//	}

}
