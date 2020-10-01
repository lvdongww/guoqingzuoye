<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<script type="text/javascript " src="/static/js/jquery-3.4.1.js"></script>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>添加</title>
	</head>
	<body>
		<form action="addPerson" method="get" class="form">
			<table border="1" align="center">
				<tr>
					<td align="center" colspan="2">
						添加人员
					</td>
				</tr>
				<tr>
					<td>
						姓名:
					</td>
					<td>
						<input type="text" name="name" class="pname" />
					</td>
				</tr>
				<tr>
					<td>
						性别:
					</td>
					<td>
						<select name="sex" class="sex">
							<option value="女">
								女
							</option>
							<option value="男">
								男
							</option>
						</select>
					</td>
				</tr>
				<tr>
					<td>
						年龄:
					</td>
					<td>
						<input type="text" name="age" class="age" />
					</td>
				</tr>
				<tr>
					<td>
						等级:
					</td>
					<td>
						<select name="rank" class="rank">
							<option value="1级">
								1级
							</option>
							<option value="2级">
								2级
							</option>
							<option value="3级">
								3级
							</option>
							<option value="4级">
								4级
							</option>
							<option value="5级">
								5级
							</option>
						</select>
					</td>
				</tr>
				<tr>
					<td>
						部门:
					</td>
					<td>
						<select name="department" class="department">
							<option value="特派员部">
								特派员部
							</option>
							<option value="忍者部">
								忍者部
							</option>
							<option value="特工部">
								特工部
							</option>
							<option value="海贼部">
								海贼王部
							</option>
						</select>
					</td>
				</tr>
				<tr>
					<td align="center" colspan="2">
						<input type="button" value="提交" class="tj" />
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