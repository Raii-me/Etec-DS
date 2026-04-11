package exemplos;

public class MetodoComRetornoEParamentros {
    //cria metodo, mas dessa vez é com INT para valores numericos
    public int multiplicar(int x, int y){
        //função do metodo
        return x * y;
    }

    public static void main (String [] args) {
        //criando o objeto da classe (calc)
        MetodoComRetornoEParamentros calc = new MetodoComRetornoEParamentros();
        //cria variavel resultado e faz a conta ( primeiro numero vai ser o valor de X e o segundo o valor de Y)
        int resultado = calc.multiplicar(4, 5);
        //mostra o resultado
        System.out.println("O resultado da conta é: " + resultado);
    }
}
