<%--
  Created by IntelliJ IDEA.
  User: lennoxballard
  Date: 5/10/23
  Time: 1:32 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>colors</title>
</head>
<body>
<jsp:include page="/partials/navbar.jsp"/>
<form action="${pageContext.request.contextPath}/viewcolor" method="post">
<label for="favcolor">fav color:</label>
<input type="text" name="favcolor" id="favcolor">
<br>
<input type="submit" value="submit">
</form>
</body>
</html>
