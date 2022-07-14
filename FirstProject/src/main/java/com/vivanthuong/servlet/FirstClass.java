package com.vivanthuong.servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/first.php")
public class FirstClass extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.getWriter().print("vivanthuong");
		req.setAttribute("thongbao", "chao mung ban den voi servlet/jsp");
		req.getRequestDispatcher("/views/firstJsp.jsp").forward(req, resp);
	}
}
