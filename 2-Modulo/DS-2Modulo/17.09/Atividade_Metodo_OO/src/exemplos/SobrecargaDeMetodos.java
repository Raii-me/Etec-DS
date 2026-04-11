package exemplos;

public class SobrecargaDeMetodos {
    //metodo exibir com variavel numerica com nome "X"
    public void exibir(int x) {
        System.out.println("Valor inteiro: " + x);
    }

    //metodo exibir com variavel com qualquer caracteria
    public void exibir(String texto) {
        System.out.println("Texto: " + texto);
    }

    //metodo exibir com ambas as variaveis
    public void exibir(int x, String texto) {
        System.out.println(x + " - " + texto);
    }

    public static void main(String[] args) {
        //cria o objeto da classe
        SobrecargaDeMetodos sobrecarga = new SobrecargaDeMetodos();
        //objeto + primeiro metodo (int x)
        sobrecarga.exibir(1);
        //objeto + segundo metodo (String texto)
        sobrecarga.exibir("Texto de exemplo");
        sobrecarga.exibir(7, "1");

    }

}
