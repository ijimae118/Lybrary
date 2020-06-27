<!DOCTYPE html>
<!--
demo toan tu spaceship
-->
<html>
    <head>
        <meta charset="UTF-8">
        <title>spaceship</title>
        <link href="../css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="container">
            <h2>PHP.7 - spaceship operator <=> </h2>
            <hr>
            <?php
            //so sanh cac bien so
            $a = 10;
            $b = 3;
            $c = 10;
            echo "a= $a, b= $b, c= $c <br>";
            echo "$a <=> $b = " . ($a <=> $b) . "<br>";
            echo "$b <=> $a = " . ($b <=> $a) . "<br>";
            echo "$a <=> $c = " . ($a <=> $c) . "<br>";
            
            //so sanh cac bien chuoi
            $s1 = "Lam Quach";
            $s2 = "Duong Dao";
            $s3 = "Lam Quach Gia";
            echo "<p>";
            echo "s1 = [$s1], s2 = [$s2], s3=[$s3] <br>";
            echo "s1 <=> s2 = " . ($s1 <=> $s2) . "<br>";
            echo "s1 <=> s3 = " . ($s1 <=> $s3) . "<br>";   
            echo "</p>";
            
            //so sanh cac mang
            $a1=[1, 2, 3, 4, 5];
            $a2=[3, 2, 4, 3];
            $a3=[1, 2, 3, 4];
            echo "<pre>";
            
            echo "a1 = ";
            print_r($a1); 
            
            echo "a2 = ";
            print_r($a2); 
            
            echo "a3 = ";
            print_r($a3);
            
            echo "</pre>";
            echo "<p>";
            echo "a1 <=> a2 = ". ($a1<=>$a2). "<br>";
            echo "a2 <=> a3 = ". ($a2<=>$a3). "<br>";
            echo "a3 <=> a2 = ". ($a3<=>$a2). "<br>";
            echo "</p>";
            
            ?>            

        </div>

    </body>
</html>
