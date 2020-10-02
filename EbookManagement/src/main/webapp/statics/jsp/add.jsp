<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2020/9/19
  Time: 9:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>增加电子图书</title>
</head>
<body>
<form method="post" action="/addbook">
<table width="500px" border="1px">
    <input hidden name="categoryid" value="${bookid}">
    <tr style="text-align: center" id="shou">
        <td colspan="2">
            <h1>增加电子图书</h1>
        </td>
    </tr>
    <tr style="text-align: center">
        <td>
            <a>图书名称<a style="color: red">(*)</a></a>
        </td>
        <td>
            <input type="text" name="title">
        </td>
    </tr>
    <tr style="text-align: center">
        <td>
            <a>图书摘要</a>
        </td>
        <td>
            <textarea rows="10" cols="20" name="summary"></textarea>
        </td>
    </tr>
    <tr style="text-align: center">
        <td>
            <a>上传人</a>
        </td>
        <td>
            <input type="text" name="uploaduser">
        </td>
    </tr>
    <tr style="text-align: center">
        <td>
            <a>上传时间<a style="color: red">(*)</a></a>
        </td>
        <td>
            <input type="text" name="createdate"><a>(yyyy-MM-dd)</a>
        </td>
    </tr>
    <tr style="text-align: center" >
        <td colspan="2">
            <input type="submit" class="ti" value="提交">
            <input type="button" class="fan" value="返回">
        </td>
    </tr>
</table>
</form>
<script src="/statics/js/jquery.min.js" type="text/javascript"></script>
<script type="text/javascript">
    $(function () {
        $(".ti").click(function () {
            var title=$(".mingcheng").val();
            var summary=$(".zhaiyao").val();
            var uploaduser=$(".ren").val();
            var createdate=$(".shjian").val();
            var bookid=$(".bookid").val();
            if(title==""){
                alert("图书名称不能为空");
                return false;
            }
            if (createdate==""){
                alert("上传时间不能为空");
                return false;
            }
        })
        $(".fan").click(function () {
            location.href="/";
        })
    })
</script>
</body>
</html>
