package animal;

public abstract class Animal {

    private String nome; 
    private String raca;
    
    public Animal() {
        
    }
    
    public Animal(String nome) {
        this.nome = nome;
        
    }
    
    public void rolar() {
        System.out.println("Rolando...");
    }
    
    public abstract String caminha();
      
}
