$(function () {
    $.post("/selectCat",function (data) {
        $.each(data.data,function (i,v) {
            var $op=$('<option value='+v.id+'>'+v.name+'</option>');
            $(".type").append($op);
        })
    },"json");
    cha();
    $(".chax").click(function () {
        cha();
    })
    $(".xia").click(function () {
        if (datapage.hasNextPage) {
            pageIndex = datapage.nextPage;
            cha()
        }
    })
    $(".shang").click(function () {
        if (datapage.hasPreviousPage) {
            pageIndex = datapage.prePage;
            cha()
        }
    })
    $(".shou").click(function () {
        pageIndex = datapage.firstPage;
        cha()
    })
    $(".wei").click(function () {
        pageIndex = datapage.lastPage;
        cha()
    })
    $(".add").click(function () {
        bookid=$(".type").val();
        if (bookid==0){
            alert("选择图书分类")
            return;
        }else{
            location.href="/toAdd?bookid="+bookid;
        }

    })
});
var pageIndex=1;
var pageSize=2;
var bookid;
var datapage;
function cha() {
    bookid=$(".type").val();
    $(".tablein tr:gt(1)").remove();
    var json={
        "bookid":bookid,
        "pageIndex":pageIndex,
        "pageSize":pageSize
    }
    $.post("/selectPage",json,function (data) {
        datapage=data.data;
        $(".ye").text(data.data.pageNum+"/"+data.data.pages);
        $.each(data.data.list,function (i,v) {
            console.log(v)
            var tr=$("<tr align=\"center\"><td>"+v.categoryid+"</td><td>"+v.title+"</td><td>"+v.summary+"</td><td>"+v.uploaduser+"</td><td>"+v.createdate.substring(0,10)+"</td><td><a href='/toupdate' class='xiu'>修改</a><span hidden>"+v.id+"</span><a href='javaScript:void(0)' class='shan'>删除</a></td></tr>");
            $(".tablein").append(tr);
        })
        $(".shan").click(function () {
            var id=$(this).prev().text();
            $.post("delete",{"id":id},function (data) {
                if (data.sccueec=="true"){
                    $(".wen").text("删除成功")
                    cha();
                }else{
                    $(".wen").text("删除失败")
                }
            },"json")
        })
        $(".xiu").click(function () {
            var id=$(this).next().text();
            var categoryid=$(this).parent().prev().prev().prev().prev().prev().text();
            var title=$(this).parent().prev().prev().prev().prev().text();
            var summary=$(this).parent().prev().prev().prev().text();
            var uploaduser=$(this).parent().prev().prev().text();
            var createdate=$(this).parent().prev().text();
            var json={
                "id":id,
                "categoryid":categoryid,
                "title":title,
                "summary":summary,
                "uploaduser":uploaduser,
                "createdate":createdate,
            }
            $.post("chuan",json,function (data) {
            })
        })
    },"json")
}
