//Acessam e modificam atributos privados
package exemplos;

public class MetodoGettersESetters {
    //variavel privada, no caso só pode ser ultilizada dentro da sua classe
    private String nome;

    //Setter (modifica o valor da variavel)
    public void setNome(String nome) {
        this.nome = nome;
    }

    //Getter (retorna o valor da variavel)
    public String getNome() {
        return this.nome;
    }
    public static void main (String[]args){
        //criando um objeto
        MetodoGettersESetters pessoa = new MetodoGettersESetters();
        //Setter sendo usado aqui para adicionar o valor da variavel(no caso o nome rai)
        pessoa.setNome("Rai");
        //exibe na tela o resultado
        System.out.println("Nome: " + pessoa.getNome());
    }
}
