<%--
  Created by IntelliJ IDEA.
  User: linux
  Date: 29/04/16
  Time: 10:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Home</title>
</head>
<body>
<c:choose>
    <c:when test="${sessionScope.authenticated == null}">
        <%--Not loged--%>
        <a href="/login">Login</a><br>
    </c:when>
    <c:otherwise>
        <%--Loged--%>
        Bonjour, <c:out value="${sessionScope.authenticated.login}"/>.<br>
    </c:otherwise>
</c:choose>

<a href="/matches">Matches</a><br>
<a href="/players">Joueurs</a><br>
<a href="/teams">Equipes</a><br>
</body>
</html>
