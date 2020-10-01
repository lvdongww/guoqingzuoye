<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>学员信息管理</title>
</head>
<body>
	<h1 align="center">学员信息列表</h1>

	<table class="table-Student" width="800" border="1" align="center">
	<tr>
	<th>学员编号</th>
	<th>学员姓名</th>
	<th>学员性别</th>
	<th>学员年龄</th>
	<th>家庭住址</th>
	<th>Email</th>
	</tr>
	</table>
	<h4 align="center" style="color: red">${sessionScope.boo}</h4>
<script src="/static/js/jquery-3.4.1.js"></script>
<script src="/static/js/select.js"></script>
</body>
</html>