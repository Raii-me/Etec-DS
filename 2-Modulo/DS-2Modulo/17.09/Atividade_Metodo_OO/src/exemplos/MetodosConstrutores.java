package exemplos;

public class MetodosConstrutores {
        //variaveis globais
        String nome;

        //metodo construtor
        public MetodosConstrutores(String nome) {
            this.nome = nome;
        }
        //metodo
        public void exibirAluno() {
            //mostrar na tela
            System.out.println("Aluno: " + nome);
        }

        public static void main (String[] args){
            //criando objeto aluno
            MetodosConstrutores aluno = new MetodosConstrutores("pedro");
            //objeto + metodo
            aluno.exibirAluno();

    }
}