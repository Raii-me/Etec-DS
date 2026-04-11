package exercicios;

public abstract class MetodoAbstrato5 {
    public abstract void Animal();

    public void alimentacao(){
        System.out.println("O proximo animal que precisa ser alimentando é:");
    }
}
    class Leao extends MetodoAbstrato5{
    @Override
    public void Animal(){
        System.out.println("O Leão, precisa ser 10kg de carne.");
        }
    }

    class ResultadoAnimal{
    public static void main(String[]args){
        MetodoAbstrato5 resultado = new Leao();
        resultado.alimentacao();
        resultado.Animal();

    }
}