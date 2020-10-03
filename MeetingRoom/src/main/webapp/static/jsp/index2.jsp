<%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 2020/10/3
  Time: 12:18
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
        <table  border="1px black solid;" style="width:500px;" class="table">
            <tr  style="border: 1px black solid;" align="center"><td colspan="2"><h1>添加人员</h1></td></tr>
            <tr >
                <td align="center">会议室</td>
                <td>
                    <select name="meetingName">
                        <option value="一号会议室">一号会议室</option>
                        <option value="二号会议室">二号会议室</option>
                        <option value="三号会议室">三号会议室</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td align="center">申请人</td><td><input type="text" name="advanceName"  class="name"><span style="color: red">*</span> </td></tr>
            <tr align="center">
                <td colspan="2"><input type="submit" value="添加" /></td>
            </tr>
        </table>
    </form>
</div>
</body>
</html>
