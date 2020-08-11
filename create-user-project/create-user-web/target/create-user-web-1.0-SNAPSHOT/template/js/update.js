$(document).ready(function () {
    $("#btnUpdate").click(function (event) {

        //stop submit the form, we will post it manually.
        event.preventDefault();
        updateUser()
        fire_ajax_update();

    });

});
function updateUser(){
    var data = {};
    /*var Id = $('#update-ID').val();*/
    data.userName = $('#update-name').val();
    data.id = $('#update-ID').val();
    data.email = $('#update-email').val();
    data.phone = $('#update-phone').val();
    data.role_id = $('#roleID').val();
    data.avatar = $('#fileUpdate').val();
    update(data);
}
function update(data){

    $.ajax({
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        },
        type: 'PUT',
        url:'/create_user_web_war_exploded/web/api/user',
        data: JSON.stringify(data),
        dataType: 'json',
        /*contentType:'application/json',*/
        /* success: function(res) {
             alert("Cập Nhật Thành Công !");
         },
         error: function(res) {
             alert("Cập Nhật Thất Bại !");
         }*/
        success: function() {
            alert("Cập Nhật Thành Công !");
        },
    })
}
function fire_ajax_update(){
    var form = $('#imageupdate')[0];
    var data = new FormData(form);
    console.log("ok");
    $.ajax({
        type:'POST',
        enctype: 'multipart/form-data',
        url:'upload/multi',
        data: data,
        processData: false,
        contentType: false,
        cache: false,
        timeout: 600000,
        success:function (data){
            console.log("success");
        }
    })
}

$(document).ready(function(){
    $('#fileUpdate').on('change', function() {
        var files = $(this)[0].files;

        for(var i = 0; i < files.length; i++) {
            var file = files[i];
            var fileReader = new FileReader();
            fileReader.onload = event => {
                var str = '<div class="col-md-2">' +
                    '<img class="picture" style="width: 173px; height: 173px">' +
                    '</div>';
                $('.imagesboxupdate').append(str);

                var imageSrc = event.target.result;
                $('.picture').last().attr('src', imageSrc);
            }
            fileReader.readAsDataURL(file);
        }
    });
});