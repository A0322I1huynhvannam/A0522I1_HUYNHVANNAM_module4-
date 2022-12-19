<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 17-Dec-22
  Time: 7:42 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Từ điển đơn giản</h1>
<form action="/test" method="post">
    <lable>ENG</lable>
    <input type="text" value="${eng}" name="eng">
    <lable>VN</lable>
    <input type="text" value="${vn}" name="">
    <button type="submit">tra</button>
</form>
</body>
</html>
