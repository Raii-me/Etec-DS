<?php
$nome = $_POST = ['NomeUsuario'];
$senha = $_POST = ['SenhaUsuario'];

if($nome = "admin" && $senha = "admin"){
    echo "<h1>Olá $nome, seja bem vindo!</h1>";
}else{
    echo "<h1>Usuario ou senha incorretos</h1>";
}
?>