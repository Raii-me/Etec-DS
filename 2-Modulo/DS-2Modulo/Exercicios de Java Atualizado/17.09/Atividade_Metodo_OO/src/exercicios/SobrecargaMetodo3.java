package exercicios;

public class SobrecargaMetodo3 {
    public void textos(String textoSim) {
        System.out.println("Aqui está o texto simples: " + textoSim);
    }
    public void textos(String textoRep, int vezesRepitir) {
        System.out.println("Aqui esta o texto se repetindo: ");
        for (int vezes = 0; vezes < vezesRepitir; vezes++) {
            System.out.println(textoRep);
        }
    }
    public static void main(String[] args) {
        SobrecargaMetodo3 resultado = new SobrecargaMetodo3();
        resultado.textos("Ola, Raí");
        resultado.textos("Como esta indo o curso?", 7);

    }
}
