<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>date-time</title>
        <link href="../css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <script src="../js/jquery-3.4.1.min.js" type="text/javascript"></script>
        <script src="../js/bootstrap.min.js" type="text/javascript"></script>
        

    </head>
    <body>
        <div class="container">
            <h2>PHP Date-Time</h2>
            <hr>
            
            <?php
            $datetime = gmdate("d M y, h:m:s");
            echo "Today is {$datetime} <br>";
            ?>
            
        </div>
    </body>
</html>
