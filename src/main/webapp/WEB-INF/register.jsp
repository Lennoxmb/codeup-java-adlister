<%--
  Created by IntelliJ IDEA.
  User: lennoxballard
  Date: 5/16/23
  Time: 2:24 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="/WEB-INF/partials/head.jsp">
        <jsp:param name="title" value="Register"/>
    </jsp:include>
</head>
<body>
<form action="/register" method="POST">
    <div class="form-group">
        <label for="username">Username</label>
        <input id="username" name="username" class="form-control" type="text">
    </div>
    <div class="form-group">
        <label for="email">email</label>
        <input id="email" name="email" class="form-control" type="email">
    </div>
    <div class="form-group">
        <label for="password">Password</label>
        <input id="password" name="password" class="form-control" type="password">
    </div>
    <div class="form-group">
        <label for="confirmPassword">Confirm Password</label>
        <input id="confirmPassword" name="confirmPassword" class="form-control" type="password">
    </div>
    <input type="submit" class="btn btn-primary btn-block" value="Log In">
</form>
</body>
</html>
