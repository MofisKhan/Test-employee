<%@page import="com.employee.pojo.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">
<form action='<%= request.getContextPath() %>/getdetails' method=post>
<table>
<tr>
<td>UserName</td>
<td><input type="text"/></td>
</tr>
<tr>
<td><input type="submit"/></td>
</tr>
</table>
</form>
</div>
</body>
</html>