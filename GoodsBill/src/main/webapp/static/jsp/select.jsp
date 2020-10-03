<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>商品订单列表</title>
</head>
<body>
<span hidden="" class="id">${sessionScope.id}</span>
<table class="table-fenye" width="800" border="1" align="center">
    <tr align="center">
        <td width="100">商品编号</td>
        <td width="100">商品名称</td>
        <td width="200">商品价格</td>
        <td width="100">库存数量</td>
        <td width="100">订单状态</td>
        <td width="100">操作</td>
    </tr>
    <c:forEach var="goos" items="${glist}">
        <tr align="center">
            <td width="100">${goos.id}</td>
            <td width="100">${goos.goodsname}</td>
            <td width="200">${goos.goodsprice}</td>
            <td width="100">${goos.goodscount}</td>

            <c:if test="${goos.billstatus==0}">
                <td width="100">待处理</td>
            </c:if>
            <c:if test="${goos.billstatus==1}">
                <td width="100">处理中</td>
            </c:if>
            <c:if test="${goos.billstatus==2}">
                <td width="100">已处理</td>
            </c:if>
            <td width="100"><a href="chuanid?id=${goos.id}">修改</a></td>
        </tr>
    </c:forEach>
</table>
</body>

</html>