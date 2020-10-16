
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<div align ="center">
<h1>User Login Form</h1>
<form action ="login" method="post">
<table>

<tr><td>User Name: </td><td><input type="text" name="uname"></td></tr>
<tr><td>Password: </td><td><input type="password" name="password"></td></tr>

<tr><td></td><td><input type="submit" value="Log in"></td></tr>
</table>

</form>
<h3> Not Registered! Please sign up to continue!</h3>
<form action = "memberRegistration.jsp">
<table>
<tr><td></td><td><input type = "submit" value ="Register"></td></tr>
</table>
</form>

</div>
</body>
</html>