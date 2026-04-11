package Instanciar2;

import java.util.Scanner;

public class Calculadora {

    Scanner calculadora = new Scanner(System.in);

    double numero1;
    double numero2;
    double res;

    void somar() {
        // Forma do usuario inserir valores
        System.out.println("Digite o valor do primeiro numero: ");
        numero1 = calculadora.nextDouble();
        System.out.println("Digite o valor do segundo numero: ");
        numero2 = calculadora.nextDouble();
        // função do metodo
        double res = numero1 + numero2;
        System.out.println("O valor da some é: " + res);
    }

    void subtrair() {
        // Forma do usuario inserir valores
        System.out.println("Digite o valor do primeiro numero: ");
        numero1 = calculadora.nextDouble();
        System.out.println("Digite o valor do segundo numero: ");
        numero2 = calculadora.nextDouble();
        // função do metodo
        double res = numero1 - numero2;
        System.out.println("O valor da subtração é: " + res);
    }

    void multiplicação() {
        // Forma do usuario inserir valores
        System.out.println("Digite o valor do primeiro numero: ");
        numero1 = calculadora.nextDouble();
        System.out.println("Digite o valor do segundo numero: ");
        numero2 = calculadora.nextDouble();
        // função do metodo
        double res = numero1 * numero2;
        System.out.println("O valor da multiplicação é: " + res);
    }

    void divisão() {
        // Forma do usuario inserir valores
        System.out.println("Digite o valor do primeiro numero: ");
        numero1 = calculadora.nextDouble();
        System.out.println("Digite o valor do segundo numero: ");
        numero2 = calculadora.nextDouble();

        // função do metodo
        double res = numero1 / numero2;
        //mostrar resultado na tela
        System.out.println("O valor da divisão é: " + res);
    }

    void areaQuadrado() {

        // Forma do usuario inserir valores
        System.out.println("Digite o valor do lado do quadrado: ");
        numero1 = calculadora.nextDouble();

        // função do metodo
        double res = numero1 * numero1;
        //mostrar resultado na tela
        System.out.println("A area do quadrado é: " + res);
    }

    void areaRetangulo() {
        // Forma do usuario inserir valores
        System.out.println("Digite o valor da altura do retangulo: ");
        numero1 = calculadora.nextDouble();
        System.out.println("Digite o valor da base do retangulo: ");
        numero2 = calculadora.nextDouble();

        // função do metodo
        double res = numero1 * numero2;
        //mostrar resultado na tela
        System.out.println("O valor da area do retangulo é: " + res);
    }

    void areaTriangulo() {
        // Forma do usuario inserir valores
        System.out.println("Digite o valor da base do triangulo: ");
        numero1 = calculadora.nextDouble();
        System.out.println("Digite o valor da altura do triangulo: ");
        numero2 = calculadora.nextDouble();

        // função do metodo
        double res = (numero1 * numero2) / 2;
        //mostrar resultado na tela
        System.out.println("O valor da area do triangulo é: " + res);
    }

    void volumeCone() {
        // Forma do usuario inserir valores
        System.out.println("Digite o valor do altura do cone: ");
        numero1 = calculadora.nextDouble();
        System.out.println("Digite o valor do raio do cone: ");
        numero2 = calculadora.nextDouble();

        // função do metodo
        double res = 0.33 * 3.14 * numero2 * numero2 * numero1;
        //mostrar resultado na tela
        System.out.println("O valor do volume do cone é: " + res);
    }
}
