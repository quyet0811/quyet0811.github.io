/*$(document).ready(function () {*/
   /* $('#btnUpdate').click(function (event){
        event.preventDefault();
        updateUser();
    })*/
/*})*/
function updateUser(){
    var data = {};
    var Id = $('#update-ID').val();
    data.userName = $('#update-name').val();

    update(data,Id);
}
function update(data,id){

    $.ajax({
        type: 'PUT',
        url:'web/api/user/'+id,
        data: JSON.stringify(data),
        dataType: 'json',
        /*contentType:'application/json',*/
        success: function(res) {
            alert("Cập Nhật Thành Công !");
        },
        error: function(res) {
            alert("Cập Nhật Thất Bại !");
        }
    })
}