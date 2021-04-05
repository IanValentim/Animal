package animal;

public class Principal {

    public static void main(String[] args) {

        Lobo n1 = new Lobo();
        Cachorro n2 = new Cachorro();

        n1.emitirSom(); // deve uivar
        n2.emitirSom(); // deve latir
        
        n2.reagir(2, 12.5f); // deve latir
        n2.reagir(17, 4.5f); // deve rosnar
    }
    
}
