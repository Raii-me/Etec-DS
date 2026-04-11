package exercicios;

public class SobrescritaDeMetodos2 {
    public void mover(){
    }

}
class carro extends SobrescritaDeMetodos2 {
    @Override
    public void mover(){
        System.out.println("O carro esta se movimentando");
    }
}
class FinalCarro{
    public static void main(String[]args){
        SobrescritaDeMetodos2 carro =  new carro();
        carro.mover();
    }
}