package com.java.web;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet({"/html/form.php", "/html/register.php"})
public class HtmlServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/views/form.jsp").forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String fullname = req.getParameter("fullname");
		String password = req.getParameter("password");
		String gender = req.getParameter("gender");
		String country = req.getParameter("country");
		String notes = req.getParameter("notes");
		String mservice = req.getParameter("mservice");
		String[] hobbies = req.getParameterValues("hobby");
		
		
		
		
		System.out.println("+ fullname: " + fullname);
		System.out.println("+ password: " + password);
		System.out.println("+ gender: " + gender);
		System.out.println("+ country: " + country);
		for(String hobby: hobbies) {
			System.out.println(" >>HOBBY= "+ hobby);
		}
		System.out.println("+ mservice: " + mservice);
		System.out.println("+ notes: " + notes);
		
		
		
		req.getRequestDispatcher("/views/form.jsp").forward(req, resp);
	}
}
