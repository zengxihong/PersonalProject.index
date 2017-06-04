<%--
  Created by IntelliJ IDEA.
  User: ZengXihong
  Date: 2017/5/25
  Time: 9:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/static/";
%>
<!DOCTYPE html>
<html>

<head>
    <base href="<%=basePath%>">
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="renderer" content="webkit">

    <title>管理员- 登录</title>

    <link href="css/bootstrap.min.css?v=3.4.0" rel="stylesheet">
    <link href="css/font-awesome.min.css?v=4.3.0" rel="stylesheet">

    <link href="css/animate.min.css" rel="stylesheet">
    <link href="css/style.min.css?v=3.0.0" rel="stylesheet">
    <link href="css/login.min.css" rel="stylesheet">

</head>
<body class="signin">
<div class="signinpanel">
    <div class="row">
        <div class="col-sm-7">
            <div class="signin-info">
                <div class="logopanel m-b">
                    <h1><span>[ 后台管理 ]</span></h1>
                </div>
                <div class="m-b"></div>
                <h4>欢迎登录 <strong>后台管理</strong></h4>
                <ul class="m-b">
                    <li><i class="fa fa-arrow-circle-o-right m-r-xs"></i> 管理图片</li>
                    <li><i class="fa fa-arrow-circle-o-right m-r-xs"></i> 新建相册</li>

                </ul>
                <strong>还没有账号？ <a href="">立即注册&raquo;</a></strong>
            </div>
        </div>
        <div class="col-sm-5">
            <form method="post" action="${pageContext.request.contextPath}/admin/login.action">

                <h4 class="no-margins">登录：</h4>
                <p class="m-t-md">登录到管理员界面</p>
                <input type="text" name="username" class="form-control uname" value="${username}"  placeholder="用户名"  />
                <input type="password" name="password" class="form-control pword m-b" placeholder="密码"  />
                <div name="errorMsg" class="errorMsg" >${errorMsg}</div>
<%--
                <a href="">忘记密码了？</a>
--%>
                <button class="btn btn-success btn-block">登录</button>
            </form>
        </div>
    </div>
    <div class="signup-footer">
        <div class="pull-left">
            &copy; . zengxihong
        </div>
    </div>
</div>
<!-- 全局js -->
<script src="js/jquery-2.1.1.min.js"></script>
<script src="js/bootstrap.min.js?v=3.4.0"></script>
<script src="js/adminLogin.js"></script>

</body>

</html>
