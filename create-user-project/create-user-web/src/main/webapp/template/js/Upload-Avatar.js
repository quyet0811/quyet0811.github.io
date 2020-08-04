/*
function previewUpload (input){
    const [file] = input.files
    const preview = document.getElementById('imagesbox')
    const reader = new FileReader();

    reader.onload = event =>{
        const img = document.createElement('img')
        img.src = event.target.result
        img.height=173
        img.width = 173
        img.alt = 'file'
        img.className='picture'
        preview.appendChild(img)
    }
    reader.readAsDataURL(file)
}*/
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