<%--
  Created by IntelliJ IDEA.
  User: sungyoungkim
  Date: 2024/05/09
  Time: 3:08 PM
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>List</title>
</head>
<body>
<h1>List Page</h1>

<c:forEach var = "num" items="${list}">
    <ul>
        <li>${num}</li>
    </ul>
</c:forEach>

<c:forEach var="num" begin="1" end="10">
    <ul>
        <li>${num}</li>
    </ul>
</c:forEach>

<c:if test="${list.size() % 2 == 0}">
    짝수
</c:if>
<c:if test="${list.size() % 2 != 0}">
    홀수
</c:if>
<br>
<c:choose>
    <c:when test="${list.size() % 2 == 0}"> 짝수 </c:when>
    <c:otherwise>홀수</c:otherwise>
</c:choose>

<c:set var="target" value="5"></c:set>

<ul>
    <c:forEach var="num" begin="1" end="10">
        <c:if test="${num == target}"> num is target</c:if>
    </c:forEach>
</ul>



</body>
</html>
