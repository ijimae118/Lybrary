<!DOCTYPE html>
<!--
demo closure call
-->
<html>
    <head>
        <meta charset="UTF-8">
        <title>closure</title>
        <link href="../css/bootstrap.min.css" rel="stylesheet" type="text/css"/>

    </head>
    <body>
        <div class="container-fluid">
            <h2>PHP.7 Closure call</h2>
            <hr>

            <?php
            class Greeting{
                private $word = "Hello";
            }
            
            class Farewell{
                private $word = "Goodbye";
                private $message="Attention !";
            }
            
            //dinh nghia 1 ham closure
            $f = function ($p){
                echo "<p> $this->word, $p </p>";
            };
            
            //khai bao 2 bien doi tuong 
            $b1 = new Greeting();
            $b2 = new Farewell();
            
            //thi hanh ham $f ket hop voi bien $b1, $b2
            $f->call($b1, "Ngoc Thach");
            $f->call($b2, "Thien Y");
            
            ?>            
        </div>
    </body>
</html>
