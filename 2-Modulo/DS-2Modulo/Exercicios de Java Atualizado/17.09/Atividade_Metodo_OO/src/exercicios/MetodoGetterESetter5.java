package exercicios;

public class MetodoGetterESetter5 {
    private double saldo;
    private String titular;

    public void setSaldo(double saldoDaConta){
        this.saldo = saldoDaConta;
    }
    public void setTitular(String titular){
        this.titular = titular;
    }

    public double getSaldo(){
        return saldo;
    }
    public String getTitular (){
        return titular;
    }

    public static void main(String[]args){
        MetodoGetterESetter5 ContaBancaria = new MetodoGetterESetter5();
        ContaBancaria.setTitular("Raí Vicencio");
        ContaBancaria.setSaldo(2500.12);
        System.out.println("Nome do usuario: " + ContaBancaria.getTitular() + "\nSaldo da conta: "+ContaBancaria.getSaldo());
    }
}
