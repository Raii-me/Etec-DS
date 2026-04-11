package contatest;

public class Conta {
    private double saldo; 
    private String cliente; 

    public void sacar (double valor){
        saldo = saldo - valor;
    }
    
    public void depositar (double valor){
        saldo = saldo + valor;
    }
    
    public void exibirSaldo (){
        System.out.println(cliente + ", Seu saldo é R$" + saldo);
    }
}
