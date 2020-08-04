<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 28/7/2020
  Time: 2:00 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Admin Home</title>

</head>
<body>
<div class="clearfix">
    <div class="context">
        <div class="box">
            <div class="titlebox">
                <h3>Click Next to come to home</h3>
            </div>
            <div class="inputzone">
                <div class="submit">
                    <form action="<c:url value="/adduserpage"/>" method="get">
                        <input class="inputbutton" type="submit" value="Next">
                    </form>
                </div>
            </div>
        </div>


    </div>
</div>
</body>
<
</html>
