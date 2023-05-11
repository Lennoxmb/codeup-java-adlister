<%--
  Created by IntelliJ IDEA.
  User: lennoxballard
  Date: 5/11/23
  Time: 1:50 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="/partials/head.jsp">
        <jsp:param name="title" value="/ads.jsp"/>
    </jsp:include>
</head>
<body>
<%--In your JSP file, loop through all the ads and display each one.--%>
<c:forEach var="ad" items="${ads}">
</c:forEach>

</body>
</html>
