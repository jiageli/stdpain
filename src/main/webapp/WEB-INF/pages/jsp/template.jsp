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
    <title>title</title>
    <base href="<%=basePath%>">
    <!-- Global stylesheets -->
    <jsp:include page="/WEB-INF/pages/jsp/globalsheet.jsp"></jsp:include>
</head>
<body>
    <!-- Main navbar -->
    <jsp:include page="/WEB-INF/pages/jsp/mainnavbar.jsp"></jsp:include>
    <!-- Page container -->
        <!-- Page content -->
            <!-- Main sidebar -->
			<!-- Secondary sidebar -->
            <!-- Main content -->
                <!-- Page header -->
                <!-- Content area -->
                    <!-- Footer -->
                    <jsp:include page="/WEB-INF/pages/jsp/footer.jsp"></jsp:include>
</body>
    <!-- Core JS files -->
    <jsp:include page="/WEB-INF/pages/jsp/corejs.jsp"></jsp:include>
    <!-- Theme JS files -->
    <jsp:include page="/WEB-INF/pages/jsp/themejs.jsp"></jsp:include>
</html>
