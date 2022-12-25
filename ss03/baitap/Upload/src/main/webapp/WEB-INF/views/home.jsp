<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 21-Dec-22
  Time: 7:31 PM
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>Home</h3>
<form:form action="/music/save" method="post" modelAttribute="music">
  <fieldset>
   <h3>Add music</h3>
    <table>
      <tr>
        <td><form:label path="nameSong">Song name:</form:label></td>
        <td><form:input path="nameSong"/></td>
      </tr>
      <tr>
        <td><form:label path="singer">Song singer:</form:label></td>
        <td><form:input path="singer"/></td>
      </tr>
      <tr>
        <td><form:label path="kind">Song kind:</form:label></td>
        <td><form:input path="kind"/></td>
      </tr>
      <tr>
        <td><form:label path="link">Song link:</form:label></td>
        <td><form:input path="link"/></td>
      </tr>
      <tr>
        <td><form:button>Cancel</form:button></td>
        <td><form:button>Add</form:button></td>
      </tr>
    </table>
  </fieldset>
</form:form>
</body>
</html>
