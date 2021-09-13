<%@page import="java.util.List"%>
<%@page import="com.employee.pojo.Employee"%>
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
<% String contact = (String) request.getAttribute("username"); %>
<table>
<tr>
<td><h1>Results are as below</h1></td>
</tr>
<tr>
<td><h2><%= contact %></h2></td>
</tr>
</table>
</div>
</body>
</html>