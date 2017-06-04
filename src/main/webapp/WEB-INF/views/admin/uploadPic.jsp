<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/5/27
  Time: 12:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/static/";
%>
<!DOCTYPE html>
<!-- release v4.3.6, copyright 2014 - 2017 Kartik Visweswaran -->
<html lang="en">
<head>
    <base href="<%=basePath%>">
    <meta charset="UTF-8"/>
    <title>图片上传</title>
    <link href="css/bootstrap.min.css?v=3.4.0" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="css/plugins/picUpload/css/default.css">
    <link href="css/plugins/picUpload/css/fileinput.css" media="all" rel="stylesheet" type="text/css" />
    <script src="js/jquery-2.1.1.min.js"></script>
     <script src="js/plugins/picUpload/fileinput.js" type="text/javascript"></script>
    <!--简体中文-->
    <script src="js/plugins/picUpload/zh.js" type="text/javascript"></script>

    <script src="js/bootstrap.min.js?v=3.4.0"></script>
</head>
<body>
<div class="htmleaf-container">

    <div class="container kv-main">
        <div class="page-header">
            <h2>图片上传</h2>
        </div>

        <form enctype="multipart/form-data">
            <label> </label>
            <input id="file-zh" name="picture" type="file" multiple>
         </form>
        <hr>
        <br>
    </div>

</div>
</body>
<script>
    $('#file-zh').fileinput({
        language: 'zh',
        uploadUrl: '${pageContext.request.contextPath}/common/uploadPic.action',
        allowedFileExtensions : ['jpg', 'png','gif']
    })  .on("fileuploaded", function(event, data) {
        var res = data.response;
       // alert(res.success);
        });


</script>
</html>
