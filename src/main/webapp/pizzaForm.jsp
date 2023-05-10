<%--
  Created by IntelliJ IDEA.
  User: lennoxballard
  Date: 5/10/23
  Time: 10:09 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
<%--  <style>--%>
<%--    #title {--%>
<%--      font-size: 16px;--%>
<%--      font-weight: bold;--%>
<%--    }--%>
<%--  </style>--%>
</head>
<body>
<jsp:include page="/partials/navbar.jsp"/>
<div class="container">
  <h1> Create a blog post</h1>
  <form action="createPost" method="post">
    <label for="post">Your post:</label>
    <label for="subject">Title:</label>
    <input type="text" name="title" id="subject">
    <textarea name="post" id="post" cols="30" rows="10"></textarea>
    <fieldset>
      <legend>Topic:</legend>
      <label for="programming">Programming:</label>
      <input type="checkbox" name="topic" value="programming" id="programming"><br>
      <label for="ai">AI:</label>
      <input type="checkbox" name="topic" value="ai" id="ai">
      <label for="machine learning">Machine Learning:</label>
      <input type="checkbox" name="topic" value="machine learning" id="machine learning">
    </fieldset>
    <input type="submit" value="Submit">
    <label for="fontsize">Font Size:</label>
    <input type="number" name="fontsize" id="fontsize">
  </form>
  <c:if test="${post != null}">
  <h2>your blog post:</h2>
  <h3 id="title">${post.title}</h3>
  <p>${post.post}</p>
  <p>Topics: </p>
  <ul>
    <c:forEach items="${post.topics}" var="topic">
    <li>${topic}</li>
    </c:forEach>
    </c:if>
</div>
</body>
</html>

