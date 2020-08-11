<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 6/8/2020
  Time: 10:56 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/common/taglib.jsp" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

    <title>Delete</title>
</head>
<body>
<div class="clearfix">
    <form id="deleteForm" >
        <div class="delete-find-name">
            <div class="title-ID">
                <p>ID</p>
            </div>
            <div>
                <input name="findID" class="text" type="text" id="findID">
            </div>
            <div class="title-name">
                <p>Name</p>
            </div>
            <div>
                <input name="find-name" class="text" type="text" id="find-name">
            </div>
            <div class="button-find">
                <input class="find-delete" type="button" value="Delete" id="btnFind" onclick="submitToDelete()"/>
            </div>
        </div>
    </form>

</div>
</body>
</html>
