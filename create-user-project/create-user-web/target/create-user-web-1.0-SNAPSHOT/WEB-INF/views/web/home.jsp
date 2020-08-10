<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 29/7/2020
  Time: 9:41 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/common/taglib.jsp" %>


<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Web Home</title>

</head>
<body>
<%--<div id="carouselExampleSlidesOnly" class="carousel slide" data-ride="carousel">
    <div class="carousel-inner">
        <div class="carousel-item active">
            <img class="d-block w-100" src="${pageContext.request.contextPath}/template/web/images/webbackground.jpg" alt="First slide">
        </div>
        <div class="carousel-item">
            <img class="d-block w-100" src="${pageContext.request.contextPath}/template/web/images/2.jpg" alt="Second slide">
        </div>
        <div class="carousel-item">
            <img class="d-block w-100" src="${pageContext.request.contextPath}/template/web/images/3.png" alt="Third slide">
        </div>
    </div>
</div>--%>
<div class="clearfix">

    <div class="insert" <%--id="registrationForm" --%>commandname="listDTO">
        <form id="regisForm" method="get">
            <div class="name">
                <div class="uptexttitle">
                    <p>Name</p>
                </div>
                <div>
                    <input name="userName" class="text" type="text" id="userName">
                </div>
            </div>
            <div class="Mail">
                <div class="uptexttitle">
                    <p>Email</p>
                </div>
                <div>
                    <input name="email" class="text" type="text" id="email">
                </div>
            </div>
            <div class="Phone">
                <div class="uptexttitle">
                    <p>Phone</p>
                </div>
                <div>
                    <input name="phone" class="text" type="text" id="phone">
                </div>

            </div>
        </form>
    </div>

    <div class="avatar">
        <h1 class="setavatar">Set your avatar</h1>
        <div class="imagesbox" id="imagesbox">
        </div>
        <%--<form method="post" enctype="multipart/form-data" id="imageupload">
            <div class="setavatarinputfile">
                <input type="file" class="inputfile-control" id="fileInput" &lt;%&ndash;onchange="previewUpload(this)"&ndash;%&gt;>
            </div>
        </form>--%>
        <form method="POST" enctype="multipart/form-data" id="imageupload">
            <%--<input type="text" name="extraField"/><br/><br/>
            <input type="file" name="files"/><br/><br/>--%>
            <%--<input type="file" class="setavatarinputfile" id="fileInput" name="files"/>--%>
            <%--<input type="submit" value="Submit" id="btnSubmit"/>--%>
            <input class="setavatarinputfile" id="fileInput" type="file" name="files" accept="image/png, image/jpeg"
                   multiple/>
            <div class="button">

                <input class="submit" type="button" value="Submit" id="btnSubmit" <%--onclick="submit()"--%>/>
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

