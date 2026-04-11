package exercicios;

public class MetodoComRetorno4 {
    public Boolean valor(){
        return true;
    }

    public static void main (String[]args){
        MetodoComRetorno4 valor = new MetodoComRetorno4();
        System.out.println("O valor escolhido foi: " + valor.valor());
    }
}
