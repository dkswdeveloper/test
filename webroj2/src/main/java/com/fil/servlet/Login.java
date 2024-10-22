package com.fil.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns = { "/login"})
public class Login extends HttpServlet
{
	//http methods : get , put, post, delete, patch, options, head
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{
		String name = request.getParameter("username");
		String pass = request.getParameter("password");
		if(name.equals(pass))
		{
			//successful dao, service, LoginService.checkLogin(name, pass)
			//new seesion 
			HttpSession session = request.getSession();//if already session return it, else create new
//			request.getSession(true); = request.getSession();
//			request.getSession(false); // NO new seesion to create, return existing else null
			
			session.setAttribute("username", name);
			session.setAttribute("loginTime", new Date());
			session.setAttribute("curreuntPage",0);
			session.setAttribute("ipAddress", request.getRemoteAddr());
			
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("/homepage");
			requestDispatcher.forward(request, response);
//			requestDispatcher.include(request, response);
			return;
		}
		else
		{
			//falied
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("/index.jsp");
			requestDispatcher.forward(request, response);
//			return ;
		}
		name = (name== null? "All": name);
		PrintWriter out = response.getWriter();
		out.print("Hello " + name);
		out.print(" Current time = " + new Date());
	}
	

}
