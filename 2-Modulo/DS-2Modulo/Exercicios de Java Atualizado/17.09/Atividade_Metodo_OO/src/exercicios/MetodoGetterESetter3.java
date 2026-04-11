package exercicios;

public class MetodoGetterESetter3 {
    private String nomeA;
    private String nomeL;

    public void setnomeA(String nomeAutor){
        this.nomeA=nomeAutor;
    }

    public void setnomeL(String nomeLivro){
        this.nomeL=nomeLivro;
    }

    public String getNomeA(){
        return nomeA;
    }

    public String getNomeL(){
        return nomeL;
    }
    public static void main(String[]args){
        MetodoGetterESetter3 metodo = new MetodoGetterESetter3();
        metodo.setnomeA("Raí");
        metodo.setnomeL("O cataclisma");
        //sem criatividade para nome de livro :(
        System.out.println("Nome do autor: " + metodo.getNomeA() + "\nNome do livro: " + metodo.getNomeL() );

    }

}
