


$(document).ready(function () {
    $("#regisForm").validate({
        rules: {
            "userName": { // <-- assign by field name and use quotes
                required: true,
                minlength: 6,
                maxlength: 40
            },
            "email": {
                required: true,  // <-- this rule was misspelled 'equired'
                email: true
            },
            "phone": {
                required: true,
                minlength: 10,
                number: true
            },
        },
        messages: {

            "userName": {
                required: "Name is required!",
                minlength: "Name must be at least 6 characters long"
            },
            "email": {
                required: "Please enter a email",
                email: "Email is not valid"
            },
            "phone": {
                required: "Please enter a phone number",
                minlength: "Phone number must be at least 10 numbers",
                number: "Phone number mustn't have words"
            },
        },
    });

});

function submitUser() {
    var dataArray = {};
    dataArray.userName = $('#userName').val();
    dataArray.email = $('#email').val();
    dataArray.phone = $('#phone').val();
    dataArray.role_id = $('#roleID').val();
    dataArray.avatar = $('#fileInput').val();
    if($('#regisForm').valid()){
        addUser(dataArray);
    }
    /*addUser(dataArray);*/
}
function addUser(data) {
console.log("hihi");
    console.log("done");
$.ajax({
    type:'POST',

    url:'web/success',
    data: data,
    dataType:'json',
    /*contentType:'application/json',*/
    success: function (){
        console.log("done");
    },


}).done(function (response) {
alert("Job done!!!!");
}).fail(function (xhr, status, error) {
alert(xhr.responseText);
});



}