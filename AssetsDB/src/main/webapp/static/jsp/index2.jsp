<%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 2020/9/30
  Time: 15:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<div align="center">
    <form action="/add" method="post">
        <table border="1px black solid;" style="width:500px;" class="table">
            <tr style="border: 1px black solid;" align="center">
                <td colspan="2"><h1>添加资产</h1></td>
            </tr>
            <tr>
                <td align="center">资产编号：</td>
                <td><input type="text" name="assetid" class="name"><span style="color: red">*</span></td>
            </tr>
            <tr>
                <td align="center">资产名称：</td>
                <td><input type="text" class="age" name="assetname"><span style="color: red">*</span></td>
            </tr>
            <tr>
                <td align="center">资产类型：</td>
                <td><select class="rank" name="assettype">
                    <option value="电子设备">电子设备</option>
                    <option value="运输设备">运输设备</option>
                    <option value="机械设备">机械设备</option>
                </select> <span style="color: red">*</span></td>
            </tr>
            <tr align="center">
                <td colspan="2"><input type="submit" value="添加"/></td>
            </tr>
        </table>
        ${error}
    </form>
</div>

</body>
</html>
