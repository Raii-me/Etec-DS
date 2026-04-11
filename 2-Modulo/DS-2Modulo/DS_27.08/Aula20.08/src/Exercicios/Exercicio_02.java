package Exercicios;

import java.util.Scanner;

public class Exercicio_02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
    
        int idade;

        System.out.println("Digite o valor: ");
        idade = entrada.nextInt();

        if (idade % 2 == 0) {
            System.out.println("O valor é PAR");
        } else {
            System.out.println("O valor é IMPAR");
        }
        entrada.close();
    }
}
