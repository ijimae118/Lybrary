<!DOCTYPE html>
<!--
demo uniform variable
-->
<html>
    <head>
        <meta charset="UTF-8">
        <title>uniform</title>
        <link href="../css/bootstrap.min.css" rel="stylesheet" type="text/css"/>

    </head>
    <body>
        <div class="container">
            <h2>PHP.7 - Uniform Variable </h2>
            <hr>

            <?php
            $vehicle = "car";
            $car = "Toyota";
            
            echo "car = $car <br>";
            echo "<br> *** by uniform variable *** <br>";
            echo "car = " . $$vehicle ."<br>";
            ?>
        </div>
    </body>
</html>
