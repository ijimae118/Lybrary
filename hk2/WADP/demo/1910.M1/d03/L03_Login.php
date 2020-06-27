<?php
if (isset($_POST["btnSUB"]) == FALSE) {
    //quay ve lai trang L03_login.htm
    header("location:L03_Login.html");
    exit();
}
?>

<!DOCTYPE html>
<!--
-->
<html>
    <head>
        <meta charset="UTF-8">
        <title></title>
        <link href="../css/bootstrap.min.css" rel="stylesheet" type="text/css"/>

    </head>
    <body>
        <div class="container">
            <?php
            //doc gia tri nhap user name
            $user = $_POST["txtUser"];
            
            //doc gia tri nhap password
            $pass = $_POST["txtPass"];
            
            //kiem tra 
            if(($user=="aptech" && $pass=="123") ||($user=="admin" && $pass=="abc")){
                echo "<h2>Welcome $user !</h2>";
            }
            else{
                echo "<h3>Sorry, Invalid Account !</h3>";
                echo "<p>Please, <a href='javascript:history.back()'>sign-in</a> again !</p>";
            }
            ?>
        </div>
    </body>
</html>
