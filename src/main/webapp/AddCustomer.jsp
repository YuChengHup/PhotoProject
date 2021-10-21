<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2021/8/28
  Time: 19:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加学生信息</title>
</head>
<body>
<form action="/mvc/addCustomer" method="post">
    姓名<input type="text" name="c_name"><br>
    性别<input type="text" name="c_sex"><br>
    电话<input type="text" name="c_tell"><br>
    职位<input type="text" name="c_job"><br>
    公司<input type="text" name="c_company"><br>
    <input type="submit" value="提交">
</form>
</body>
</html>
