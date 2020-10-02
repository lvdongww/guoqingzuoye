$(document).ready(function() {

	$.post("selectAll",function(data){
		$.each(data.data,function(i,v){
			var $td=$("<tr align='center'><td><a class='xiu' href='chuan?sid="+v.sid+"'>"+v.sid+"</a></td><td>"+v.sname+"</td><td>"+v.sgender+"</td><td>"+v.sage+"</td><td>"+v.saddress+"</td><td>"+v.semail+"</td></tr>");
			$(".table-Student").append($td);
		});
	},"json");
	
});