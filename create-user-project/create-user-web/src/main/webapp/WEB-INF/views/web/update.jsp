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
<div class="update-username">
    <form id="updateusername" method="get">
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
            <div class="button-find">
                <input class="find-update" type="button" value="find" id="btnUpdate" onclick="updateUser()"/>
            </div>
        </div>
    </form>
</div>
<script>
    function updateUser(){
        var data = {};
        var Id = $('#update-ID').val();
        data.userName = $('#update-name').val();

        update(data,Id);
    }
    function update(data,id){

        $.ajax({
            type: 'PUT',
            url:'web/api/user/'+id,
            data: JSON.stringify(data),
            dataType: 'json',
            /*contentType:'application/json',*/
            success: function(res) {
                alert("Cập Nhật Thành Công !");
            },
            error: function(res) {
                alert("Cập Nhật Thất Bại !");
            }
        })
    }
</script>
</body>
</html>
