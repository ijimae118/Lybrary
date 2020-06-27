<!DOCTYPE html>
<!--
demo ham header(), chuyen huong trang web
-->
<html>
    <head>
        <meta charset="UTF-8">
        <title>header</title>
        <link href="../css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <script src="../js/jquery-3.4.1.min.js" type="text/javascript"></script>
        <script src="../js/bootstrap.min.js" type="text/javascript"></script>

    </head>
    <body>
        <div class="container">
            <h2>PHP header() demo</h2>
            <hr>
            
            <?php
                $date = gmdate("d M y");
                $time = gmdate("H");
                
                //chuyen chuoi thanh so
                $intTime = intval($time);
                
                echo "<p>Today is $date <br>";
                echo "It is $time o'clock ! </p>";
                
                if($intTime > 7){
                    echo "<p>I'm sleeping ....</p>";
                    echo "<p>News reading time is before 7am ...</p>";
                }
                else{
                    header("location:https://vnexpress.net/");
                }
            ?>           

        </div>



    </body>
</html>
