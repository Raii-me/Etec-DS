package exercicios;

public class MetodoEstatico4 {
    public static void mensagem(){
        int valor = 3;
        for (int repetir = 0; repetir < valor; repetir++) {
            System.out.println("Mensagem que vai ser repetir 3 vezes");
        }
    }
    public static void main(String[]args){
        MetodoEstatico4.mensagem();
    }
}
