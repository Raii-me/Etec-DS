package exemplos;

public class SobrescritaDeMetodos {
    public void emitirSom() {
        System.out.println("Animal faz som");
    }
}
//criando uma classe "Cachorro" com herança a classe principal
class Cachorro extends SobrescritaDeMetodos {
    //@Override serve para reescrever encima do metodo
    @Override
    //criando metodo
    public void emitirSom() {
        System.out.println("Au Au!");
    }
    //criando outra classe (Sobrescrita)
    public class Sobrescrita {
        public static void main(String[] args) {
            //criando os objetos
            SobrescritaDeMetodos animal = new SobrescritaDeMetodos();
            SobrescritaDeMetodos cachorro = new Cachorro();
            //objeto + metodo da classe pai (no caso a "SobrescritaDeMetodos" (primeiro metodo))
            animal.emitirSom();
            //objeto + metodo da classe "Cachorro"
            cachorro.emitirSom();
        }
    }
}

