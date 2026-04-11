<?php
$nome = $_POST ["nomeUsuario"];
$senha = $_POST ["senhaUsuario"];

if ($nome = "admin" && $senha = "admin"){
    echo "<h1>ola $nome, seja bem vindo!</h1>";

    }else{
    echo  "<h1>Usuario ou senha incorretos</h1>";

}
?>
