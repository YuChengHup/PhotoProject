<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2021/8/30
  Time: 10:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改密码</title>
</head>
<body>

<% String username=(String)session.getAttribute("username");%>

<form action="/mvc/updatePasswordByUsername" method="post">
    用户名<input type="submit" name="username" value="<%=username%>">
    原密码<input type="password" name="passwd">
    新密码<input type="password" name="passwd1">
    <input type="submit" value="修改">
</form>
</body>
</html>
