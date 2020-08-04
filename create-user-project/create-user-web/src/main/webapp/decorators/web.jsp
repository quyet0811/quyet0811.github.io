<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 28/7/2020
  Time: 3:44 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/common/taglib.jsp"%>
<html>
<head>
    <title><dec:title default="Web Home"/></title>
<%--
    <link rel="stylesheet" href="${pageContext.request.contextPath}/template/bootstrap/bootstrap.css"/>
--%>
    <link rel="stylesheet" href="<c:url value="/template/web/css/header.css"/>">
    <link rel="stylesheet" href="<c:url value="/template/web/css/context.css"/>">
    <link rel="stylesheet" href="<c:url value="/template/web/css/ImagesUpload.css"/>">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="${pageContext.request.contextPath}/template/js/User.js"></script>
    <script src="${pageContext.request.contextPath}/template/js/Upload-Avatar.js"></script>
<%--
    <script src="${pageContext.request.contextPath}/template/js/Carousel.js"></script>
--%>

    <dec:head/>
</head>
<body>
<%--
<script src="${pageContext.request.contextPath}/template/js/bootstrap.min.js"></script>
--%>
<!-- Header-->
<%@include file="/common/web/header.jsp"%>
<!-- End Header-->
<!--Body-->
<dec:body/>
<!--end body-->
<%--<!-- Footer-->
<%@include file="/common/web/footer.jsp"%>
<!--end footer-->--%>
</body>
</html>
