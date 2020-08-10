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
    <link rel="stylesheet" href="<c:url value="/template/web/css/error.css"/>">

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="http://ajax.aspnetcdn.com/ajax/jquery.validate/1.9/jquery.validate.min.js" type="text/javascript"></script>
    <%--<script type="text/javascript" src="<c:url value='/template/js/bootstrap.min.js' />"></script>--%>
   <%-- <script src="https://cdn.jsdelivr.net/npm/jquery-validation@1.19.2/dist/jquery.validate.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/jquery-validation@1.19.2/dist/additional-methods.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/jquery-validation@1.19.2/dist/additional-methods.min.js"></script>--%>
    <script src="${pageContext.request.contextPath}/template/js/User.js"></script>
    <script src="${pageContext.request.contextPath}/template/js/Upload-Avatar.js"></script>
    <script src="${pageContext.request.contextPath}/template/js/menu.js"></script>
    <script src="${pageContext.request.contextPath}/template/js/delete.js"></script>
    <%--<script src="${pageContext.request.contextPath}/template/js/update.js"></script>--%>

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
