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
    <jsp:include page="/partials/head.jsp"/>
</head>
<body>
<jsp:include page="/partials/navbar.jsp"/>
<div class="container">
  <h1> Create a pizza</h1>
  <form action="pizza-order" method="post">
      <fieldset>
          <label for="size">Size:</label>
          <select name="size" id="size">
              <option value="small">Small</option>
              <option value="medium">Medium</option>
              <option value="large">Large</option>
              <option value="xl">Extra Large</option>
          </select>
      </fieldset>
    <fieldset>
        <label for="crust">Crust:</label>
        <select name="crust" id="crust">
            <option value="handtossed">handtossed</option>
            <option value="thin">thin</option>
            <option value="deepdish">deepdish</option>
        </select>
    </fieldset>
      <fieldset>
          <label for="sauce">Sauce:</label>
          <select name="sauce" id="sauce">
              <option value="tomato">tomato</option>
              <option value="alfredo">alfredo</option>
              <option value="bbq">bbq</option>
          </select>
      </fieldset>
      <fieldset>
            <legend>Toppings:</legend>
          <input type="checkbox" name="toppings" value="pepperoni" id="pepperoni">
            <label for="pepperoni">Pepperoni:</label>
            <br>
          <input type="checkbox" name="toppings" value="sausage" id="sausage">
            <label for="sausage">Sausage:</label>
            <br>
          <input type="checkbox" name="toppings" value="bacon" id="bacon">
            <label for="bacon">Bacon:</label>
            <br>
          <input type="checkbox" name="toppings" value="mushrooms" id="mushrooms">
            <label for="mushrooms">Mushrooms:</label>
      </fieldset>
        <fieldset>
      <legend>Address: </legend>
      <label for="address">Address:</label>
        <input type="text" name="address" id="address">
    </fieldset>
        <button type="submit">Order</button>
  </form>
    <c:if test="${order != null}">
        <h2>your order:</h2>
        <sout>
        <p>${order.size}</p>
        <p>${order.crust}</p>
        <p>${order.sauce}</p>
        <p>Toppings: </p>
<ul>
    <c:forEach items="${order.toppings}" var="topping">
        <li>${topping}</li>
    </c:forEach>
</ul>
        <p>${order.address}</p>
        </sout>
    </c:if>

</div>
</body>
</html>

