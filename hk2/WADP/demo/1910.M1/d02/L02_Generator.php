<!DOCTYPE html>
<!--
Demo ve bo tao sinh gia tri ngau nhien
-->
<html>
    <head>
        <meta charset="UTF-8">
        <title>generator</title>
        <link href="../css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="container-fluid">
            <h2>PHP 7.x - Generator demo</h2>
            <hr>
            
            <?php
            srand(1);
            //ham tao bo so ngau nhien gom n-so[10,100]
            function SoNN($n) {
                for ($i = 0; $i < $n; $i++) {
                    yield rand(10, 100);
                }
                return -1;;
            }
            
            
            //goi ham SoNN, de tao ra 5 so bat ky
            echo "<p> *** 6 so *** : ";
            $r = SoNN(6);
            foreach ($r as $item) {
                echo "$item ";
            }
            
            ?>            

        </div>

    </body>
</html>
