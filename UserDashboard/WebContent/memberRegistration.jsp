<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div align ="center">
<form action="Register" method="post">
<table>
<tr><td>User Name: </td><td><input type = "text" name = "uname"></td></tr>
<tr><td>Password: </td><td><input type = "password" name = "password"></td></tr>
<tr><td>Email: </td><td><input type = "text" name = "email"></td></tr>
<tr><td>Address: </td><td><input type = "text" name = "address"></td></tr>
<tr><td>Phone: </td><td><input type = "text" name = "phone"></td></tr>
<tr><td></td><td><input type = "submit" value ="Sign Up" onclick="MailServlet"></td></tr>

</table>
</form>

</div>
</body>
</html>