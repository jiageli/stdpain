<%--
  Created by IntelliJ IDEA.
  User: 维C果糖
  Date: 2017/1/28
  Time: 21:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"  isELIgnored="false" pageEncoding="UTF-8" import="java.util.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
<html>
<head>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">
    <title>PersonList</title>
</head>
<body>

<!-- 其中，modelAttribute 属性用于接收设置在 Model 中的对象，必须设置，否则会报 500 的错误 -->
<sf:form enctype="multipart/form-data"
         action="${pageContext.request.contextPath}/person/updatePersonList.action"
         modelAttribute="p"
         method="post">

    <sf:hidden path="id"/>

    <div style="padding:20px;">
        修改人员信息
    </div>

    <div style="padding:10px;">
        错误信息：<fond color="red"><sf:errors path="*"/></fond>
    </div>

    <table>
        <tr>
            <td>姓名:</td>
            <td><sf:input path="name"/><sf:errors path="name"/></td>
        </tr>
        <tr>
            <td>年龄:</td>
            <td><sf:input path="age"/></td>
        </tr>
        <tr>
            <td>图片:</td>
            <td><input type="file" name="photo" value=""/></td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" name="btnOK" value="保存"/></td>
        </tr>
    </table>
</sf:form>

</body>
</html>