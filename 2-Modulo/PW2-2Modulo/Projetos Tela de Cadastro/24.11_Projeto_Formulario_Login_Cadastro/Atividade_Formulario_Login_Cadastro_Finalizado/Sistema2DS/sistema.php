<?php
session_start();

if ((!isset($_SESSION['usuario']) == true) and (!isset($_SESSION['senha']) == true)) {

    unset($_SESSION['usuario']);
    unset($_SESSION['senha']);
    header('Location: Login.php');
}
$logado = $_SESSION['usuario'];
?>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" type="text/css" href="style.css">
    <title>Tela Inicial</title>
</head>

<body>
    <header>
        <div class="tituloPrincipal">Seja Bem Vindo ao Nosso Site!</div>
        <a href="sair.php"><input class="botaoSair" type="submit" name="sair" value="Sair"></a>
    </header>
    
    
</body>

</html>