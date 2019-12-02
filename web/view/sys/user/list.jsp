<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%@include file="/view/common/head.jsp" %>

<div>
    <%@include file="/view/common/menu.jsp" %>

    <div style="width:85%; height: 90%; float: right; ">
        <form action="/sys/user/userList" method="get">
            账号：<input type="text" value="${account}" name="account">
            创建时间：<input type="date" value="" name="">
            截至时间：<input type="date" value="" name=""><br><br>

            <input type="submit" value="查询" class="btn btn-primary">
            <a href="/view/sys/user/addUser.jsp" class="btn btn-success" style="margin-left: 85%">添加</a>
        </form>


        <table class="table table-striped">
            <thead>
            <tr>
                <th>序号</th>
                <th>部门名称</th>
                <th>账号</th>
                <th>姓名</th>
                <th>年龄</th>
                <th>性别</th>
                <th>出生日期</th>
                <th>创建时间</th>
                <th>操作</th>
            </tr>
            </thead>

            <tbody>
            <c:forEach items="${list}" var="user" varStatus="status">
                <tr>
                    <td>${status.index+1}</td>
                    <td>${user.deptName}</td>
                    <td>${user.account}</td>
                    <td>${user.name}</td>
                    <td>${user.age}</td>
                    <td>
                        <c:if test="${user.sex==0}">女</c:if>
                        <c:if test="${user.sex==1}">男</c:if>
                    </td>
                    <td>
                        <fmt:parseDate value="${user.birthDate}" var="birthday" pattern="yyyy-MM-dd"></fmt:parseDate>
                        <fmt:formatDate value="${birthday}" pattern="yyyy年MM月dd日"></fmt:formatDate>
                    </td>
                    <td>
                        <fmt:parseDate value="${user.createTime}" var="time" pattern="yyyy-MM-dd HH:mm:ss"></fmt:parseDate>
                        <fmt:formatDate value="${time}" pattern="yyyy-MM-dd  HH:mm:ss"></fmt:formatDate>
                            </td>
                    <td><a href="/sys/user/delUserById?id=${user.id}">删除</a>
                        修改
                    </td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
        <a href="/sys/user/userList?account=${account}&page=1" class="btn btn-success">首页</a>
        <a href="/sys/user/userList?account=${account}&page=${page.pageCurrent <= 1 ? 1 : (page.pageCurrent-1)}" class="btn btn-success">上一页</a>
        当前页数：${page.pageCurrent}， 总页数：${page.pageCount}， 总记录数：${page.count}， 每页显示数量：${page.pageSize}
        <a href="/sys/user/userList?account=${account}&page=${page.pageCurrent >= page.pageCount ? page.pageCount : page.pageCurrent+1}" class="btn btn-success">下一页</a>
        <a href="/sys/user/userList?account=${account}&page=${page.pageCount}" class="btn btn-success">尾页</a>
    </div>
</div>
</body>
</html>
