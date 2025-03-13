<%--
  Created by IntelliJ IDEA.
  User: sungyoung
  Date: 2025. 3. 13.
  Time: 오전 11:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>todo List</title>
</head>
<body>
<%--var 는 반복문 안에서 사용되는 속성, items는 배열이나 collection--%>
    <h1>todo List</h1>
    <ul>
        <c:forEach var="dto" items="${list}">
            <li>${dto}</li>
        </c:forEach>
    </ul>

<%-- var 는 반복문 안에서만 사용되는 속성   --%>
    <ul>
        <c:forEach var="num" begin="1" end="10">
            <li>${num}</li>
        </c:forEach>
    </ul>

<%--제어문--%>
<c:if test="${list.size() % 2 == 0}">
    짝수
</c:if>
<c:if test="${list.size() % 2 != 0}">
    홀수
</c:if>
<br>
<c:choose>
    <c:when test="${list.size() % 2 == 0}">
        짝수
    </c:when>
    <c:otherwise>
        홀수
    </c:otherwise>
</c:choose>
<br>
<%--변수 지정--%>
<c:set var="target" value="5"></c:set>
    <ul>
        <c:forEach var="num" begin="1" end="10">
            <c:if test="${num == target}">
                num is equal to the target
            </c:if>
        </c:forEach>
    </ul>


</body>
</html>
