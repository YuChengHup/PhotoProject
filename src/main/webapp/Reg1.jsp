<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2021/9/25
  Time: 10:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div>
    ${error}
</div>
<form action="/mvc/upload1" method="post"  enctype="multipart/form-data">
    姓名：<input type="text" name="uname"><br>
    电话<input type="text" name="tell"><br>
    用户名：<input type="text" name="username"><br>
    密码：<input type="password" name="passwd"><br>
    头像：<input type="file" name="tx1"><br>
    <input type="submit" value="注册">
</form>
</body>
</html>
