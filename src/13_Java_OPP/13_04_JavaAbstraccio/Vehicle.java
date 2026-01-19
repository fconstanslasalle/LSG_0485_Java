package Java_OPP.JavaAbstraccio;

/**
 * Classe abstracta Vehicle que representa un vehicle genèric.
 * Les classes abstractes no es poden instanciar directament.
 * Defineix el comportament comú i obliga les subclasses a implementar mètodes específics.
 */
public abstract class Vehicle {
    protected String marca;
    protected String model;
    protected int any;
    
    /**
     * Constructor de la classe abstracta Vehicle
     * @param marca La marca del vehicle
     * @param model El model del vehicle
     * @param any L'any de fabricació del vehicle
     */
    public Vehicle(String marca, String model, int any) {
        this.marca = marca;
        this.model = model;
        this.any = any;
    }
    
    /**
     * Mètode abstracte que ha de ser implementat per les subclasses.
     * Cada tipus de vehicle accelera de manera diferent.
     */
    public abstract void accelerar();
    
    /**
     * Mètode abstracte que ha de ser implementat per les subclasses.
     * Cada tipus de vehicle frena de manera diferent.
     */
    public abstract void frenar();
    
    /**
     * Mètode concret que pot ser utilitzat per totes les subclasses.
     * Mostra informació bàsica del vehicle.
     */
    public void mostrarInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Model: " + model);
        System.out.println("Any: " + any);
    }
    
    /**
     * Mètode concret per arrencar el vehicle
     */
    public void arrencar() {
        System.out.println("El vehicle " + marca + " " + model + " està arrencant...");
    }
    
    // Getters i Setters
    public String getMarca() {
        return marca;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public String getModel() {
        return model;
    }
    
    public void setModel(String model) {
        this.model = model;
    }
    
    public int getAny() {
        return any;
    }
    
    public void setAny(int any) {
        this.any = any;
    }
}
