$(document).ready(function () {
    cha();
    $(".shou").click(function () {
        pageIndex = data.firstPage;
        cha()
    })
    $(".shang").click(function () {
        pageIndex = data.prePage;
        cha()
    })
    $(".xia").click(function () {
        pageIndex = data.nextPage;
        cha()
    })
    $(".wei").click(function () {
        pageIndex = data.lastPage;
        cha()
    })
    $(".chaxun").click(function () {
        cha();
    });
})

var pageIndex = 1;
var pageSize = 2;
var data;
var leixing;
var $tr;
function cha() {
    $(".tia").remove();
    var fenlei2 = $(".shenqing").val();
    var json = {
        pageSize: pageSize,
        pageIndex: pageIndex,
        status : fenlei2
    }
    $.post("/select", json, function (resoult) {
        data = resoult.data;
        console.log(resoult.data)
        $(".ye").text(resoult.data.pageNum + "/" + resoult.data.pages);
        $(".zong").text(resoult.data.total);
        $.each(resoult.data.list, function (i, v) {
            if(v.status==0){
                leixing = "已申报";
            }else if(v.status==1){
                leixing = "审核中";
            }else{
                leixing = "已审核";
            }

            if (v.status==2){
                $tr = $("<tr class='tia' align='center'><td>" + v.id + "</td><td>" + v.projectname + "</td><td>" + v.startdate + "</td><td>" + v.enddate + "</td><td>" + leixing + "</td></tr>");
            }else{
                $tr = $("<tr class='tia' align='center'><td>" + v.id + "</td><td>" + v.projectname + "</td><td>" + v.startdate + "</td><td>" + v.enddate + "</td><td>" + leixing + "</td><td><a href='/chuan?id="+v.id+"'>审核</a></td></tr>");
            }
            console.log($tr)
            $(".table-flower").append($tr);
        })
    }, "json");
}