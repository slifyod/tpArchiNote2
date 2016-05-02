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
        <c:set var="loged" value="true"/>
    </c:if>
</head>
<body>


<c:if test="${loged}">
    <%-- TODO Button to add new match go to /restrict/infoMatch--%>
    <form method="GET" action="/infoMatch">
        <input type="submit" value="Ajouter un match">
        <input type="hidden"
               name="edit_mode"
               value="true"/>
    </form>
</c:if>


<c:forEach var="match" items="${requestScope.matches}">
    <%--TODO display the match and add form when we are log with the next code : --%>
    ville = ${match.city} / stade = ${match.stadium} / date ${match.date}
    <c:if test="${loged}">
        <%--TODO Button to modify matches go to /restrict/infoMatch with the id match selected in param--%>
        <form method="GET" action="/infoMatch">
            <input type="submit" value="Acceder à la page de modification">
            <input type="hidden"
                   name="edit_mode"
                   value="true"/>
            <input type="hidden" name="match_id" value="<c:out value="${match.id}"/>"/>
        </form>
    </c:if>
    <br>
</c:forEach>

</body>
</html>
