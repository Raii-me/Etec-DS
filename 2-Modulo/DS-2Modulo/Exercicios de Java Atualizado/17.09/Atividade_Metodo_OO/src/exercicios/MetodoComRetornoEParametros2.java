package exercicios;

public class MetodoComRetornoEParametros2 {

    public String exibirInfo(String nome, String msg) {
        return nome + msg;
    }

    public static void main(String[] args) {
        MetodoComRetornoEParametros2 texto = new MetodoComRetornoEParametros2();
        String msg = texto.exibirInfo("Rai Vicencio \n", "TA SUAVE MEU PARCEIRO????");

        System.out.println("Ola, " + msg );
    }
}
