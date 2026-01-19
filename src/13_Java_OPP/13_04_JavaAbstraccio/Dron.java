package Java_OPP.JavaAbstraccio;

/**
 * Classe Dron que implementa la interfície Volador.
 * Demostra com una classe pot implementar una interfície sense heretar de Vehicle.
 */
public class Dron implements Volador {
    private String model;
    private int numHelices;
    private double altitudMaxima;
    
    /**
     * Constructor de la classe Dron
     * @param model El model del dron
     * @param numHelices El nombre d'hèlices
     * @param altitudMaxima L'altitud màxima en metres
     */
    public Dron(String model, int numHelices, double altitudMaxima) {
        this.model = model;
        this.numHelices = numHelices;
        this.altitudMaxima = altitudMaxima;
    }
    
    /**
     * Implementació del mètode volar de la interfície Volador
     */
    @Override
    public void volar() {
        System.out.println("El dron " + model + " amb " + numHelices + " hèlices està volant.");
    }
    
    /**
     * Implementació del mètode aterrar de la interfície Volador
     */
    @Override
    public void aterrar() {
        System.out.println("El dron " + model + " està aterrant suaument.");
    }
    
    /**
     * Implementació del mètode obtenirAltitudMaxima de la interfície Volador
     */
    @Override
    public double obtenirAltitudMaxima() {
        return altitudMaxima;
    }
    
    /**
     * Mètode específic del dron per fer fotos
     */
    public void ferFoto() {
        System.out.println("El dron " + model + " està fent una foto aèria.");
    }
    
    /**
     * Mètode per mostrar informació del dron
     */
    public void mostrarInfo() {
        System.out.println("Model: " + model);
        System.out.println("Nombre d'hèlices: " + numHelices);
        System.out.println("Altitud màxima: " + altitudMaxima + " metres");
    }
    
    // Getters i Setters
    public String getModel() {
        return model;
    }
    
    public void setModel(String model) {
        this.model = model;
    }
    
    public int getNumHelices() {
        return numHelices;
    }
    
    public void setNumHelices(int numHelices) {
        this.numHelices = numHelices;
    }
    
    public void setAltitudMaxima(double altitudMaxima) {
        this.altitudMaxima = altitudMaxima;
    }
}
