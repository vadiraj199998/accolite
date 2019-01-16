<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<form action="Request2.jsp" method="post">
		<input type="text" name="name"/>
		<input type="text" name="password"/>
		<input type="submit" value="submit"/>
			<%
			int c = 0;
			if(session.getAttribute("count") == null) {
				session.setAttribute("count", c);
			}
		%>
	</form>
</body>
</html>