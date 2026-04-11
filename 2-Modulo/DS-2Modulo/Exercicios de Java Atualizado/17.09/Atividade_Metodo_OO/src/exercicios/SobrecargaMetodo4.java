package exercicios;

public class SobrecargaMetodo4 {
    public void somarNumeros(int valor1, int valor2 ){
        int resultado =valor1 + valor2;
        System.out.println("O valor da soma dos 2 numeros é: "+resultado);
    }
    public void somarNumeros(int valor1, int valor2, int valor3){
        int resultado = valor1 + valor2 + valor3;
        System.out.println("O valor da soma dos 3 numeros é: "+resultado);
    }
    public void somarNumeros(int valor1, int valor2, int valor3, int valor4){
        int resultado = valor1 + valor2 + valor3 + valor4;
        System.out.println("O valor da soma dos 4 numeros é: "+resultado);
    }
    public static void main(String []args){
        SobrecargaMetodo4 calculos = new SobrecargaMetodo4();
        calculos.somarNumeros(3,4);
        calculos.somarNumeros(5,29,44);
        calculos.somarNumeros(39,69,77,42);
    }
}
