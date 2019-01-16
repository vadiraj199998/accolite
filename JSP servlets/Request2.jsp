<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<%
		
		out.println("name is :"+request.getParameter("name"));
		out.println("password is:"+request.getParameter("password"));
		int temp = Integer.parseInt(session.getAttribute("count").toString());
		session.setAttribute("count", temp + 1);
		out.println("number of times page visisted:"+temp);
	
	%>
</body>
</html>