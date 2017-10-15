<%--
  Created by IntelliJ IDEA.
  User: Zhangxq
  Date: 2016/7/16
  Time: 0:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<script src="<%=request.getContextPath()%>/js/jquery-1.9.0.min.js"></script>
<script src="<%=request.getContextPath()%>/js/jquery.jqGrid.js"></script>
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/ui.jqgrid.css">


<html>
<head>
    <title>用户信息列表</title>
</head>
<body>
    <%--<c:if test="${!empty userList}">--%>
        <%--<c:forEach var="user" items="${userList}">--%>
            <%--姓名：${user.userName} &nbsp;&nbsp;手机号：${user.userPhone} &nbsp;&nbsp;邮箱：${user.userEmail} &nbsp;&nbsp;<br>--%>
        <%--</c:forEach>--%>
    <%--</c:if>--%>
    <table id="userTable"></table>
    <div id="userPage"></div>
</body>
</html>
<script src="<%=request.getContextPath()%>/js/user/showUser.js"></script>
