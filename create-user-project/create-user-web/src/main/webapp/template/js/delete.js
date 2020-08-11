
$(document).ready(function () {
    /*   $('#btnFind').click(function (event){
           // event.preventDefault();
           submitToDelete();
       })*/
    $('#deleteForm').validate({

        rule:{
            "findID":{
                required: true,
                number:true
            }
        },
        messages:{
            "findID":{
                required: "ID is required",
                number: "ID must be number"
            }
        }
    });
});
function submitToDelete(){
    let data = {};
    /*data.id = document.getElementById('#findID').value();*/
    data.id = $('#findID').val();
    data.userName = $('#find-name').val();
    if($('#deleteForm').valid()){
        findUser(data);
    }

}
function findUser(data) {
    console.log("hihi");
    console.log("done");
    $.ajax({
        type: 'DELETE',

        url: '/create_user_web_war_exploded/delete/user/'+data.id,
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