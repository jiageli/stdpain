<%--
  Created by IntelliJ IDEA.
  User: 维C果糖
  Date: 2017/1/27
  Time: 00:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
<html>
<head>
<meta http-equiv="content-type" content="text/html; charset=UTF-8">
<title>PersonList</title>
</head>
<body>
	<h1>${wan}</h1>
	<form action="${pageContext.request.contextPath}/user/Login"
		method="post">
		<div style="padding:20px;">人员列表</div>

		<table>
			<tr>
				<td>username:</td>
				<td><input name="username" />
				</td>
			</tr>
			<tr>
				<td>pass:</td>
				<td><input name="password" /></td>
			</tr>
			<tr>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" name="btnOK" value="保存" /></td>
			</tr>
		</table>
	</form>

</body>
</html>