$(function(){
    var colum = 6;

    var list = ["맛집","여행","감상","운동","음식","게임","캠핑","쇼핑","취미","음악","수다","드라이브"
    ,"등산","비건","연예인","드라마","독서","사진","반려동물","육아","주식","코인","자연","공연"
    ]
    var attention = $("#attentionSelectTbody");

    var trCnt = Math.ceil(list.length/colum); //tr 개수
    var cnt = 0; //td에 들어갈 개수

    for(var i = 0; i < trCnt; i++){

        var tr = $("<tr></tr>");

        for(var a = 0; a < colum; a ++){
            var td = $("<td class='tctd'></td>");
            //td생성 후 tr에 등록. 데이터가 비어있으면 else 공백으로 칸을 채움.
            if(list[cnt] != null){
                var labelDom = $("<label for='checkID"+cnt+"' class='tc'>"+list[cnt]+"</label>");
                var inputDom = $("<input type=checkbox id='checkID"+cnt+"' class='hiddenCheckBox'>")
                td.append(labelDom);
                td.append(inputDom);
                tr.append(td);
                cnt++;
            } else{
                td.append("");
                tr.append(td);
            }
        }
        //tr을 테이블에 등록
        attention.append(tr);
    }
});

$(function(){
    $(".tctd").click(function(){
        var self = $(this).children()[0];
        var label = $(self).attr("for");

        setTimeout(function (){
            if(!$("#"+label).is(":checked")){
                $("#"+label).prop("checked",true);
                $(self).text($(self).text()+" x");
                $(self).css({
                    "color": "#dc232d",
                    "border": "1px solid #dc232d",
                    "background-color":"#fdf5f4",
                    "border-radius":"10px"
                });

            } else{
                $(self).text($(self).text().replaceAll(" x",""));
                $(self).removeAttr("style");
                $("#"+label).prop("checked",false);
            }
        },10);
    });
});


