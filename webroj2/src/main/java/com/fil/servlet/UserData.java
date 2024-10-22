package com.fil.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns = { "/userdata"})
public class UserData extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
//		session.setMaxInactiveInterval(0);
		Object username = session.getAttribute("username");
		if(username == null) {
			response.sendRedirect("/");
			return;
		}
		out.print("Here is your data, Mr./Ms. " + username);
		out.print(" Current time = " + new Date());
	}
	

}
