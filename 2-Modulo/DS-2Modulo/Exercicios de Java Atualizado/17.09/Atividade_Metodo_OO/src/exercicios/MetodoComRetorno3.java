package exercicios;

public class MetodoComRetorno3 {
    public String valor(){
        return "100";
    }

    public static void main (String[]args){
        MetodoComRetorno3 nome = new MetodoComRetorno3();
        System.out.println("O valor fixo é: " + nome.valor());
    }

}
