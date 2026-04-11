package exercicios;

public class SobrescritaDeMetodos1 {
    public void exibirSom() {
    }
}
class cachorro extends SobrescritaDeMetodos1 {
    @Override
    public void exibirSom() {
        System.out.println("Som do cachorro: Au Au");
    }
}

class FinalAnimal {
    public static void main(String[] args) {
        SobrescritaDeMetodos1 cachorro = new cachorro();
        cachorro.exibirSom();

    }
}
