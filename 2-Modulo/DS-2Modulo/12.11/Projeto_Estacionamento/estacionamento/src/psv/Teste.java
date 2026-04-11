/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package psv;

import java.sql.*;
import java.util.*;

public class Teste {

    public static void main(String[] args) {
        Connection con = Conexao.abrirConexao();
        CarroBean cb = new CarroBean();
        CarroDAO cd = new CarroDAO(con);
        //carro1
        cb.setPlaca("JKK1900");
        cb.setCor("Azul");
        cb.setDescricao("Carro 1");
        System.out.println(cd.inserir(cb));
        //carro2
        cb.setPlaca("JKP1900");
        cb.setCor("Verde");
        cb.setDescricao("Carro 2");
        System.out.println(cd.inserir(cb));
        //carro3
        cb.setPlaca("JOK1900");
        cb.setCor("Vermelho");
        cb.setDescricao("Carro 3");
        System.out.println(cd.inserir(cb));
        //alterar
        cb.setPlaca("KKK1900");
        cb.setCor("Amarelo");
        cb.setDescricao("Carro 3");
        System.out.println(cd.alter(cb));
        //excluir
        cb.setPlaca("KKK1900");
        System.out.println(cd.excluir(cb));
        
        List<CarroBean> lista = cd.listarTodos();
        
            if(lista != null){
                for(CarroBean carro : lista){
                    System.out.println("Placa: " + carro.getPlaca());
                    
                    System.out.println("Cor: " +carro.getCor());
                    
                    System.out.println("Descrião: "+carro.getDescricao());
                    
                    System.out.println(" ");
                }
            }
    }

}
