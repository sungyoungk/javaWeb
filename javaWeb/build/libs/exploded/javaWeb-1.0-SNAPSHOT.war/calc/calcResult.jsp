<%--
  Created by IntelliJ IDEA.
  User: sungyoungkim
  Date: 2024/05/03
  Time: 1:45 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h1>NUM1 : ${param.num1}</h1>
<h1>NUM2 : ${param.num2}</h1>

<h1>SUM : ${Integer.parseInt(param.num1) + Integer.parseInt(param.num2)}</h1>

</body>
</html>
