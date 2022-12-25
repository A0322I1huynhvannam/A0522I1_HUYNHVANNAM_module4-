<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 21-Dec-22
  Time: 6:44 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>SESULT</title>
</head>
<body>
<h1>Complete</h1>
<h3>Language: ${Mail.language}</h3>
<h3>Page size: ${Mail.pageSize}</h3>
<h3>Spams fillter: ${Mail.spams}</h3>
<h3>Signature: ${Mail.signature}</h3>
</body>
</html>
