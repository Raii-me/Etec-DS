package exercicios;

public class MetodoEstatico5 {
    public static void valorPar(int valor) {
        Boolean resultado;
        if (valor % 2 == 0) {
            resultado = true;
            System.out.println("O valor é par (" + resultado + ")");
        } else {
            resultado = false;
            System.out.println("O valor é impar(" + resultado + ")");
        }
    }

    public static void main(String[] args) {
        MetodoEstatico5.valorPar(3);
    }
}
