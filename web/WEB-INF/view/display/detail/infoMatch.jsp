<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: linux
  Date: 30/04/16
  Time: 10:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Info match</title>
    <c:set var="loged" value="false"/>
    <c:if test="${sessionScope.authenticated != null}">
        <c:set var="loged" value="true"/>
    </c:if>
</head>


<body>
<%--TODO Add edit button when logged--%>
<c:if test="${loged}">
    <form method="GET" action="/infoMatch">
        <input type="submit" value="Acceder à la page de modification">
        <input type="hidden"
               name="edit_mode"
               value="true"/>
        <input type="hidden" name="match_id" value="${requestScope.match.id}"/>
    </form>
</c:if>
<%--TODO load match with ${match}--%>


Date = ${requestScope.match.date}<br>
Stade = ${requestScope.match.stadium}<br>
Ville = ${requestScope.match.city}<br>

</body>
</html>
