<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2022-05-18
  Time: 오후 4:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>save.jsp</title>
</head>
<body>
<h2>save.jsp</h2>
<form action="/save" method="post">
    <input type="text" name="memberId" placeholder="memberId"><br />
    <input type="text" name="memberPassword" placeholder="memberPassword"><br />
    <input type="text" name="memberAge" placeholder="memberAge"><br />
    <input type="text" name="memberId" placeholder="memberId"><br />
    <input type="text" name="memberPhone" placeholder="memberPhone"><br />
    <input type="submit" value="회원가입">
</form>
</body>
</html>
