<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2025-06-04
  Time: 오후 2:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<html>
<head>
    <title>Scope 테스트</title>
</head>
<body>
<h1>scope 데이터 보기 </h1>
pageScope의 속성값은 : ${pageScope.scopeName}<br>
requestScope의 속성값은 : ${requestScope.scopeName}<br>
sessionScope의 속성값은 : ${sessionScope.scopeName}<br>
applicationScope의 속성값은 : ${applicationScope.scopeName}<br>
scopeName 자동 찾기 : ${ scopeName}<br>
member: ${member.name}(${member. userid})<br>
</body>
</html>

