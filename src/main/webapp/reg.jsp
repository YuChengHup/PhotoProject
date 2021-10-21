<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2021/9/23
  Time: 20:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册</title>
    <style>
        form{
            margin: 100px auto;
            background: aqua;
            border: 1px blue solid;
            width: 200px;
            text-align: center;
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
<form action="/mvc/reg" method="post">
    <div>${error}</div>
    <span>姓名</span><input type="text" name="e_name"><br>
    <span>性别</span><input type="text" name="e_sex"><br>
    <span>电话</span><input type="text" name="e_tell"><br>
    <span>用户名</span><input type="text" name="username"><div>${error1}</div><br>
    <span>密码</span><input type="password" name="passwd"><br>
    <input type="submit" value="注册">
</form>
</body>
</html>
