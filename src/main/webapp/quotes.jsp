<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
  <title>Quotes</title>
</head>
<body>
<c:forEach var="quote" items="${quotes}">
  <div class="quote">
<%--    <p>${quote.author.name} said: ${quote.content}</p>--%>
    <h2>Add a quote to the database</h2>
    <form action="/quotes" method="post">
      <label for="author_name">Author:</label>
      <input type="text" name="author_name" id="author_name">
      <label for="content">Quote:</label>
      <input type="text" name="content" id="content">
      <input type="submit" value="Submit">
    </form>
  </div>
</c:forEach>
</body>
</html>