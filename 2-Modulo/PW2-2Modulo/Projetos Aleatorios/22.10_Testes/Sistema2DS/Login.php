<!DOCTYPE html>
<html lang="en">
<head>
    <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Quiosque</title>
    <link rel="stylesheet" type= "text/css" href="style.css">
    
</head>

<?php 
    //session_start(); 
    include("conexao.php");
?>

<body>
   

         
           <form action="LoginCheck.php" method="post">    
                                                          
   
              <span class="padding-bottom--15" align="center">Faça Login</span>
              <form id="stripe-login">

                <div class="field padding-bottom--24">
                  <label for="email">Nome de usuario</label>
                  <input type="text" name="nome">
                </div>

                
                <div class="field padding-bottom--24">
                  <label for="password">Senha do usuario</label>
                  <input type="password" name="password">
                </div>      
   

               



                <div class="field padding-bottom--salvar">
                  <input type="submit" name="submit" class="btn btn-primary" value="Salvar ">
                </div>

                <div class="field padding-bottom--cadastrar">
                  <input type="submit" name="cadastrar" class="btn btn-cad" value="Cadastrar">
                </div>


                





                
        </div>
      </div>
    </div>
  </div>
