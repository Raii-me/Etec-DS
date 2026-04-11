package exercicios;

public class MetodoComRetornoEParametros5 {
    public Boolean idade (int idd){
        Boolean res;
        if (idd > 17){
             res = true;
        }else{
             res = false;
        }
        return res;
    }
    public static void main(String[]args){
        MetodoComRetornoEParametros5 resIdade = new MetodoComRetornoEParametros5();
        Boolean resultado = resIdade.idade(18);
        System.out.println("O resultado da idade é: " + resultado);

    }


}
