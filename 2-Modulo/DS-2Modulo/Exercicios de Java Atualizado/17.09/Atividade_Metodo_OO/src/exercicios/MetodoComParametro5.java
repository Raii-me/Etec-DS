package exercicios;

public class MetodoComParametro5 {
    public void exibirInfo(String saud, String nome){
        System.out.println("Ola, "+nome +"\nEssa é sua saudação: \n" + saud);
    }
    public static void main (String []args){
        MetodoComParametro5 msg = new MetodoComParametro5();
        msg.exibirInfo("Bom dia a todos", "Rai Vicencio");
    }

}
