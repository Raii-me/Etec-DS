package exercicios;

public class MetodoComRetornoEParametros4 {
    public String exibirStrings(String txt1, String txt2) {
        return txt1 + txt2;
    }
    public static void main(String[]args){
        MetodoComRetornoEParametros4 conc = new MetodoComRetornoEParametros4();
        String TextoFinal = conc.exibirStrings("Bom dia " , "\nRai Vicencio.");
        System.out.println("Ola, " + TextoFinal);
    }
}
