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
    <div class="find-to-delete">
        <form id="deleteFindForm" method="get">
            <div class="delete-find-name">
                <div class="title-ID">
                    <p>ID</p>
                </div>
                <div>
                    <input name="find-ID" class="text" type="text" id="find-ID">
                </div>
                <div class="title-name">
                    <p>Name</p>
                </div>
                <div>
                    <input name="find-name" class="text" type="text" id="find-name">
                </div>
                <div class="button-find">
                    <input class="find-delete" type="button" value="find" id="btnFind" <%--onclick="submitToDelete()"--%>/>
                </div>
            </div>
        </form>
     <%--   <form:form id="show=-before-delete" commandName="findModel">
            <table id="table-before-delete">
                <tr>
                    <th>ID</th>
                    <th>Name</th>
                    <th>Email</th>
                    <th>Phone</th>
                </tr>
                <tr>
                    <td>${findModel.id}</td>
                    <td>${findModel.userName}</td>
                    <td>${findModel.email}</td>
                    <td>${findModel.phone}</td>
                </tr>
            </table>
        </form:for--%>m>
       <%-- <form:form id="showDataBeforeDelete" method="post" commandName="findModel">
            <div class="show-data-delete" id="show-data-delete">
                <display:table name="table.findModel" cellspacing="0" cellpadding="0"
                                partialList="true" size="${findModel.totalItems}" id="tableList" export="false"
                                class="show-table-before-delete"
                                style="margin: 10px 0 10px 0;">
                    <display:column class="center select-cell" headerClass="center select-cell">
                        <fieldset>
                            <input type="checkbox" name="checkList" value="${tableList.id}" id="checkbox_${tableList.id}" class="check-box-element">
                        </fieldset>

                    </display:column>
                    <display:column headerClass="text-left" property="userName" title="Name"/>
                    <display:column headerClass="text-left" property="email" title="Email"/>
                    <display:column headerClass="text-left" property="phone" title="Phone"/>
                    <display:column headerClass="col-actions" title="Choose">
                        <a class="btn btn-sm btn-primary btn-edit" data-toggle="tooltip"
                           title="Delete" href='<c:url value="/web/delete"/>'><i class="fa fa-pencil-square-o" aria-hidden="true"></i></a>
                    </display:column>
                </display:table>
            </div>
            <div>
                <input class="deleteUser" type="button" value="delete" id="btnDelete" onclick="deleteUser()"/>
            </div>
        </form:form>--%>
    </div>
</body>
</html>
