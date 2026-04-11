package exercicios;

public class MetodoGetterESetter4 {
    private String tipo;
    private String som;

    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public void setSom(String som){
        this.som = som;
    }
    public String getTipo(){
        return tipo;
    }
    public String getSom(){
        return som;
    }
        public static void main(String[]args){
            MetodoGetterESetter4 animal = new MetodoGetterESetter4();
            animal.setTipo("Pato");
            animal.setSom("quack! quack!");
            System.out.println("Nome do animal: " + animal.getTipo() + "\nSom do animal: "+ animal.getSom());
        }
}
