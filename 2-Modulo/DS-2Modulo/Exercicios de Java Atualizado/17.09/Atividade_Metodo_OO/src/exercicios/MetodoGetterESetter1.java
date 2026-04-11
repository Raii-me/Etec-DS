package exercicios;

public class MetodoGetterESetter1 {
        private String nome;
        private int idade;

        public void setNome (String nome){
            this.nome = nome;
        }
        public void setIdade ( int idade){
            this.idade = idade;
        }
        public String getNome () {
            return nome;
        }
        public int getIdade () {
            return idade;
        }

    public static void main(String[]args){
        MetodoGetterESetter1 metodo = new MetodoGetterESetter1();
        metodo.setNome("Raí");
        metodo.setIdade(19);
        System.out.println("O nome do usuario é " + metodo.getNome() + " e sua idade é " + metodo.getIdade() + ".");

    }
}
