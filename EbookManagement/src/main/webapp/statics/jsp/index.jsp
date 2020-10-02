<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 27895
  Date: 2020/9/19
  Time: 9:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<style>
    .tablein tr:nth-child(odd){
        background-color: greenyellow;
    }
</style>
<body>
<div align="center">图书分类：
    <select class="type">
        <option value="0">全部</option>
    </select><button class="chax">查询</button>
    &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp;
    &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp;
    &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp;
    &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp;
    <button class="add">新增电子图书</button>
</div>
<table border="1px" align="center" width="800px" class="tablein">
    <tr style="background-color: white">
        <th height="60px" colspan="6"><span style="font-size: 30px;">电子图书列表</span></th>
    </tr>
    <tr align="center" style="background-color:gray">
        <td>图书编号</td>
        <td>图书名称</td>
        <td>图书摘要</td>
        <td>上传人</td>
        <td>上传时间</td>
        <td>操作</td>
    </tr>
</table>
<span class="wen" style="background-color: red"></span>
<table class="table_kong" width="300" border="1" align="center">
    <tr align="center">
        <td><a href="javascript:void(0)" class="shou">首页</a></td>
        <td><a href="javascript:void(0)" class="shang">上一页</a></td>
        <td class="ye">1/1</td>
        <td><a href="javascript:void(0)" class="xia">下一页</a></td>
        <td><a href="javascript:void(0)" class="wei">尾页</a></td>
    </tr>
</table>
<script src="/statics/js/jquery.min.js" type="text/javascript"></script>
<script src="/statics/js/index.js" type="text/javascript"></script>
</body>
</html>
