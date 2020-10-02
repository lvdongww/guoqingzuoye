<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
    <title>查询</title>
</head>
<body>
<h1 align="center">
    记账管理
</h1>
<div align="center">
    <form action="/" method="post">
        类型：
        <select name="typeId">
            <option value="0">不限</option>
            <c:forEach var="bills" items="${billType}">
                <option value="${bills.id}">${bills.name}</option>
            </c:forEach>
        </select>
        时间：从<input name="kai" type="text">到<input name="jie" type="text">
        <button type="submit">搜索</button>
        <button ><a href="toAdd">记账</a></button>
    </form>
</div>
<table width="1200" align="center" border="2">
    <tr align="center">
        <td>
            标题
        </td>
        <td>
            记账时间
        </td>
        <td>
            类别
        </td>
        <td>
            金额
        </td>
        <td>
            说明
        </td>
    </tr>
    <c:forEach var="s" items="${select}">
        <tr align="center">
            <td>
                    ${s.title }
            </td>
            <td>
                <fmt:formatDate value="${s.billTime }" pattern="yyyy-MM-dd"></fmt:formatDate>
            </td>
            <td>
                    ${s.billType.name }
            </td>
            <td>
                    ${s.price }
            </td>
            <td>
                    ${s.explain }
            </td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
