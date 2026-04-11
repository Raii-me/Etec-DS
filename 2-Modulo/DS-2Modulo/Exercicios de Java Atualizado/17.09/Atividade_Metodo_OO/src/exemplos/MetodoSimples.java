package exemplos;
public class MetodoSimples {
    //cria o metodo
    public void exibirSaudacao() {
        //funcão do metodo
        System.out.println("Seja bem-vindo a aula de java!");
    }

    public static void main(String[] args) {
        //cria o objeto da classe, nesse caso o objeto é a "mensagem"
        MetodoSimples mensagem = new MetodoSimples();
        //aqui seleciona o objeto (mensagem) e o metodo (.exibirSaudacao)
        mensagem.exibirSaudacao();
    }

}
