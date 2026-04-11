package bonus;

import java.util.Scanner;

public class ternario2 {
    
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        int idade;

        System.out.println("Digite sua idade: ");
        idade = x.nextInt();

        String resultado = (idade >= 18) ? "maior de idade" : "menor de idade";

        System.out.println("");
        System.out.println("Sua idade é: " + idade);
        System.out.println("");
        System.out.println("Você é " + resultado);
        System.out.println("");



        x.close();
    }

}
