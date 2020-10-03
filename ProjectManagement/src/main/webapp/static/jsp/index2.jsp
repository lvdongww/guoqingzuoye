<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 2020/10/3
  Time: 11:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/update" method="post">
    <table border="1" align="center" width="500px">
        <tr><th colspan="2" bgcolor="yellow"><h1>申报项目信息</h1></th></tr>
        <tr>
            <td>项目编号：</td>
            <td><input type="text" name="id" class="sid" value="${projectinfo.id }"/></td>
        </tr>
        <tr>
            <td>项目名称：</td>
            <td><input type="text" name="projectname" class="name" value="${projectinfo.projectname }"/>
            <%--<fmt:formatDate value="${projectinfo.projectname }"  pattern="yyyy-MM-dd"></fmt:formatDate>--%>

            </td>
        </tr>
        <tr>
            <td>项目开始日期：</td>
            <td><input type="text" name="startdate" class="sgender"  />
               <span class="startdate" hidden><fmt:formatDate value="${projectinfo.startdate }"  pattern="yyyy-MM-dd" ></fmt:formatDate></span>
            </td>
        </tr>
        <tr>
            <td>项目结束日期：</td>
            <td><input type="text" name="enddate" class="publish"  />
                <span class="enddate" hidden><fmt:formatDate value="${projectinfo.enddate }"  pattern="yyyy-MM-dd" ></fmt:formatDate></span></td>
        </tr>
        <tr>
            <td>申报状态：</td>
            <td>
                <select name="status" value="${projectinfo.status }">
                    <option value="2">已审核</option>
                    <option value="1">审核中</option>
                    <option value="0">已申报</option>
                </select>
            </td>
        </tr>
        <tr>
            <td colspan="2" align="center"><input type="submit" class="tijiao" value="修改" />&nbsp;&nbsp;&nbsp;<input type="submit" class="fanhui" value="重置" /></td>
        </tr>
    </table>
</form>
</body>
<script src="/static/js/jquery-3.4.1.js" type="text/javascript"></script>
<script>
    $(function () {
        var startdate=$(".startdate").text();
        var enddate=$(".enddate").text();
        $(".sgender").val(startdate);
        $(".publish").val(enddate);
    })
</script>
</html>
