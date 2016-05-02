<%--
  Created by IntelliJ IDEA.
  User: linux
  Date: 30/04/16
  Time: 10:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <c:set var="loged" value="false"/>
    <c:if test="${sessionScope.authenticated != null}">
        <c:set var="loged" value="true"/>
    </c:if>
</head>
<body>

<c:if test="${loged}">
    <%-- TODO Button to add new teams go to /restrict/infoTeams--%>
    <form method="GET" action="/infoTeam">
        <input type="submit" value="ajouter une team">
        <input type="hidden"
               name="edit_mode"
               value="true"/>
    </form>
</c:if>


<c:forEach var="team" items="${requestScope.teams}">
    <%--TODO display the team and add form when we are log with the next code : --%>
    Name = ${team.name}
    <c:if test="${loged}">
        <%--TODO Button to modify matches go to /restrict/infoTeams with the id team selected in param--%>
        <form method="GET" action="/infoTeam">
            <input type="submit" value="Acceder à la page de modification">
            <input type="hidden"
                   name="edit_mode"
                   value="true"/>
            <input type="hidden" name="match_id" value="<c:out value="${team.id}"/>"/>
        </form>
    </c:if>
</c:forEach>
</body>
</html>
