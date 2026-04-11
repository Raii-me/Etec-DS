package exemplos;

public class MetodoComParametros {
    //criando metodo
    public void imprimirNome(String nome) {
        //função dele
        System.out.println("Nome recebido: " + nome);
    }
    public static void  main(String[] args) {
        //criando o objeto da classe (no caso imp)
        MetodoComParametros imp = new MetodoComParametros();
        //aqui ele seleciona o objeto no "imp"(no caso o nome) e pega o metodo(imprimirNome)
        imp.imprimirNome("Rai");
    }


}
