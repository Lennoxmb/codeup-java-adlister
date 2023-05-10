<%@ page import="java.util.Random" %><%--
  Created by IntelliJ IDEA.
  User: lennoxballard
  Date: 5/10/23
  Time: 2:16 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Guess</title>
</head>
<body>
<jsp:include page="/partials/navbar.jsp"/>
<form action="${pageContext.request.contextPath}/guess" method="post">
      <label for="picknumber">Pick a number between 1 and 3:</label>
      <select style="width: 100px" name="picknumber" id="picknumber" >
        <option value="1">1</option>
        <option value="2">2</option>
        <option value="3">3</option>
      </select>
  <br>
  <input type="submit" value="submit">
</form>

</body>
</html>
