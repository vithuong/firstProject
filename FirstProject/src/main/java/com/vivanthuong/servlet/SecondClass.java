package com.vivanthuong.servlet;





import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/bonus/form")
public class SecondClass extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/views/secondJsp.jsp").forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// Lay du lieu cua form.
		String fullname = req.getParameter("hoten");
		String age = req.getParameter("tuoi");
		
		String message = "";
		int x = Integer.parseInt(age);
		if (x < 30) {
			message = fullname + " nam nay co muc thuong la 10%";
		}
		else if (x < 60) {
			message = fullname + " nam nay co muc thuong la 50%";
		}
		else {
			message = fullname + " nam nay co muc thuong la 40%";
		}
		//String message = fullname + " nam nay " + age + " tuoi ";
		//String message = "Vi Van Thuong co bonus la 10%";
		req.setAttribute("message", message);
		req.getRequestDispatcher("/views/secondJsp.jsp").forward(req, resp);
	}
}
