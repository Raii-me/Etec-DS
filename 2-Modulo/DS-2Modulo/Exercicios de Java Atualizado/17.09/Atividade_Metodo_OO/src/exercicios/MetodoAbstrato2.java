package exercicios;

public abstract class MetodoAbstrato2 {

    public abstract void Pessoas();

    public void profissao() {
        System.out.println("A profissão do usuario è: ");
    }
}
    class Medico extends MetodoAbstrato2 {
        @Override
        public void Pessoas() {
            System.out.println("Medico, ele fará uma consulta em 2 horas.");
        }
    }

    class ResultadoProfissao{
        public static void main(String[]args){
            MetodoAbstrato2 MostrarProf = new Medico();
            MetodoAbstrato2 ResultadoProf = new Medico();
            MostrarProf.profissao();
            ResultadoProf.Pessoas();

        }
    }