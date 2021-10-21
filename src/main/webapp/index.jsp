<%@ page import="com.domain.Customer" %>
<%@ page import="java.util.List" %>
<%@ page import="javafx.scene.control.Alert" %><%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2021/8/27
  Time: 18:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>客户管理系统</title>
</head>
<style>
    div{
        color:red;
    }
    p{
        color: blue;
    }
</style>
<body>
<p>
    你好，<%=session.getAttribute("username")%>！
</p>

客户信息列表
<br>
<table>
    <tr>
        <td>编号</td>
        <td>姓名</td>
        <td>性别</td>
        <td>电话</td>
        <td>职位</td>
        <td>公司</td>
    </tr>

    <div>
        <%
            String error=(String) request.getAttribute("error");
            if (error!=null){

        %>
        <%=error%>
        <%
            }
        %>
    </div>


    <%
        List<Customer> customerList=(List<Customer>)request.getAttribute("CustomerList");
        for (int i = 0; i < customerList.size(); i++) {
            Customer customer=customerList.get(i);
    %>
    <tr>
        <td><%=customer.getC_id()%></td>
        <td><%=customer.getC_name()%></td>
        <td><%=customer.getC_sex()%></td>
        <td><%=customer.getC_tell()%></td>
        <td><%=customer.getC_job()%></td>
        <td><%=customer.getC_company()%></td>
        <td>
            <a href="/mvc/deleteCustomer?c_id=<%=customer.getC_id()%>">删除</a>
        </td>
        <td>
            <a href="/mvc/findCustomerByID?c_id=<%=customer.getC_id()%>">修改</a>
        </td>
    </tr>
    <%
        }
    %>
    <tr>
        <td>
            <a href="http://localhost:8080/AddCustomer.jsp">添加学生信息</a>
        </td>
    </tr></br>
    <a href="http://localhost:8080/login.jsp">退出登录</a><br>
    <a href="http://localhost:8080/updatepasswd.jsp">修改密码</a>
</table>
</body>
</html>
