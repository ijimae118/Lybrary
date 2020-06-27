<?php
/*kiem tra trang [L04_login.php] da duoc chay chua ? */
if(isset($_POST["btnSUB"]) == FALSE){
    header("location:L04_login.php"); // chuyen ve trang L04_login.php
    exit();
}

/* 
Kiem tra thong tin dang nhap cua trang L04_login.php
 */

$user = $_POST["txtUser"];
$pass = $_POST["txtPass"];

if($user == "aptech" && $pass=="123"){
    //kiem tra co ghi nho account hay ko ?
    if(isset($_POST["chkRem"])){
        //tao bien cookie ghi nho account dang nhap
        setcookie("username", $user, time()+60*5); 
        setcookie("password", $pass, time()+60*5); 
    }
    
    header("location:L04_ChangePassword.php"); //open trang thay mk
}
else{
    echo '<script>alert("Invalid Account !\nRe-entry !")</script>';
    //header("location:L04_login.php"); 
    echo '<script>window.location="L04_login.php"</script>';
}
?>
