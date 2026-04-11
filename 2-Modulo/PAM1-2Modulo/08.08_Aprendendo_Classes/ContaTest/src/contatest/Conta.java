package contatest;

import javax.swing.JOptionPane;

public class Conta {
    double saldo; 
    String cliente; 

    public void sacar (double valor){
        saldo = saldo - valor;
        JOptionPane.showMessageDialog(null, cliente + " operação de saque no valor de R$" + valor);
    }
    
    public void depositar (double valor){
        saldo = saldo + valor;
         JOptionPane.showMessageDialog(null, cliente + " operação de deposito no valor de R$" + valor);
    }
    
    public void exibirSaldo (){
        JOptionPane.showMessageDialog(null, cliente + ", Seu saldo é R$" + saldo);
    }
    
    public void transferir(Conta destino, double valor){
        this.sacar(valor);
        destino.depositar(valor);
        
 
        JOptionPane.showMessageDialog(null, this.cliente + " Transferencia de R$ "+ valor + " para " + destino.cliente);
        
    }
    
}
