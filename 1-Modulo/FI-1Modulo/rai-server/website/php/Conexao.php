<?php
//todo codigo php vai ficar aqui

    $host = 'localhost';
    $nomeBanco = 'db_website';
    $usuario = 'root';
    $senha = '';

    //criar um objeto de conexão com o banco
    try{
        $conexao = new PDO(
            "mysql:host=$host;
            dbname=$nomeBanco;charset=UTF8",
            $usuario,
            $senha
        );
        $conexao->setAttibute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);
        echo "Conexão realizada com sucesso";
    }catch(PDOException $e){
         echo "ERRO: " . $e->getMessage();
    }

?>