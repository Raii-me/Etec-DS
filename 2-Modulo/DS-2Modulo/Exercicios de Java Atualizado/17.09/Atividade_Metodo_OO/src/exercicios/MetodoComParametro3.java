package exercicios;

public class MetodoComParametro3 {

    public void exibirInfo(String nome,int idade){
        System.out.println("Seu nome é " + nome + " e sua idade é "+ idade);
    }
    public static void main (String [] args){
        MetodoComParametro3 nome = new MetodoComParametro3();
        nome.exibirInfo("Rai de vicencio", 19);
    }
}
