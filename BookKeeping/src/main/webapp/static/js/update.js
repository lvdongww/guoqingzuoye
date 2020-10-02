$(document).ready(function() {
	$(".xiu").click(function(){
	var sname=$(".name").val();
	var sgender=$(".sex").val();
	var sage=$(".age").val();
	if(sname==""){
		alert("学员姓名不能为空！");
		return false;
	}
	if(sgender==""){
		alert("学员性别不能为空！");
		return false;
	}
	if(sage==""){
		alert("学员年龄不能为空！");
		return false;
	}
	$("from").submit();
});
});