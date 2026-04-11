<?php

$dbHost = 'Localhost';
$dbUsername = "root";
$dbPassword = '';
$dbName =   'bdpw3';

$conexao = new mysqli($dbHost,$dbUsername,$dbPassword,$dbName);

$pdo = new PDO('mysql:host=Localhost;dbname=bdpw3', $dbUsername, $dbPassword);

?>
