$(document).ready(function () {
    cha();
    $(".tianjia").click(function () {
        location.href="/toadd";
    });
})

function cha() {
    $(".tia").remove();
    $.post("/select",function(resoult){
        $.each(resoult.data,function (i,v) {
            var $tr = $("<tr class='tia' align='center'><td>"+v.id+"</td><td>"+v.meetingName+"</td><td>"+v.meetingOrder+"</td><td>"+v.advanceName+"</td></tr>");
            $(".student").append($tr);
        })
    },"json");
}