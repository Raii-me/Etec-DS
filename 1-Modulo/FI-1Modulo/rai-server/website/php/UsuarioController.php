<?php

    $requisicao = $_POST['requisicao'];

    switch($requisicao){
        case 'Atualizar':
            include 'AtualizarUsuario.php';
            break;
            
        case 'cadastrar'
            include 'CadastrarUsuario.php';
            break;

        case'consultar':
            include 'ConsultarUsuario.php';
            break;

        case'remover':
            include 'RemoverUsuario.php';
            break;

        default:
            echo "Opção invalida.";
            break;
    }
?>