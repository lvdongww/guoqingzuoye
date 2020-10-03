<%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 2020/10/3
  Time: 10:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1 align="center">申请项目列表</h1>
<center>
    申请状态：<select class="shenqing"><option value="3">全部</option><option value="2">已审核</option><option value="1">审核中</option><option value="0">已申报</option></select>
    <button class="chaxun">查询</button>
</center>
<p></p>
<table class="table-flower" width="800" border="1" align="center">
    <tr>
        <td>项目编号</td>
        <td>项目名称</td>
        <td>项目开始时间</td>
        <td>项目结束时间</td>
        <td>申报状态</td>
        <td>操作</td>
    </tr>
</table>
<table class="table" width="500" border="1" align="center">
    <tr align="center">
        <td><a href="javascript:void(0)" class="shou">第一页</a></td>
        <td><a href="javascript:void(0)" class="shang">上一页</a></td>
        <td class="ye">1/1</td>
        <td><a href="javascript:void(0)" class="xia">下一页</a></td>
        <td><a href="javascript:void(0)" class="wei">最后一页</a></td>
        <td>共<span class="zong"></span>条数据</td>
    </tr>
</table>
<script type="text/javascript" src="/static/js/jquery-3.4.1.js"></script>
<script type="text/javascript" src="/static/js/index2.js"></script>
</body>
</html>
