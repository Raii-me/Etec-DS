package Instanciar;

import java.util.Scanner;

public class Calculadora {
    // criando scanner
    Scanner calc = new Scanner(System.in);

    // variaveis globais
    String nome;
    int idade;
    double a;
    double b;
    double res;

    // criando metodos (function)
    void dados() {

        // Forma do usuario inserir valores
        System.out.println("Digite seu nome");
        nome = calc.next();
        System.out.println("Digite sua idade: ");
        idade = calc.nextInt();

        // mostrar na tela
        System.out.println("Seu nome é: " + nome + "\n"
                + "Sua idade é: " + idade);
    }

    // metodo "somar" (function)
    void somar() {

        // Forma do usuario inserir valores
        System.out.println("Digite o valor do primeiro numero: ");
        a = calc.nextDouble();
        System.out.println("Digite o valor do primeiro numero: ");
        b = calc.nextDouble();
        double res = a + b;
        System.out.println("O valor da some é: " + res);
    }

}
