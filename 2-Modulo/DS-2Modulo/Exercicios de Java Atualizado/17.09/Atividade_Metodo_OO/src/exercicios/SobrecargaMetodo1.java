package exercicios;

public class SobrecargaMetodo1 {
     public void numero(int valorInt) {
         System.out.println("O valor inteiro é: " + valorInt);
     }
     public void numero(double valorReal) {
          System.out.println("O valor real é: " + valorReal);
     }
        public static void main(String [] args){
            SobrecargaMetodo1 exibir = new SobrecargaMetodo1();
            exibir.numero(3);
            exibir.numero(2.3);

        }
    }


