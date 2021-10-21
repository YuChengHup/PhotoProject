<%@ page import="com.domain.Customer" %><%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2021/8/28
  Time: 20:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改页面</title>
</head>
<body>
<%
    Customer customer=(Customer) request.getAttribute("Customer");

%>
    <form action="/mvc/UpdateCustomer" method="post">
        <input type="hidden" name="c_id" value="<%=customer.getC_id() %>"><br>
        姓名<input type="text" name="c_name" value="<%=customer.getC_name()%>"><br>
        性别<input type="text" name="c_sex" value="<%=customer.getC_sex()%>"><br>
        电话<input type="text" name="c_tell" value="<%=customer.getC_tell()%>"><br>
        职位<input type="text" name="c_job" value="<%=customer.getC_job()%>"><br>
        公司<input type="text" name="c_company" value="<%=customer.getC_company()%>">
        <input type="submit" value="提交">
    </form>
</body>
</html>
