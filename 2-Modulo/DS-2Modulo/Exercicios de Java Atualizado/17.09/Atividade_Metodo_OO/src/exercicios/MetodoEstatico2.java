package exercicios;

public class MetodoEstatico2 {
    public static void somar(int valor1, int valor2){

        int res = valor1 + valor2;
        System.out.println("O valor da soma è: " + res);
    }
    public static void main(String[]args){
        MetodoEstatico2.somar(2,45);
    }
}
