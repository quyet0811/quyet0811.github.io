<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 10/8/2020
  Time: 9:12 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/common/taglib.jsp" %>
<html>
<head>
    <%--<meta http-equiv="Content-Type" content="application/json; charset=UTF-8">--%>
    <title>Update</title>
</head>
<body>
<div class="clearfix">
    <form id="updateusername" <%--method="get"--%>>
        <div class="update-username-byID">
            <div class="title-ID">
                <p>ID</p>
            </div>
            <div>
                <input name="update-ID" class="text" type="text" id="update-ID">
            </div>
            <div class="title-name">
                <p>Name</p>
            </div>
            <div>
                <input name="update-name" class="text" type="text" id="update-name">
            </div>
            <div class="title-email">
                <p>Email</p>
            </div>
            <div>
                <input name="update-email" class="text" type="text" id="update-email">
            </div>
            <div class="title-phone">
                <p>Phone</p>
            </div>
            <div>
                <input name="update-phone" class="text" type="text" id="update-phone">
            </div>
            <%--<div class="button-find">
                <input class="find-update" type="button" value="Update" id="btnUpdate" onclick="updateUser()"/>
            </div>--%>
        </div>


    </form>
    <div class="avatar">
        <h1 class="setavatar">Set your avatar</h1>
        <div class="imagesboxupdate" id="imagesbox">
        </div>
        <form method="POST" enctype="multipart/form-data" id="imageupdate">
            <input class="setavatarinputfile" id="fileUpdate" type="file" name="files" accept="image/png, image/jpeg"
                   multiple/>
            <div class="button">

                <input class="find-update" type="button" value="Update" id="btnUpdate" <%--onclick="submit()"--%>/>
            </div>
        </form>
    </div>
    <div class="choose_role">
        <label class="labelroleid" for="roleID">Choose your role:</label>
        <form:form id="role" commandName="model">
            <form:select path="role_id" id="roleID">
                <form:options items="${model.roles}"/>
            </form:select>
        </form:form>
    </div>
</div>
</body>
</html>
