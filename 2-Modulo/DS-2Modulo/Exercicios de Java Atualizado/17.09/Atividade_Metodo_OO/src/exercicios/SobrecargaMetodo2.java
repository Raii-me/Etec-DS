package exercicios;

import javax.print.attribute.standard.PresentationDirection;

public class SobrecargaMetodo2 {
    public void valorParaArea(int baseQua){
        int resQuadrado = baseQua * 2;
        System.out.println("O valor da area do quadrado é: " + resQuadrado);
    }
    public void valorParaArea(int baseRet, int alturaRet){
        int resRetangulo = baseRet * alturaRet;
        System.out.println("O valor da area do retangulo é: " + resRetangulo);
    }
    public static void main(String[]args){
        SobrecargaMetodo2 exibir = new SobrecargaMetodo2();
        exibir.valorParaArea(4);
        exibir.valorParaArea(2, 5);

    }
}
