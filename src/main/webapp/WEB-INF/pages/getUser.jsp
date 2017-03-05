<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 17/3/4
  Time: 22:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title></title>
</head>
<body>
<h1>findUser</h1>
<table>
    <c:forEach items="${users}" var="u">
        <tr>
            <td>${u.id}</td>
            <td>${u.nickname}</td>
            <td>${u.firstName}</td>
            <td>${u.lastName}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
