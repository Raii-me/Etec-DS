package exemplos;

public class SobrescritaDeMetodos {

    public void emitirSom() {
        System.out.println("Animal faz som");
    }
}
    class Cachorro extends SobrescritaDeMetodos {
        @Override
        public void emitirSom() {
            System.out.println("Au Au!");
        }
    }
     class Sobrescrita {
        public static void main(String[] args) {
            SobrescritaDeMetodos animal = new SobrescritaDeMetodos();
            SobrescritaDeMetodos cachorro = new Cachorro();

            animal.emitirSom();
            cachorro.emitirSom();
        }
    }


