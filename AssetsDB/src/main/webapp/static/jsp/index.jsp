<%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 2020/9/30
  Time: 15:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<div align="center">
    <h1 align="center">固定资产查询</h1>
    资产编号：
    <input type="text" class="mingcheng"/>
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    资产类型：
    <select class="jieyue">
        <option value="">请选择类型</option>
        <option value="电子设备">电子设备</option>
        <option value="运输设备">运输设备</option>
        <option value="机械设备">机械设备</option>
    </select>
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    <input type="button" class="chaxun" value="查询"/>
    <table border="1" width="700" class="table-fenye">
        <tr style="background-color:darkgrey;text-align: center">
            <td>资产编号</td>
            <td>资产名称</td>
            <td>资产类型</td>
            <td>入库时间</td>
        </tr>
    </table>
    <div align="center">
        <button class="tianjia">添加人员</button>
    </div>
</div>
<script type="text/javascript" src="/static/js/jquery-3.4.1.js"></script>
<script type="text/javascript" src="/static/js/index.js"></script>
</body>
</html>
