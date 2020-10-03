$(document).ready(function () {
    cha();
    $(".tianjia").click(function () {
        location.href="/toadd";
    });

    $(".chaxun").click(function () {
        cha();
    });
    
})

function cha() {
    $(".tia").remove();

    var assetsid = $(".mingcheng").val();
    var assetstype = $(".jieyue").val();

    var json = {
        assetsid : assetsid,
        assetstype : assetstype
    }

    $.post("/select",json,function(resoult){

        $.each(resoult.data,function (i,v) {
            console.log(v)
            var $tr = $("<tr class='tia' align='center'><td>"+v.assetid+"</td><td>"+v.assetname+"</td><td>"+v.assettype+"</td><td>"+v.intodate+"</td></tr>");
            console.log($tr)
            $(".table-fenye").append($tr);
        })
    },"json");
}