<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<script type="text/javascript " src="/static/js/jquery-3.4.1.js"></script>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>添加</title>
	</head>
	<body>
		<form action="add" method="get" class="form">
			<table border="1" align="center">
				<tr>
					<td align="center" colspan="2">
						记账
					</td>
				</tr>
				<tr>
					<td>
						类型
					</td>
					<td>
						<c:forEach var="bills" items="${billType}">
						<input type="radio" name="typeId" value="${bills.id}">${bills.name}</c:forEach>
					</td>
				</tr>
				<tr>
					<td>
						标题:
					</td>
					<td>
						<input type="text" name="title">
					</td>
				</tr>
				<tr>
					<td>
						日期:<input type="text" name="billTime"  />
					</td>
					<td>
						金额:<input type="text" name="price"  />
					</td>
				</tr>
				<tr>
					<td>
						说明:
					</td>
					<td>
						<textarea name="explain" cols="30" rows="5">

						</textarea>
					</td>
				</tr>

				<tr>
					<td align="center" colspan="2">
						<input type="submit" value="提交" class="" />
					</td>
				</tr>
			</table>
		</form>
	</body>
<script type="text/javascript">
	$(function () {
		$(".tj").click(function () {
			var name=$(".pname").val();
            var sex=$(".sex").val();
            var age=$(".age").val();
            var rank=$(".rank").val();
            var department=$(".department").val();
            if(name==""){
               alert("姓名不能为空");
               return false;
			}
            if(sex==""){
                alert("性别不能为空");
                return false;
            }
            if(age==""){
                alert("年龄不能为空");
                return false;
            }
            if(rank==""){
                alert("等级不能为空");
                return false;
            }
            if(department==""){
                alert("部门不能为空");
                return false;
            }
            $(".form").submit();
        })
    })
</script>
</html>