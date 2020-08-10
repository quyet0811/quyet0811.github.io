
/*
$(document).ready(function (){
 /!*   $('#menu li:nth-child(2)').click(function (){
        $('#menu ul').children().css({
            "color":"black"
        });
        $(this).css({
            "color":"green"
        });
    })*!/
    var $li = $('#menu li').click(function() {
        $li.removeClass('selected');
        $(this).addClass('selected');
    });
})*/
$(".nav .nav-link").on("click", function(){
    $(".nav").find(".active").removeClass("active");
    $(this).addClass("active");
});