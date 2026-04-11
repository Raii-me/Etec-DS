package exercicios;

public class MetodoComParametro1 {
    public void exibirMsg(String mensagem){
        System.out.println("Mensagem detectada: " + mensagem);
    }

    public static void main (String[]args){
        MetodoComParametro1 msg = new MetodoComParametro1();
        msg.exibirMsg("Tenha um bom dia! :D");
    }

}
