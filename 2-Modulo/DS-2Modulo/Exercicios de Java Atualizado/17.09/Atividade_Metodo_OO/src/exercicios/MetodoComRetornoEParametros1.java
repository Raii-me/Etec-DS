package exercicios;

public class MetodoComRetornoEParametros1 {
    public int valores (int x, int y){
    return x * y;
    }
    public static void main (String [] args){
        MetodoComRetornoEParametros1 calculo = new MetodoComRetornoEParametros1();
        int res = calculo.valores(3,2);
        System.out.println("O resultado da conta é: "+ res);

    }

}
