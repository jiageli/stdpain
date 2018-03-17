<%@ page language="java" contentType="text/html; charset=UTF-8"  isELIgnored="false" pageEncoding="UTF-8" import="java.util.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>stdpain login</title>
    <base href="<%=basePath%>">
    <!-- Global stylesheets -->
    <jsp:include page="/WEB-INF/pages/jsp/globalsheet.jsp"></jsp:include>
</head>
<body>
    <jsp:include page="/WEB-INF/pages/jsp/mainnavbar.jsp"></jsp:include>
    <div class="page-container login-container">
        <div class="page-content">
            <div class="content-wrapper">
                <div class="content">
					<jsp:include page="/WEB-INF/pages/login/forms/regest_form.jsp"></jsp:include>
                    <jsp:include page="/WEB-INF/pages/jsp/footer.jsp"></jsp:include>
                </div>
            </div>
        </div>  
    </div>
</body>
    <!-- Core JS files -->
    <jsp:include page="/WEB-INF/pages/jsp/corejs.jsp"></jsp:include>
    <!-- Theme JS files -->
    <jsp:include page="/WEB-INF/pages/jsp/themejs.jsp"></jsp:include>
</html>
