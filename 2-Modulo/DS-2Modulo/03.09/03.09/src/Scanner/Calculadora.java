package Scanner;

public class Calculadora {
    // variaveis globais
    double valor1;
    double valor2;
    double res;

    // usando o SET para puxar um valor da variavel dentro da pagina "teste"
    public void setV1(double valor1) {
        this.valor1 = valor1;
    }

    // envia o valor do usuairo para variavel
    public double getV1() {
        return valor1;
    }

    // usando o SET para puxar um valor da variavel dentro da pagina "teste"
    public void setV2(double valor2) {
        this.valor2 = valor2;
    }

    // envia o valor do usuairo para variavel
    public double getV2() {
        return valor2;
    }

    // metodo somar
    void somar() {
        res = valor1 + valor2;
        System.out.println("O valor da soma é: "+res);
    }

    // metodo subtrair
    void subtracao() {
        res = valor1 - valor2;
        System.out.println("O valor da subtração é: ");
    }

    void multiplicacao() {
        res = valor1 * valor1;
        System.out.println("O valor da multiplicação é: ");
    }

    void divisão() {
        res = valor1 / valor2;
        System.out.println("O valor da divisão é: ");
    }

    void areaQuadrado() {
        res = valor1 * valor2;
        System.out.println("A area do quadrado é: " + res);
    }

    void areaRetangulo() {
        res = valor1 * valor1;
        System.out.println("O valor da area do retangulo é: " + res);
    }

    void areaTriangulo() {
        res = (valor1 * valor2) / 2;
        System.out.println("O valor da area do triangulo é: " + res);
    }

    void volumeCone() {
        res = 0.33 * 3.14 * (valor2 * valor2) * valor1;
        System.out.println("O valor do volume do cone é: " + res);
    }

    void volumeCubo(){
        res = valor1 * 3;
        System.out.println("O valor do volume do cubo é: "+res);
    }
}
