<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 19-Dec-22
  Time: 7:23 PM
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Information</title>
</head>
<body>
<h2>Submitted Employee Information</h2>
<table>
  <tr>
    <td>Name:</td>
    <td>${name}</td>
  </tr>
  <tr>
    <td>ID:</td>
    <td>${id}</td>
  </tr>
  <tr>
    <td>Contact Number:</td>
    <td>${contactNumber}</td>
  </tr>
</table>
</body>
</html>
