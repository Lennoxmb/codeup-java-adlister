<%--
  Created by IntelliJ IDEA.
  User: lennoxballard
  Date: 5/10/23
  Time: 2:28 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <jsp:include page="/partials/head.jsp">
        <title>Outcome</title>
        <jsp:param name="title" value="outcome" />
    </jsp:include>
</head>
<body>
<jsp:include page="/partials/navbar.jsp" />

<h1>${outcome}</h1>

</body>
</html>


