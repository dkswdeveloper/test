<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<script>

</script>
<h2> Welcome <% out.print(request.getAttribute("username")) ; %></h2>
<h4> Your data</h4>
<ol>
	<% List<String> list = (List<String>)request.getAttribute("datalist");
	for(String item : list)
	{
		out.print("<li>" + item + "</li>");
	}
	%>
</ol>
<form action ="/ ? " method = " " >
	<input type = "submit" value = "Next"/>
</form>

</body>
</html>