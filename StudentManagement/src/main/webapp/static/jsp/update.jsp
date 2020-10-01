<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>修改学员信息</title>
</head>
<body>
<form action="update" method="post">
<table class="table-chaxun" width="280px" align="center" border="1">
				<tr align="center" id="tr1">
					<th colspan="2" height="60" style="font-size:20px background-color: #5580B7;">学员信息</th>
				</tr>
				<tr align="center" hidden>
					<td>id</td>
					<td><input type="text" value="${student.sid }" name="sid"/></td>
				</tr>
				<tr align="center" >
					<td>学员姓名</td>
					<td><input type="text" value="${student.sname }" name="sname"/></td>
					
				</tr>
				<tr align="center">
					<td>学员性别</td>
					<td><input type="text" value="${student.sgender }" name="sgender"/></td>
					
				</tr>
				<tr align="center">
					<td>学员年龄</td>
					<td><input type="text" value="${student.sage }" name="sage"/></td>
					
				</tr>
				<tr align="center">
					<td>家庭住址</td>
					<td><input type="text" value="${student.saddress }" name="saddress"/></td>

				</tr>
				<tr align="center">
					<td>Email</td>
					<td><input type="text" value="${student.semail }" name="semail"/></td>
				</tr>
				<tr align="center">
					<td colspan="2"><button class="xiu">修改</button></td>
				</tr>
			</table>
</form>
</body>
<script src="/static/js/jquery-3.4.1.js"></script>
<script src="/static/js/update.js"></script>
</html>