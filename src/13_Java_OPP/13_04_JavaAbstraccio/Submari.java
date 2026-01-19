package Java_OPP.JavaAbstraccio;

/**
 * Classe Submari que hereta de Vehicle i implementa la interfície Submergible.
 * Demostra com una classe pot implementar una interfície diferent.
 */
public class Submari extends Vehicle implements Submergible {
    private int tripulacio;
    private double profunditatMaxima;
    
    /**
     * Constructor de la classe Submari
     * @param marca La marca del submarí
     * @param model El model del submarí
     * @param any L'any de fabricació
     * @param tripulacio El nombre de tripulants
     * @param profunditatMaxima La profunditat màxima en metres
     */
    public Submari(String marca, String model, int any, int tripulacio, double profunditatMaxima) {
        super(marca, model, any);
        this.tripulacio = tripulacio;
        this.profunditatMaxima = profunditatMaxima;
    }
    
    /**
     * Implementació del mètode abstracte accelerar per al submarí
     */
    @Override
    public void accelerar() {
        System.out.println("El submarí " + marca + " " + model + " està accelerant sota l'aigua.");
    }
    
    /**
     * Implementació del mètode abstracte frenar per al submarí
     */
    @Override
    public void frenar() {
        System.out.println("El submarí " + marca + " " + model + " està frenant.");
    }
    
    /**
     * Implementació del mètode submergir de la interfície Submergible
     */
    @Override
    public void submergir() {
        System.out.println("El submarí " + marca + " " + model + " s'està submergint.");
    }
    
    /**
     * Implementació del mètode emergir de la interfície Submergible
     */
    @Override
    public void emergir() {
        System.out.println("El submarí " + marca + " " + model + " està emergint a la superfície.");
    }
    
    /**
     * Implementació del mètode obtenirProfunditatMaxima de la interfície Submergible
     */
    @Override
    public double obtenirProfunditatMaxima() {
        return profunditatMaxima;
    }
    
    /**
     * Sobreescriptura del mètode mostrarInfo per afegir informació específica
     */
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Tripulació: " + tripulacio + " persones");
        System.out.println("Profunditat màxima: " + profunditatMaxima + " metres");
    }
    
    // Getters i Setters
    public int getTripulacio() {
        return tripulacio;
    }
    
    public void setTripulacio(int tripulacio) {
        this.tripulacio = tripulacio;
    }
    
    public double getProfunditatMaxima() {
        return profunditatMaxima;
    }
    
    public void setProfunditatMaxima(double profunditatMaxima) {
        this.profunditatMaxima = profunditatMaxima;
    }
}
