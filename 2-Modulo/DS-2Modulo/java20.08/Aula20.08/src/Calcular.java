import java.util.Scanner;
import javax.swing.JOptionPane;

public class Calcular {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String alturasS = JOptionPane.showInputDialog("Digite o valor da area: ");
        String basesS = JOptionPane.showInputDialog("Digite o valor da base: ");

        int altura = Integer.parseInt(alturasS);
        int base = Integer.parseInt(basesS);

        int triangulo = (altura * base) / 2;
        int quadrado = base * base;
        int retangulo = altura * base;

        System.out.println("Valor da area do Quadrado é: " + quadrado);
        System.out.println("Valor da area do Retangulo é: " + retangulo);
        System.out.println("Valor da area do Triangulo é: " + triangulo);

    }

}
