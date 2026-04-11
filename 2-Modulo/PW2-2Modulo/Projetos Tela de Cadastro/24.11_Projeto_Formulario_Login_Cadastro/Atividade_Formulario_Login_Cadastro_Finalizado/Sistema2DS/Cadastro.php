<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>Cadastro</title>
  <link rel="stylesheet" type="text/css" href="style.css">
</head>
<?php
//session_start(); 
include("conexao.php");
?>

<body>

  <form action="inserirCheck.php" method="post">


    <div class="meio">
      <div class="caixaCadastro">
        <div class="titulo">
          <h3>Faça Cadastro!</h3>
        </div>




        <div class="text">
          Nome
          <br><input type="text" name="nome" placeholder="Ex: João da Silva">
        </div>

        <div class="text">
          Data de Nascimento
          <br><input type="date" name="dt_nasc">
        </div>

        <div class="text">
          Nome de usuario
          <br><input type="text" name="usuario" placeholder="Ex: JoaoSlv">
        </div>

        <div class="text">
          Senha do usuario
          <br><input type="password" name="senha" placeholder="Minimo 8 Caracteres">
        </div>

        <input class="botaoCadastrar" type="submit" name="submit" class="btn btn-primary" value="Cadastrar ">

        <input class="botaoVoltar" type="button" value="Voltar" onclick="window.location.href='home.php'">

        


      </div>
    </div>