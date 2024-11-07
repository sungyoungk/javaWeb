<%--
  Created by IntelliJ IDEA.
  User: sungyoung
  Date: 2024. 6. 25.
  Time: 오후 2:29
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Todo List</title>
</head>
<body>
<h1>Your Todo List</h1>

<ul>
    <c:forEach var="dtoList" items="${list}">
        <%--         ${dtoList}--%>
        <li>${dtoList}</li>
    </c:forEach>
</ul>

<ul>
    <c:forEach var="num" begin="1" end="10">
        <li>${num}</li>
    </c:forEach>
</ul>

<ul>
    <c:if test="${list.size() % 2 ==0}">
        짝수
    </c:if>
    <c:if test="${list.size() % 2 != 0}">
        홀수
    </c:if>
</ul>

<ul>
    <c:choose>
        <c:when test="${list.size() % 2 == 0}">
            짝수
        </c:when>
        <c:otherwise>
            홀수
        </c:otherwise>
    </c:choose>
</ul>

<c:set var="target" value="5"></c:set>
<ul>
    <c:forEach var="num" begin="1" end="10">
       <c:if test="${num == target}">
           <li>true</li>
       </c:if>
        <c:if test="${num != target}">
            <li>false</li>
        </c:if>
    </c:forEach>
</ul>


</body>
</html>
