<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="${path}/static/jquery-validation-1.9.0/jquery.validate.js"></script>
    <script type="text/javascript" src="/view/sys/js/addUser.js"></script>
</head>
<body>
<%@ include file="/view/common/head.jsp" %>
<div>
    <%@ include file="/view/common/menu.jsp" %>
    <div style="width:85%; height: 90%; float: right; ">

        <form action="/sys/user/addUser" method="get" id="form-add">
            <div class="form-group">
                <label>部门</label>
                <select id="dept" name="deptId" class="form-control">

                </select>
            </div>

            <div class="form-group">
                <label>账号</label>
                <input type="text" class="form-control" id="account" name="account" placeholder="请输入账号">
            </div>
            <div class="form-group">
                <label>密码</label>
                <input type="text" class="form-control" id="password" name="password" placeholder="请输入6位数字">
            </div>
            <div class="form-group">
                <label>姓名</label>
                <input type="text" class="form-control" id="name" name="name" required>
            </div>
            <div class="form-group">
                <label>年龄</label>
                <input type="text" class="form-control" id="age" name="age">
            </div>
            <div class="form-group">
                <label>性别</label>
                <input type="radio" id="male" name="sex" checked><label for="male">男</label>
                <input type="radio" id="female" name="sex"><label for="female">女</label>
            </div>
            <div class="form-group">
                <label>邮箱</label>
                <input type="text" class="form-control" id="email" name="email" required>
            </div>
            <div class="form-group">
                <label>出生日期</label>
                <input type="date" class="form-control" id="birthDate" name="birthDate">
            </div>
            <!--居中-->
            <div class="text-center">
                <button type="submit" class="btn btn-primary">保存</button>
                <button type="reset" class="btn btn-default">重置</button>
                <a href="/sys/user/userList" class="btn btn-danger">返回</a>
            </div>
        </form>

    </div>
</div>
</body>
</html>
