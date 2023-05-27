function firstPage() {
    document.getElementById("pgno").setAttribute("value",1);
    window.location.href="/product?name=getall&pageNo="+ 1
}

function prevPage() {
//获取当前页数的值
    let $pageNo = document.getElementById("pgno").getAttribute("value");
    console.log($pageNo)
    let pageNo = parseInt($pageNo);
    //判断是否是第一页并提示
    if (pageNo == 1) {
        alert("当前已经是第一页");
    } else {
        //不是第一页的话当前页减去1并赋值
        var begin = pageNo-1;
        document.getElementById("pgno").setAttribute("value",begin);
        // $("[name=pageNo]").val(pageNo - 1);
        window.location.href="/product?name=getall&pageNo="+ begin
    }
}

function nextPage() {
    let $pageNo = document.getElementById("pgno").getAttribute("value");
    let $pagetotal = document.getElementById("pgtt").getAttribute("value");
    if($pageNo == $pagetotal){
        alert("已经是最后一页了")
    }else{
        var begin = $pageNo*10/10+1;
        document.getElementById("pgno").setAttribute("value",begin);
        window.location.href="/product?name=getall&pageNo="+ begin
}
}

function lastPage() {
    let total = document.getElementById("pgtt").getAttribute("value");
    console.log(total)
    // document.getElementById("pgno").setAttribute("value",total);
    window.location.href="/product?name=getall&pageNo="+ total
}
