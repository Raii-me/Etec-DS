package superclasse;

public class Animal {
    
    String nome;
    String raca;
    double peso;

    //construtor da classe passando o nome 
    public Animal(String nome) {
    }

    //construtor da classe passando o nome e raca
    public Animal(String raca, String nome) {
    }
    
    //construtor da classe passando o nome, raca e peso
    public Animal(String nome, String raca, double peso) {
        this.nome = nome;
        this.raca = raca;
        this.peso = peso;
    }
    
    public void fazerBarulho(){
        System.out.println( "Opa rapaziadinha");
    }   

}
