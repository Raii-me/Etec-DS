//usa finalize() que é algo errado
package exemplos;

public class MetodosDestrutores {
    //metodo finalize (chamado quando é destruido pelo garbage collector)
    protected void finalize(){
        System.out.println("Objeto esta sendo removido pelo Garbage Collector");
    }
     public static void main(String[] args){
        //criando objeto
         MetodosDestrutores exemplo = new MetodosDestrutores();
         //tira a referencia do objeto
         exemplo = null;
         //pede para o garbage collector para fazer uma limpeza
         System.gc();
     }
}
