package exercicios;

public class MetodoComRetorno1 {
    public String anoAtual(){
        return "2025";
    }

    public static void main (String[]args){
        MetodoComRetorno1 ano = new MetodoComRetorno1();
        System.out.println("O ano atual é: " + ano.anoAtual());
    }

}
