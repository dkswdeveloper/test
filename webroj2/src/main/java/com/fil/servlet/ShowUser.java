package com.fil.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/users"})
public class ShowUser extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{
		Set<Entry<String,List<String>>> entrySet = UserDataMap.map.entrySet();
		List<Entry<String,List<String>>> list = new ArrayList<>(entrySet);
		Cookie[] cookies = request.getCookies();
		int usernum = -1;
		for(Cookie ck : cookies)
		{
			if(ck.getName().equals("usernum"))
			{
				String value = ck.getValue();
				usernum = Integer.parseInt(value);
				break;
			}
		}
		if(usernum == -1)
		{
			System.out.println("no cookie found usernum");
		}
		else
		{
			System.out.println("cookie found usernum " + usernum);
		}
		usernum++;
		response.addCookie(new Cookie("usernum", ""+usernum) );
		request.setAttribute("user", list.get(usernum));
		request.getRequestDispatcher("userview.jsp").forward(request, response);
	}
	

}
