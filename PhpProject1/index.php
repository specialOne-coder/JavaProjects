<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <meta charset="UTF-8">
        <title></title>
    </head>
    <body>
        <?php
        // put your code here
        $conn = mysqli_connect('localhost', 'root', '', 'mysql?zeroDateTimeBehavior=convertToNull', '3306');
        if (!$conn) {
            die('Could not connect to MySQL: ' . mysqli_connect_error());
        }
        mysqli_query($conn, 'SET NAMES \'utf8\'');
// TODO: insert your code here.
        mysqli_close($conn);
        
        ?>
    </body>
</html>
