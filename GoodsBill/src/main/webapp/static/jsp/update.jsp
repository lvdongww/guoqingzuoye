<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
</head>
<body>
<span hidden="" class="id">${sessionScope.id}</span>
<form method="post" action="/update">
<table class="table-xiu" width="800" border="1" align="center">
    <tr align="center">

        <td width="100">商品编号</td>
        <td><input type="text" name="id" class="sid" value="${good.id}" readonly>
            <input type="text" name="goodsdistrict" class="sid" value="${sessionScope.id}">
        </td>
    </tr>
    <tr align="center">
        <td width="100">商品名称</td>
        <td><input type="text" name="goodsname" class="sname" value="${good.goodsname}"></td>
    </tr>
    <tr align="center">
        <td width="100">商品价格</td>
        <td><input type="text" name="goodsprice" class="sprice" value="${good.goodsprice}"></td>
    </tr>
    <tr align="center">
        <td width="100">库存数量</td>
        <td><input type="text" name="goodscount" class="scount" value="${good.goodscount}"></td>
    </tr>
    <tr align="center">
        <td width="100">订单状态</td>
        <td><select class="sel" name="billstatus">
            <option value="0">待处理</option>
            <option value="1">处理中</option>
            <option value="2">已处理</option>
        </select></td>
    </tr>
    <tr>
        <td colspan="2">
            <button type="submit" class="xiu">提交</button> &nbsp;&nbsp; &nbsp; &nbsp;
            <button class="fan">返回</button>
        </td>
    </tr>
</table>
</form>
<script type="text/javascript" src="/static/js/jquery-3.4.1.js"></script>
</body>
</html>