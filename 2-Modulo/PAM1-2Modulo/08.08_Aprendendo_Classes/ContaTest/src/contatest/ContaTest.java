package contatest;

import javax.swing.JOptionPane;

public class ContaTest {

public static void main(String[] args) {
    
    Conta fabinho = new Conta();
    Conta cleitinho = new Conta();
    
    // a classe Double.parseDouble converte o valor  
    fabinho.saldo = Double.parseDouble( JOptionPane.showInputDialog("Informe o valor do saldo: ") );
    fabinho.cliente = JOptionPane.showInputDialog("Nome do cliente: ");
    cleitinho.cliente = JOptionPane.showInputDialog("Nome do cliente: ");
    
    
    fabinho.transferir(cleitinho, 200);
    }
    
}

