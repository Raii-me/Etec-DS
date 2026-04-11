public class exercicio01 {
    public static void main(String[] args) {
        String nome = "auldalberrtuh";
        int idade = 124;
        double altura = 1.54;
        boolean aprovacao = false; 

        String status;
        if (aprovacao == false ){
            status = "Reprovado"; 
        } else {
            status = "Aprovado";
        }
        
        System.out.println("Seu nome é: " + nome);
        System.out.println("Sua idade é: " + idade);
        System.out.println("Sua altura é: " + altura);
        System.out.println("Sua aprovação foi: " + status);
    }
}
