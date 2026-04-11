package exercicios;

public class MetodoComRetorno2 {
    public String nomeCompleto(){
        return "Rai de Vicencio Meneghini";
    }

    public static void main (String[]args){
        MetodoComRetorno2 nome = new MetodoComRetorno2();
        System.out.println("O seu nome é: " + nome.nomeCompleto());
    }
}
