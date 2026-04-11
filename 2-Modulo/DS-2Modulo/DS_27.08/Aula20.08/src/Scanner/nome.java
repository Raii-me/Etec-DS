package Scanner;

import java.util.Scanner;

public class nome {
    public static void main(String[] args) {
        Scanner cc = new Scanner(System.in);

        String nome;
        double saldo;

        System.out.println("Digite seu nome:");
        nome = cc.next();
        System.out.println("Digite seu saldo:");
        saldo = cc.nextDouble();

        System.out.println("-----Banco Uirapuru-----");
        System.out.println("O seu nome é: " + nome);
        System.out.println("O seu saldo é: " + saldo);

        cc.close();
    }
}