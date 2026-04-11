//Chamados diretamente pela chave
package exemplos;

public class MetodosEspeciais {
    //criando metodo especial (static, ou seja, pode ser chamado sem cria objeto)
    public static void mensagemEstatica() {
        //função do metodo (exibe a mensagem)
        System.out.println("Metodo estatico chamado!");
    }
    public static void main(String[]args){
        //chamando o metodo especial direto da classe, no caso "MetodosEspeciais"
        MetodosEspeciais.mensagemEstatica();
    }

}
