<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 21-Dec-22
  Time: 7:30 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="/music/add">Add more</a>
<table style="border: 1px solid crimson">
  <tr>
    <th>Name</th>
    <th>Singer</th>
    <th>Kind</th>
    <th>Link</th>
  </tr>
  <c:forEach items="${list}" var="item">
    <tr>
      <td>${item.nameSong}</td>
      <td>${item.singer}</td>
      <td>${item.kind}</td>
      <td>${item.link}</td>
    </tr>
  </c:forEach>
</table>
</body>
</html>
