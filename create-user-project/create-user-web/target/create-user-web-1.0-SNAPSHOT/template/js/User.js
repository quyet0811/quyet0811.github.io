/*src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"*/

/*$(document).ready(function () {

});*/
var check_valdidate;
var check_exist;
$(document).ready(function () {
    check_valdidate = false;
    check_exist =true;
    /*$("#registrationForm").validate({*/

       /* rules: {
            "userName": { // <-- assign by field name and use quotes
                required: true,
                minlength: 6,
                maxlength: 40
            },
            "email": {
                required: true,  // <-- this rule was misspelled 'equired'
                email:true
            },
            "phone": {
                required: true,
            },
            "role":{
                required: true,
                valueMissing: false,
            }
        },
        messages: {

            "userName": {
                required: "name is required!",
                minlength: "name must be at least 6 characters long"
            },
            "email": {
                required: "Please enter a email",
                email:"Email is not valid"
            },
            "phone": {
                required: "Please enter a phone number",


            },
            "role":{
                required:"Please choose your role",
            }
        },
        submitHandler: function(form)
        {*/
            check_valdidate = true;
      /*  }*/
/*    });*/
});
function submitUser() {
    var dataArray = {};
    dataArray.userName = $('#userName').val();
    dataArray.email = $('#email').val();
    dataArray.phone = $('#phone').val();
    dataArray.role_id = $('#roleID').val();
    if(check_valdidate&&check_exist){
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