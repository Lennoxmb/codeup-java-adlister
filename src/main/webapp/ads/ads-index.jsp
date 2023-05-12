<%--
  Created by IntelliJ IDEA.
  User: lennoxballard
  Date: 5/11/23
  Time: 1:50 PM
  To change this template use File | Settings | File Templates.
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html>
<head>
    <title>All Ads</title>
</head>
<body>
<h1>All Ads</h1>
<table>
    <thead>
    <tr>
        <th>Title</th>
        <th>Description</th>
        <th>Image URL</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="ad" items="${Ad}">
        <tr>
            <td>${ad.title}</td>
            <td>${ad.description}</td>
            <td>${ad.imageUrl}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>

