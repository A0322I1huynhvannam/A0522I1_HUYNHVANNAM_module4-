<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 17-Dec-22
  Time: 7:25 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>ChuyenDoi</title>
</head>
<body>
<form action="/test" method="post">

    USD  <input type="text"  name="a" required><br>

    VN   <input type="text" value="${result}" name="" id="">
    <input type="submit" value="ok">
</form>
</body>
</html>
