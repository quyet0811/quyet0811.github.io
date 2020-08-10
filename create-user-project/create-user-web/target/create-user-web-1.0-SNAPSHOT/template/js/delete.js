$(document).ready(function () {
    $('#btnFind').click(function (event){
        // event.preventDefault();
        submitToDelete();
    })
})
function submitToDelete(){
    var data = {};
    data.id = $('#find-ID').val();
    data.userName = $('#find-name').val();


    findUser(data);
}
function findUser(data) {
    console.log("hihi");
    console.log("done");
    $.ajax({
        type: 'DELETE',

        url: '/delete/user/'+data.id,
        /*contentType:'application/json',*/
        success: function () {
            console.log("done");
        },


    }).done(function (response) {
        alert("Job done!!!!");
    }).fail(function (xhr, status, error) {
        alert(xhr.responseText);
    });
}