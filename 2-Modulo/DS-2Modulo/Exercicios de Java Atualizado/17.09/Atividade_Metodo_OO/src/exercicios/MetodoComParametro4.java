package exercicios;

public class MetodoComParametro4 {
    public void numeroImparOuPar(int valor1) {
        String res;
        if (valor1 > 0) {
            res = "Positivo";
        } else {
            res = "Negativo";
        }

        System.out.println("O numero é " + res);
    }

    public static void main(String[] args) {
        MetodoComParametro4 resultado = new MetodoComParametro4();
        resultado.numeroImparOuPar(-3);
    }
}