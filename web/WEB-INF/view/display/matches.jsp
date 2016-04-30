<%--
  Created by IntelliJ IDEA.
  User: linux
  Date: 30/04/16
  Time: 10:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Matches</title>
    <c:set var="loged" value="false"/>
    <c:if test="${sessionScope.authenticated != null}">
        <c:set var="${loged}" value="true"/>
    </c:if>
</head>
<body>


<c:if test="${loged}">
    <%-- TODO Button to add new match go to /restrict/infoMatch--%>
</c:if>


<c:forEach var="match" items="${requestScope.matches}">
    <%--TODO display the match and add form when we are log with the next code : --%>
    <c:if test="${loged}">
        <%--TODO Button to modify matches go to /restrict/infoMatch with the id match selected in param--%>
        <c:out value="${match.id}"/> <!--in param match_id GET && param edit_mode = true-->
    </c:if>
</c:forEach>

</body>
</html>
