package exercicios;

public class MetodoComRetornoEParametros3 {
    public int valor (int valor1){
        return valor1 * 2;
    }

    public static void main(String[]args){
        MetodoComRetornoEParametros3 calc = new MetodoComRetornoEParametros3();
        int res = calc.valor(4);
        System.out.println("O dobro do valor é: "+ res);

    }
}
