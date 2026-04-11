package bonus;
import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);

        int contaCorrente;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("Digite seu nome: ");
        nomeCliente = x.next();
        System.out.println("Digite o nome da sua agencia: ");
        agencia = x.next();
        System.out.println("Digite o valor da sua conta corrente: ");
        contaCorrente = x.nextInt();
        System.out.println("Digite seu saldo: ");
        saldo = x.nextInt();

        System.out.println("------Dados------");
        System.out.println("Seu nome é: " + nomeCliente);
        System.out.println("Sua agencia é: " + agencia);
        System.out.println("O valor da sua conta corrente é:" + contaCorrente);
        System.out.println("Seu saldo é:" + saldo);

        x.close();

    }
}
