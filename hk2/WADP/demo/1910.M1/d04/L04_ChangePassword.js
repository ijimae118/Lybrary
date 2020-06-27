/* 
 xu ly kiem tra  thay doi password
 */
function kt() {
    alert("JQUERY");

    var pass1 = $("#txtNewPass").val();
    var pass2 = $("#txtNewPass2").val();
    if (pass1 != pass2) {
        alert("New PASS is not the same PASS confirm !!!");
        return false;
    } else {
        alert("GOOD JOB !!!");
        return false;
    }

}
