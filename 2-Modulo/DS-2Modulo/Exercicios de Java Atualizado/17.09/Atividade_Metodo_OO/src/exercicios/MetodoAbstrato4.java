package exercicios;

public abstract class MetodoAbstrato4 {

    public abstract void Veiculo();

    public void tipoCombustivel(){
        System.out.println("O combustivel destinado ao veiculo: ");
    }
}
    class Moto extends MetodoAbstrato4{
    @Override
    public void Veiculo(){
        System.out.println("Moto, são 20 Litros de dizel.");
    }
}
    class ResultadoVeiculo{
        public static void main(String[]args){
            MetodoAbstrato4 veiculo = new Moto();
            veiculo.tipoCombustivel();
            veiculo.Veiculo();
        }
    }