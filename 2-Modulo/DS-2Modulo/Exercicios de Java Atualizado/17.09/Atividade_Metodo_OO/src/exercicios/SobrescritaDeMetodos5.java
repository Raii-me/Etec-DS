package exercicios;

public class SobrescritaDeMetodos5 {
    public void jogar(){
        System.out.println("O atleta esta jogando: ");
    }
}
class futebol extends  SobrescritaDeMetodos5 {
    @Override
    public void jogar(){
        System.out.println("Futebol, ele é atacante e fez um gol");
    }
}
class basquete extends  SobrescritaDeMetodos5 {
    @Override
    public void jogar(){
        System.out.println("Basquete, ele é pivo e fez 23 pontos");
    }
}
class FinalEsportes{
    public static void main(String[]args) {
        SobrescritaDeMetodos5 esporte = new SobrescritaDeMetodos5();
        SobrescritaDeMetodos5 atletaFutebol = new futebol();
        SobrescritaDeMetodos5 atletaBasquete = new basquete();
        esporte.jogar();
        atletaFutebol.jogar();
        atletaBasquete.jogar();
    }
}