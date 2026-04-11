<?php
session_start();
include("conexao.php");
?>

<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" type="text/css" href="style.css">
  <title>Login</title>
</head>

<body>
  <form action="LoginCheck.php" method="post">

    <div class="meio">
      <div class="caixaCadastro">
        <div class="titulo">
          <h3>Faça Login!</h3>
        </div>

        <div class="text">Nome de usuario
        <br><input type="text" name="usuario" placeholder="Digite seu Usuario"></div>

        <div class="text">Senha do usuario</label>
        <br><input type="password" name="senha" placeholder="Digite sua Senha"></div>

        <input class="botaoLogin" type="submit" name="submit" value="Login">
        <input class="botaoVoltar" type="button" value="Voltar" onclick="window.location.href='home.php'">
  </form>
  </div>
  </div>