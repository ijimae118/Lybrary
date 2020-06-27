<?php
//kiem tra xem trang L03_Personal.html da duoc chay chua (ie. da nhap lieu va bam submit chua)

if( isset($_GET["btnSUB"]) == FALSE){
    //trang nhap lieu HTML chua dc chay -> quay ve trang HTML
    header("location:L03_personal.html");
    exit();
}


?>

<!DOCTYPE html>
<!--
trang doc va xu ly so lieu duoc nhap o trang L03_personal.html  
-->
<html>
    <head>
        <meta charset="UTF-8">
        <title>personal details</title>
        <link href="../css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        
    </head>
    <body>
        <div class="container">
            <h2>Thong tin ca nhan </h2>
            <hr>
            
            <?php
            //doc du lieu nhap trong cac o nhap cua form
            $ten = $_GET["txtFirst"];
            $ho = $_GET["txtLast"];
            $diachi = $_GET["txtAddress"];
            $dienthoai = $_GET["txtContact"];

            //Xuat cac du lieu ra man hinh
            echo "<p>Ho va ten: $ho $ten </p>";
            echo "<p>Dia chi: $diachi </p>";
            echo "<p>So dien thoai: $dienthoai </p>";
            ?>

        </div>
    </body>
</html>
