<%--
  Created by IntelliJ IDEA.
  User: 维C果糖
  Date: 2017/1/27
  Time: 00:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"    pageEncoding="UTF-8" import="java.util.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">
    <title>PersonList</title>
</head>
<body>
	<h1>${wan}</h1>
    <form action="${pageContext.request.contextPath}/personform.action" method="post">

        <div style="padding:20px;">
            人员列表
        </div>

        <table border="1">
            <tr>
                <td>编号:</td>
                <td>姓名:</td>
                <td>年龄:</td>
            </tr>

            <c:forEach items="${personList}" var="p">
                <tr>
                    <td>${p.id}</td>
                    <td>${p.name}</td>
                    <td>${p.age}</td>
                </tr>
            </c:forEach>
        </table>
    </form>

</body>
</html>