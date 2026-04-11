package Exercicios;
import java.util.Scanner;
public class Exercicio_03 {
    public static void main (String [] args) {

        Scanner x = new Scanner(System.in);
        int idade;
        System.out.println("Digite sua idade: ");
        idade = x.nextInt();

        String resultado = (idade >= 18) ? "Voce é maior de idade" : "Voce nao é mais de idade" ;
        

        System.out.println("O resultado foi: " + resultado);
        
        x.close();
    }
}
