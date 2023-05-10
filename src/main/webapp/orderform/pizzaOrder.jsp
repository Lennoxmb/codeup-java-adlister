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
  <h1> Create a pizza</h1>
  <form action="order" method="post">
    <fieldset>
      <legend>Crust:</legend>
      <label for="thick">Thick:</label>
      <input type="radio" name="crust" value="thick" id="thick">
      <br>
        <label for="thin">Thin:</label>
        <input type="radio" name="crust" value="thin" id="thin">
    <br>
        <label for="deep dish">Deep Dish:</label>
        <input type="radio" name="crust" value="deep dish" id="deep dish">

    </fieldset>
    <fieldset>
        <legend>Size:</legend>
        <label for="small">Small:</label>
        <input type="radio" name="size" value="small" id="small">
        <br>
        <label for="medium">Medium:</label>
        <input type="radio" name="size" value="medium" id="medium">
        <br>
        <label for="large">Large:</label>
        <input type="radio" name="size" value="large" id="large">
    </fieldset>
    <fieldset>
      <legend>Toppings:</legend>
<label for="pepperoni">Pepperoni:</label>
<input type="checkbox" name="toppings" value="pepperoni" id="pepperoni">
<br>
<label for="sausage">Sausage:</label>
<input type="checkbox" name="toppings" value="sausage" id="sausage">
<br>
<label for="bacon">Bacon:</label>
<input type="checkbox" name="toppings" value="bacon" id="bacon">
<br>
<label for="mushrooms">Mushrooms:</label>
<input type="checkbox" name="toppings" value="mushrooms" id="mushrooms">
    </fieldset>
    <fieldset>
      <legend>Address: </legend>
      <label for="address">Address:</label>
        <input type="text" name="address" id="address">
    </fieldset>
  </form>
    <c:if test="${order != null}">
        <h2>your order:</h2>
        <p>${order.crust}</p>
        <p>${order.size}</p>
        <p>Toppings: </p>
        <ul>
            <c:forEach items="${order.toppings}" var="topic">
                <li>${toppings}</li>
            </c:forEach>
        </ul>
        <p>${order.address}</p>
    </c:if>
</div>
</body>
</html>

