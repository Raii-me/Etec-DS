package Escola;

import java.util.Scanner;

public class Escola {

    public static void main(String[] args) {

        Scanner cad = new Scanner(System.in);
        Aluno dados = new Aluno();

        System.out.println("Digite seu nome: ");
        String nome = cad.nextLine();

        dados.setNome(nome);

        System.out.println("Digite sua idade: ");
        int idade = cad.nextInt();

        dados.setIdade(idade);

        dados.mostrardados();

        cad.close();

    }

}
