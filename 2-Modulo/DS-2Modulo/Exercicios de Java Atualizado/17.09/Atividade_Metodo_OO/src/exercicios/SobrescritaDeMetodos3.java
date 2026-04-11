package exercicios;

public class SobrescritaDeMetodos3 {
    public void desenhar() {
        System.out.println("O usuario esta desenhando um: ");
    }
}
    class Quadrado extends SobrescritaDeMetodos3 {
        @Override
        public void desenhar(){
            System.out.println("Um quadrado!");
        }
    }
    class Circulo extends SobrescritaDeMetodos3 {
        @Override
        public void desenhar(){
            System.out.println("Um circulo!");
        }
    }

    class FinalDesenho {
        public static void main(String[]args){
                SobrescritaDeMetodos3 desenho = new SobrescritaDeMetodos3();
                SobrescritaDeMetodos3 Quadrado = new Quadrado();
                SobrescritaDeMetodos3 Circulo = new Circulo();
            desenho.desenhar();
            Quadrado.desenhar();
            Circulo.desenhar();

        }
    }

