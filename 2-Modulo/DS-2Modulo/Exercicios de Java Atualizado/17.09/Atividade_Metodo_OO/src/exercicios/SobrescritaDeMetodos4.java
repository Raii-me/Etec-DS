package exercicios;

public class SobrescritaDeMetodos4 {
    public void trabalhar(){
        System.out.println("O funcionario esta trabalhando");
    }
}
class professor extends SobrescritaDeMetodos4 {
    @Override
    public void trabalhar(){
        System.out.println("O professor esta ensinando Java");
    }
}
class FinalFuncionario{
    public static void main(String[]args){
        SobrescritaDeMetodos4 trabalho = new SobrescritaDeMetodos4();
        SobrescritaDeMetodos4 funcionario = new professor();
        trabalho.trabalhar();
        funcionario.trabalhar();

    }
}
