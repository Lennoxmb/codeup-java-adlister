<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    if (request.getMethod().equalsIgnoreCase("POST")) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if (username.equals("admin") && password.equals("admin")) {
            session.setAttribute("username", username);
            response.sendRedirect("profile.jsp");
        } else {
            out.println("Invalid username or password");
        }
    }
%>
<html>
<head>
    <title><title></title>
</head>
<body>
<h1>Log in</h1>
<form action="login" method="post">
    <input type="text" name="username" placeholder="username">
    <input type="text" name="password" placeholder="password">
    <input type="submit" value="Log in">
</form>

</body>
</html>
