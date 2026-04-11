package exercicios;

public class SobrecargaMetodo5 {
    public void exibir(String nome){
        System.out.println("Nome do usuario: " + nome);
    }
    public void exibir(char sexo){
        System.out.println("Sexo do usuario: " + sexo);
    }

    public static void main(String[] args) {
        SobrecargaMetodo5 metodo = new SobrecargaMetodo5();
        metodo.exibir("Raí");
        metodo.exibir('M');
    }
}
