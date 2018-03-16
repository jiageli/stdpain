<%--
  Created by IntelliJ IDEA.
  User: 维C果糖
  Date: 2017/1/27
  Time: 00:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"  isELIgnored="false" pageEncoding="UTF-8" import="java.util.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">
    <title>PersonList</title>

    <script language="JavaScript">
        /**
         * 批量提交方法
         */
        function deleteMuch() {
            document.forms[0].action = "${pageContext.request.contextPath}/person/deleteMuch.action";
            document.forms[0].submit();  <!-- 手动提交 -->
        }
    </script>
</head>
<body>

    <form method="post">

        <div style="padding:20px;">
            <h2>人员列表</h2>
        </div>

        <div style="padding-left:40px;padding-bottom: 10px;">
            <a href="${pageContext.request.contextPath}/person/toCreatePersonInfo.action">新增</a>   <!-- 跳转路径 -->
            <a href="#" onclick="deleteMuch()">批量删除</a>   <!-- 调用 JavaScript -->
        </div>

        <table border="1">
            <tr>
                <td>选择</td>
                <td>头像</td>
                <td>编号</td>
                <td>姓名</td>
                <td>年龄</td>
                <td>操作</td>
            </tr>

            <c:forEach items="${personList}" var="p">
                <tr>
                    <td>
                        <input type="checkbox" name="id" value="${p.id}"/>
                    </td>
                    <td><img src="${pageContext.request.contextPath}${p.photoPath}"/></td>
                    <td>${p.id}</td>
                    <td>${p.name}</td>
                    <td>${p.age}</td>
                    <td>
                        <a href=${pageContext.request.contextPath}/person/toUpdatePersonInfo.action?id=${p.id}>修改</a>
                        <a href=${pageContext.request.contextPath}/person/deleteById.action?id=${p.id}>删除</a>
                    </td>
                </tr>
            </c:forEach>

        </table>
    </form>

</body>
</html>