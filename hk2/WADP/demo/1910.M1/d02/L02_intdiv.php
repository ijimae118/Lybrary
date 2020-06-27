<!DOCTYPE html>
<!--
demo ham chia nguyen intdiv()
-->
<html>
    <head>
        <meta charset="UTF-8">
        <title>intdiv</title>
        <link href="../css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="container">
            <h2>PHP.7 intdiv() </h2>
            <hr>
            
            <?php
            $a = 10;
            $b = 3;
            
            echo "a = $a, b= $b <br>";
            echo "$a / $b = " . ($a/$b) . "<br>";
            echo "(int)$a / $b = " . (int)($a/$b) . "<br>";
            echo "$a intdiv $b = " . intdiv($a,$b) ."<br>";
    
            ?>           
        </div>

    </body>
</html>
