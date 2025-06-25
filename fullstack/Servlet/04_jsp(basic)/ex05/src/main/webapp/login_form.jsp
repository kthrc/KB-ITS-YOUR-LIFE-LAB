<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2025-06-04
  Time: 오후 1:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<body>
<form action="login" method="post">

    <!-- method="post"로 변경해보자 -->
    <!-- <form action="login" method="post"> -->

    <fieldset>
        <legend>로그인 폼</legend>
        <ul  style="list-style: none">
            <li>
                <label for="userid">아이디</label>
                <input type="text" id="userid" name="userid" value="apple">
            </li>
            <li>
                <label for="passwd">비밀번호</label>
                <input type="password" id="passwd" name="passwd" value="1234">
            </li>
            <li><input type="submit" value="전송"></li>
        </ul>
    </fieldset>
</form>
</body>


