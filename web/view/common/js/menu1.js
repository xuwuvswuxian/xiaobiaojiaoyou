$(function () {
    //进阶版动态获取(就是在后台处理好层级的目录，少循环)
    $.ajax({
        url: "/sys/menu",
        type: "get",
        data: "",
        dataType: "json",
        //遍历1集目录
        success: function (data) {
            console.log(data);
            var div = $("#div-menu");
            var first = data.first;
            var second = data.second;
            var third = data.third;
            //遍历两级目录
            for (var one of first) {
                var p = $('<p class="top">'+one.name+'</p>');
                div.append(p);
                div.append('<ul class="list-unstyled">');
                //判断两级目录是否为一级目录的子目录，通过数据库1级目录的id 和 2级目录的pid相同对比
                for (var two of second) {
                    if (one.id == two.pId) {
                        var li = $('<li class="list-unstyled first-font-size"><a href="' + two.menuUrl + '">' + two.name + '</a></li>');
                        div.append(li);
                        for (var three of third) {
                            if (two.id == three.pId) {
                                var lis = $('<li class="list-unstyled second-font-size"><a href="' + three.menuUrl + '">' + three.name + '</a></li>');
                                div.append(lis);
                            }
                        }
                    }
                }
                div.append('</ul>');
            }
        }
    });


});