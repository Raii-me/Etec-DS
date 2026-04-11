package Exercicios;

import java.util.Scanner;

public class Exercicio_01 {

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        double n1 = 10;
        n1 = x.nextInt();
        System.out.println("Digite o segundo valor: ");
        double n2 = 9;
        n2 = x.nextInt();

        double soma = n1 + n2;
        double subtracao = n1 - n2;
        double multiplicacao = n1 * n2;
        double divisao = n1 / n2;

        System.out.println("O valor da some é: " + soma);
        System.out.println("O valor da subtração é: " + subtracao);
        System.out.println("O valor da multiplicação é: " + multiplicacao);
        System.out.println("O valor da Divisão é: " + divisao);

        x.close();
    }
}
