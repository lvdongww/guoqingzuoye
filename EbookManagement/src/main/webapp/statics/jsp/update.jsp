<%--
  Created by IntelliJ IDEA.
  User: 27895
  Date: 2020/9/19
  Time: 12:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="/updatebook">
    <table width="500px" border="1px">

        <input hidden name="categoryid" value="${ebookEntry.categoryid}">
        <tr style="text-align: center" id="shou">
            <td colspan="2">
                <h1>增加电子图书</h1>
            </td>
        </tr>
        <tr style="text-align: center">
            <td>
                <a>图书编号<a style="color: red">(*)</a></a>
            </td>
            <td>
                <input type="text" name="id" value="${ebookEntry.id}">
            </td>
        </tr>
        <tr style="text-align: center">
            <td>
                <a>图书名称<a style="color: red">(*)</a></a>
            </td>
            <td>
                <input type="text" name="title" value="${ebookEntry.title}">
            </td>
        </tr>
        <tr style="text-align: center">
            <td>
                <a>图书摘要</a>
            </td>
            <td>
                <textarea rows="10" cols="20" name="summary" >${ebookEntry.summary}</textarea>
            </td>
        </tr>
        <tr style="text-align: center">
            <td>
                <a>上传人</a>
            </td>
            <td>
                <input type="text" name="uploaduser" value="${ebookEntry.uploaduser}">
            </td>
        </tr>
        <tr style="text-align: center">
            <td>
                <a>上传时间<a style="color: red">(*)</a></a>
            </td>
            <td>
                <fmt:formatDate pattern="yyyy-MM-dd" value="${ebookEntry.createdate}" type="both"/>
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
</body>
</html>
