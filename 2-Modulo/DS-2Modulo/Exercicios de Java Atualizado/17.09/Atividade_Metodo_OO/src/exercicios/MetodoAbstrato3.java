package exercicios;

public abstract class MetodoAbstrato3 {

    public abstract void FiguraGeometrica();

    public void area(){
        System.out.println("A figura geometrica detectada é: ");
    }
}
    class Retangulo extends MetodoAbstrato3{
    @Override
        public void FiguraGeometrica(){
        System.out.println("Um retangulo, se parece com um cubo, mas é alongado em uma de suas areas.");
        }
    }

    class ResultadoFigura{
    public static void main(String[]args){
        MetodoAbstrato3 exibirMsg = new Retangulo();
        exibirMsg.area();
        exibirMsg.FiguraGeometrica();

    }
}