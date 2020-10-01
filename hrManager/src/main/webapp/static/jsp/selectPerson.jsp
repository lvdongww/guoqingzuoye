<%@ page language="java" contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<title>查询</title>
	</head>
	<body>
		<h1 align="center">
			人员列表
		</h1>
		<table width="1200" align="center" border="2">
			<tr align="center">
				<td>
					编号
				</td>
				<td>
					姓名
				</td>
				<td>
					性别
				</td>
				<td>
					年龄
				</td>
				<td>
					等级
				</td>
				<td>
					部门
				</td>
				<td>
					操作
				</td>
			</tr>
			<c:forEach var="s" items="${pList}">
				<tr align="center">
					<td>
						${s.id }
					</td>
					<td>
						${s.name }
					</td>
					<td>
						${s.sex }
					</td>
					<td>
						${s.age }
					</td>
					<td>
						${s.rank }
					</td>
					<td>
						${s.department }
					</td>
					<td>
						<a href="#"  class="sc">删除</a>
					</td>
				</tr>
			</c:forEach>
		</table>
		<div align="center" style="white: 300px; height: 100px">
			<a href="add">添加人员</a>
		</div>
	</body>
</html>
