package com.vvthuong.servletjdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.vvthuong.bean.Customer;

@WebServlet("/category/index")
public class CategoryServletDemo extends HttpServlet {
	private static String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	private static String dburl = "jdbc:sqlserver://localhost;database=EShop;encrypt=true;trustServerCertificate=true;";
	private static String user = "sa";
	private static String password = "123";

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//  cho nay bi sai luc nay Customer thieu S
		String sql = "SELECT * FROM CUSTOMERS";
		try {
			Class.forName(driver);
			Connection connection = DriverManager.getConnection(dburl, user, password);
			Statement statement = connection.createStatement();
			ResultSet rs = statement.executeQuery(sql);
			// doc tung ban ghi mot, de vao tung bean object customer
			// sau do cho cac object nay vao 1 cai list la xong
			List<Customer> list = new ArrayList<Customer>();
			while (rs.next()) {
				Customer bean = new Customer();
				bean.setId(rs.getString("Id"));
				bean.setPassword(rs.getString("Password"));
				bean.setFullname(rs.getString("Fullname"));
				bean.setEmail(rs.getString("Email"));
				bean.setPhoto(rs.getString("Photo"));
				bean.setActivated(rs.getBoolean("Activated"));
				bean.setAdmin(rs.getBoolean("Admin"));
				list.add(bean);
			}
			req.setAttribute("vvthuong", list); // gui sang jsp
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		req.getRequestDispatcher("/views/category.jsp").forward(req, resp);
	}
}
