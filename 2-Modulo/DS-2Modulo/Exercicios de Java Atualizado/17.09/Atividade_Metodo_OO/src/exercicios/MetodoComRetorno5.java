package exercicios;

public class MetodoComRetorno5 {
    public String pi(){
        return "3.14159";
    }
    public static void main (String[]args){
        MetodoComRetorno5 valor = new MetodoComRetorno5();
        System.out.println("O valor de PI é: " + valor.pi());
    }
}
