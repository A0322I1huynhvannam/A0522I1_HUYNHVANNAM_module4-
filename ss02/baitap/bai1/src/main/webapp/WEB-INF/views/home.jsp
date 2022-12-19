<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 19-Dec-22
  Time: 6:47 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Sandwich Condiments</h1>
<form action="/test" method="post">
    <input type="number" name="number1" value="${n1}">
    <input type="number" name="number2" value="${n2}">
    <br> <br>
    <button name="toantu" value="cong">Addition(+)</button>
    <button name="toantu" value="tru">Subtraction(-)</button>
    <button name="toantu" value="nhan">Multiplication(x)</button>
    <button name="toantu" value="chia">Division(/)</button>
</form>
<h2>ket qua : ${kq}</h2>
</body>
</html>
