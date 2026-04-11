package Escola;



public class Aluno {
    
    String nome;
    int idade;


    //metodo mostrardados
    public void mostrardados(){
       
        System.out.println("Seu nome é: "+ nome);
        System.out.println("Sua idade é: "+ idade);

    }

    //Get e Set
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }
    
    public void setIdade(int idade){
        this.idade = idade;
    }

    public void getIdade(){
        
    }




}
