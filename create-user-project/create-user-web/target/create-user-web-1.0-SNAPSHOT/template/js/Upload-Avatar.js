
$(document).ready(function(){
    $('#fileInput').on('change', function() {
        var files = $(this)[0].files;

        for(var i = 0; i < files.length; i++) {
            var file = files[i];
            var fileReader = new FileReader();
            fileReader.onload = event => {
                var str = '<div class="col-md-2">' +
                    '<img class="picture" style="width: 173px; height: 173px">' +
                    '</div>';
                $('.imagesbox').append(str);

                var imageSrc = event.target.result;
                $('.picture').last().attr('src', imageSrc);
            }
            fileReader.readAsDataURL(file);
        }
    });
});

$(document).ready(function () {
    $("#btnSubmit").click(function (event) {

        //stop submit the form, we will post it manually.
        event.preventDefault();
        submitUser();
        fire_ajax_submit();

    });

});
function fire_ajax_submit(){
    var form = $('#imageupload')[0];
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