<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 19-Dec-22
  Time: 6:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Sandwich Condiments</h1>
<form action="/save">
  <input type="checkbox" value="Lettuce" name="condiment">Lettuce
  <input type="checkbox" value="Tomato" name="condiment">Tomato
  <input type="checkbox" value="Mustard" name="condiment">Mustard
  <input type="checkbox" value="Sprouts" name="condiment">Sprouts
  <button type="submit">Save</button>
</form>
<h3 style="color: red"> ${kq } </h3>
</body>
</html>
