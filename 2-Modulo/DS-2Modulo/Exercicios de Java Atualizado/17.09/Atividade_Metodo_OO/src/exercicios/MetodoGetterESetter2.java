package exercicios;

public class MetodoGetterESetter2 {
    private String nome;
    private double preco;

    public void setNome(String nomeProduto){
        this.nome = nomeProduto;
    }
    public void setPreco(double valorProduto){
        this.preco = valorProduto;
    }

    public String getNome() {
        return nome;
    }
    public double getPreco(){
        return preco;
    }
    public static void main(String[]args){
        MetodoGetterESetter2 metodo = new MetodoGetterESetter2();
        metodo.setNome("Teclado game");
        metodo.setPreco(187.24);
        System.out.println("Nome do produto: "+metodo.getNome()+"\nValor do produto: "+metodo.getPreco());
    }
}
