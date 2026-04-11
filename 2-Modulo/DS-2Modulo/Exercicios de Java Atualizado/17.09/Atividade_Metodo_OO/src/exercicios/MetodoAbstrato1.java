package exercicios;

public abstract class MetodoAbstrato1 {

    public abstract void Instrumentos();

    public void tocar(){
        System.out.println("O usuario esta tocando: ");
    }
}
class Violao extends MetodoAbstrato1 {
    @Override
    public void Instrumentos(){
        System.out.println("Violão, ele esta tocando a trilha sonora de The Last Os Us.");
    }
}
class ResultadoInstrumentos{
    public static void main(String[]args){
        MetodoAbstrato1 resultado = new Violao();
        resultado.Instrumentos();
    }
}