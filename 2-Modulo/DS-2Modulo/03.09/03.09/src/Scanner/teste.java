package Scanner;

import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        //Explicando os codigo para mim mesmo no futuro

        //criando scanner
        Scanner cad = new Scanner(System.in);

        //puxar informações da outra pagina (No caso da pagina "Calculadora")
        Calculadora dados = new Calculadora();

        //forma do usuario digitar os valores das variaveis
        System.out.println("Digite o primeiro valor: ");
        int valor1 = cad.nextInt();
        dados.setV1(valor1);

        //forma do usuario digitar os valores das variaveis
        System.out.println("Digite o segundo valor: ");
        int valor2 = cad.nextInt();
        dados.setV2(valor2);

        //voce vai mudar o tipo da conta por aqui
        dados.volumeCone();

        //fecha o scanner
        cad.close();
    }

}
