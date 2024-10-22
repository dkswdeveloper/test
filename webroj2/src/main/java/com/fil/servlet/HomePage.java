package com.fil.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/homepage"})
public class HomePage extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{
		//get usernae from session 
		//check if session contains  currentNum, else put currentNum  = 0
		// id currentNum exists increment it and put it back
		//get data of the user of number currentNum
		
		// next -> homepage -> userdataview.jsp (picks data from ? request.getAttribute
		
		
//		String name = request.getParameter("username");
		Object name = request.getSession().getAttribute("username");
		if(name == null)
		{
//			response.sendRedirect("/");
//			return ;
			
			request.setAttribute("message", "Login Again please !!");
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("/");
			requestDispatcher.forward(request, response);
//			requestDispatcher.include(request, response);
			return ;
		}
		name = (name== null? "All": name);
		//generate the data belonging to username = name from service
		List<String> list = new ArrayList<>();
		for(int i = 1; i<= 5; i++)
		{
			list.add("data-"+name + "-" + i);
		}
		request.setAttribute("username", name);
		request.setAttribute("datalist", list);
		request.getRequestDispatcher("/userdataview.jsp").forward(request, response);
	}
	

}
