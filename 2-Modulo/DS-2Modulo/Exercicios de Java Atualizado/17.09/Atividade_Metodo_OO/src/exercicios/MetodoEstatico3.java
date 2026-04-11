package exercicios;

public class MetodoEstatico3 {
    public static void receberValor(int valor){
        int resultado = valor * 2;
        System.out.println("O dobro do valor é: " + resultado);
    }
    public static void main(String[]args){
        MetodoEstatico3.receberValor(123);
    }
}
