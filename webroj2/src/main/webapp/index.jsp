<html>
<body>
<h2>Hello World</h2>
<h2><%= "Hello World" %></h2>
<% Object message = request.getAttribute("message"); %>

<a href="users">Show all users one by one</a>


<h4> <% out.println(message==null?"" :  message); %></h4>
<h4> <%= (message==null?"" :  message) %></h4>



<form action="/login" method="post">
	User Name : <input type="text" name="username" /> <br>
	Password : <input type="password" name="password" /> <br>
	<input type="submit" value="Login" />
</form>
</body>
</html>

