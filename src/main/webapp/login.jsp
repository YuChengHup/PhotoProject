<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2021/9/23
  Time: 19:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
    <style>
        form{
            margin: 100px auto;
            background: aqua;
            border: 1px blue solid;
            width: 200px;
        }
        div{
            color: red;
        }
        body{
            background-image: url("WEB-INF/img/1.jpg");
        }
    </style>
</head>
<body>
<form action="/mvc/login" method="post">
    <span>用户名</span><input type="text" name="username"><div>${error1}</div><br>
    <span>密码</span><input type="password" name="passwd"><div>${error2}</div><br>
    <input type="submit" value="登录">
    <p>如果没有账户请<a href="/reg.jsp">注册</a></p>
</form>
</body>
</html>
