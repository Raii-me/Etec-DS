package exercicios;

public class MetodoComParametro2 {
    public void fazerCalculo (int valor1, int valor2){
        int resultado = valor1 + valor2;
        System.out.println("O valor da conta é: " + resultado);

    }
    public static void main (String[]args){
        MetodoComParametro2 calculo = new MetodoComParametro2();

        calculo.fazerCalculo(4,5);
    }
}
