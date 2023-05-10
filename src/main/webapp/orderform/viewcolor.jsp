<%--
  Created by IntelliJ IDEA.
  User: lennoxballard
  Date: 5/10/23
  Time: 1:38 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>selected color</title>
    <style>
        body {
        <c:if test="${favcolor != null}">
            background-color: ${favcolor};
        </c:if>
        }
    </style>
</head>
<body>
<jsp:include page="/partials/navbar.jsp"/>
<button onclick="window.location.href='http://localhost:8080/selectedcolor'">select page</button>
</body>
</html>
