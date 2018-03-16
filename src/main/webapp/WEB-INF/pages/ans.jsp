<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<h1>${ans}</h1>
    <form action="${pageContext.request.contextPath}/personform.action" method="post">

        <div style="padding:20px;">
            人员列表
        </div>

        <table border="1">
            <tr>
                <td>id:</td>
                <td>filename:</td>
                <td>uploadtime:</td>
                <td>link</td>
                <td>del<td>
            </tr>
            <c:forEach items="${files}" var="p">
                <tr>
                    <td>${p.id}</td>
                    <td>${p.filename}</td>
                    <td>${p.uploadtime}</td>
                    <td><a href="${pageContext.request.contextPath}/user/download?id=${p.id}">download</a></td>
                	<td><a href="${pageContext.request.contextPath}/user/deleteFiles?id=${p.id}">delete</a></td>
                </tr>
            </c:forEach>
        </table>
    </form>
    <sf:form enctype="multipart/form-data"
         action="${pageContext.request.contextPath}/user/upload"
         modelAttribute="p"
         method="post">
         <input type="file" name="photo" value=""/>666
         <button type="submit">submit</button>
     </sf:form>
</body>
</html>