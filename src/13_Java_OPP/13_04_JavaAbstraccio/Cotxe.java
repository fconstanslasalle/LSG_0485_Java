package Java_OPP.JavaAbstraccio;

/**
 * Classe Cotxe que hereta de Vehicle.
 * És una classe concreta que implementa els mètodes abstractes de Vehicle.
 */
public class Cotxe extends Vehicle {
    private int numPortes;
    
    /**
     * Constructor de la classe Cotxe
     * @param marca La marca del cotxe
     * @param model El model del cotxe
     * @param any L'any de fabricació
     * @param numPortes El nombre de portes
     */
    public Cotxe(String marca, String model, int any, int numPortes) {
        super(marca, model, any);
        this.numPortes = numPortes;
    }
    
    /**
     * Implementació del mètode abstracte accelerar per al cotxe
     */
    @Override
    public void accelerar() {
        System.out.println("El cotxe " + marca + " " + model + " està accelerant per la carretera.");
    }
    
    /**
     * Implementació del mètode abstracte frenar per al cotxe
     */
    @Override
    public void frenar() {
        System.out.println("El cotxe " + marca + " " + model + " està frenant amb els frens de disc.");
    }
    
    /**
     * Mètode específic de Cotxe
     */
    public void obrir_portes() {
        System.out.println("S'estan obrint les " + numPortes + " portes del cotxe.");
    }
    
    /**
     * Sobreescriptura del mètode mostrarInfo per afegir informació específica
     */
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Nombre de portes: " + numPortes);
    }
    
    // Getter i Setter
    public int getNumPortes() {
        return numPortes;
    }
    
    public void setNumPortes(int numPortes) {
        this.numPortes = numPortes;
    }
}
