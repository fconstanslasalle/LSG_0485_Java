package Java_OPP.JavaAbstraccio;

/**
 * Classe Avio que hereta de Vehicle i implementa la interfície Volador.
 * Demostra com una classe pot heretar d'una classe abstracta i implementar una interfície.
 */
public class Avio extends Vehicle implements Volador {
    private int numPassatgers;
    private double altitudMaxima;
    
    /**
     * Constructor de la classe Avio
     * @param marca La marca de l'avió
     * @param model El model de l'avió
     * @param any L'any de fabricació
     * @param numPassatgers El nombre de passatgers
     * @param altitudMaxima L'altitud màxima en metres
     */
    public Avio(String marca, String model, int any, int numPassatgers, double altitudMaxima) {
        super(marca, model, any);
        this.numPassatgers = numPassatgers;
        this.altitudMaxima = altitudMaxima;
    }
    
    /**
     * Implementació del mètode abstracte accelerar per a l'avió
     */
    @Override
    public void accelerar() {
        System.out.println("L'avió " + marca + " " + model + " està accelerant per la pista.");
    }
    
    /**
     * Implementació del mètode abstracte frenar per a l'avió
     */
    @Override
    public void frenar() {
        System.out.println("L'avió " + marca + " " + model + " està frenant després d'aterrar.");
    }
    
    /**
     * Implementació del mètode volar de la interfície Volador
     */
    @Override
    public void volar() {
        System.out.println("L'avió " + marca + " " + model + " està volant pels cels.");
    }
    
    /**
     * Implementació del mètode aterrar de la interfície Volador
     */
    @Override
    public void aterrar() {
        System.out.println("L'avió " + marca + " " + model + " està aterrant a la pista.");
    }
    
    /**
     * Implementació del mètode obtenirAltitudMaxima de la interfície Volador
     */
    @Override
    public double obtenirAltitudMaxima() {
        return altitudMaxima;
    }
    
    /**
     * Sobreescriptura del mètode mostrarInfo per afegir informació específica
     */
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Nombre de passatgers: " + numPassatgers);
        System.out.println("Altitud màxima: " + altitudMaxima + " metres");
    }
    
    // Getters i Setters
    public int getNumPassatgers() {
        return numPassatgers;
    }
    
    public void setNumPassatgers(int numPassatgers) {
        this.numPassatgers = numPassatgers;
    }
    
    public double getAltitudMaxima() {
        return altitudMaxima;
    }
    
    public void setAltitudMaxima(double altitudMaxima) {
        this.altitudMaxima = altitudMaxima;
    }
}
