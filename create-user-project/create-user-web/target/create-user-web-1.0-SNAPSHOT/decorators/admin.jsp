<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 28/7/2020
  Time: 3:43 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/common/taglib.jsp"%>
<html>
<head>
    <title><dec:title default="Admin Home"/> </title>
    <link rel="stylesheet" href="<c:url value="/template/admin/css/header.css"/>">
    <link rel="stylesheet" href="<c:url value="/template/admin/css/context.css"/>">
    <dec:head/>
</head>
<body>
    <!-- Header-->
    <%@include file="/common/admin/header.jsp"%>
    <!-- End Header-->
    <!--Body-->
    <dec:body/>
    <!--end body-->

</body>
</html>
