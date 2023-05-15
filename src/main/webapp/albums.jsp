<%--
  Created by IntelliJ IDEA.
  User: lennoxballard
  Date: 5/15/23
  Time: 9:36 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>list of albums</title>
</head>
<body>
<c:forEach var="album" items="${albums}">
  <div class="albums">
    <p>${album.title}</p>
  </div>
</c:forEach>
</body>
</html>
