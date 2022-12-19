<!doctype html>
<%@taglib prefix="form" uri="http://www.springframework.org/tags" %>

<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
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
<h2>${kq}</h2>
</body>
</html>