<!DOCTYPE html>
<!--
demo ham cong 2 so - add(a,b) 
ham add, co 2 tham so a, b [co khai bao kieu cua a,b]
-->
<html>
    <head>
        <meta charset="UTF-8">
        <title>scalar</title>
        <link href="../css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="container">
            <h2>PHP7. Function without parameter type declaration</h2>
            <hr>
            <?php
            $x = 15; 
            $y = 6;
            add($x, $y);
            
            $x1= 13.678;
            add($x, $x1);
            
            $x2 = "123.456";
            add($x, $x2);
            
            function add(int $a, int $b) {
                $kq = $a + $b;
                echo "<br> a = $a, b=$b <br>";
                echo "$a + $b = $kq <br><br>";
            }
            ?>

        </div>
    </body>
</html>
