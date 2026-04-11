package exemplos;

public class MetodoComRetorno {

    //cria metodo
    public String nomeAluno() {
        //função do metodo, nesse caso ele retorna um nome fixo
        return "Rai";
    }

    public static void main(String[] args) {
        //cria o objeto da classe (nesse caso aluno)
        MetodoComRetorno aluno = new MetodoComRetorno();
        //imprime o resultado
        System.out.println("Nome do aluno: " + aluno.nomeAluno());

    }

}
