<?php
if(isset($_COOKIE["password"])==FALSE){
    header("location:L04_login.php");
    exit();
}
$pass = $_COOKIE["password"];

?>

<!DOCTYPE html>
<!--
trang thay doi password
-->

<html>
    <head>
        <meta charset="UTF-8">
        <title>change password</title>
        <link href="../css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <script src="../js/jquery-3.4.1.min.js" type="text/javascript"></script>




    </head>
    <body>
        <div class="container">
            <div class="row">
                <div class="col-md-offset-4 col-md-4">

                    <div>
                        <h2>Change Password</h2>                       
                    </div>

                    <form action="L04_ChangePassword_Process.php" 
                          method="post" onsubmit="return kt();">

                        <div class="form-group">
                            <label>Old Password : </label>
                            <input type="password" name="txtOldPass"
                                   id="txtOldPass" required
                                   class="form-control" >   
                        </div>

                        <div class="form-group">
                            <label>New Password : </label>
                            <input type="password" 
                                   name="txtNewPass"
                                   id="txtNewPass" required
                                   class="form-control" >   
                        </div>

                        <div class="form-group">
                            <label>New Password Confirm : </label>
                            <input type="password" 
                                   name="txtNewPass2"
                                   id="txtNewPass2" required
                                   class="form-control" >   
                        </div>                         

                        <div class="form-group">
                            <input type="submit" value="Submit" 
                                   name="btnSUB"
                                   class="btn btn-danger">
                            <input type="reset" value="Reset"
                                   class="btn btn-success">
                        </div>

                    </form>
                </div>
            </div>
        </div>             

    </body>
</html>

<script>

    /* 
     xu ly kiem tra  thay doi password
     */

    function kt() {
        <?php
            echo "pass= '$pass'; ";
        ?>

        var pass1 = $("#txtNewPass").val();
        var pass2 = $("#txtNewPass2").val();
        var oldPass = $("#txtOldPass").val();

        if (pass1 != pass2) {
            alert("New PASS is not the same PASS confirm !!!");
            return false;
        } else {
            if (oldPass != pass) {
                alert("Incorrect Old PASSWORD  !!!");
            } else {
                alert("GOOD JOB !!!");
            }
            return false;
        }

    }
</script>
