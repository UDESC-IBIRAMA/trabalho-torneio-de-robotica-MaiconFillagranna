
$(function() {
    $('#form').submit(function () {
        $.ajax({
            type: "POST",
            contentType: "application/json",
            url: "http://localhost:8080/equipes",
            data: $(this).serialize(),
            dataType: 'json',
            cache: false,
            success: function (data) {
                debugger;
            },
            error: function (e) {
                debugger;
            }
        });
    });
});