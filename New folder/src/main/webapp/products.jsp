<%@ page import="java.util.*" %>
<html>
<head>
<title>Products</title>
<link rel="stylesheet" href="css/style.css">
</head>
<body>
<h2>Available Products</h2>
<ul>
<%
    String[] products = (String[]) request.getAttribute("products");
    for(String p : products){
%>
<li><%= p %></li>
<% } %>
</ul>
<a href="index.jsp">Back</a>
</body>
</html>
