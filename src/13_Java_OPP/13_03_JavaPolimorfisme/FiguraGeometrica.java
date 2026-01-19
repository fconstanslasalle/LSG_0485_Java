package Java_OPP.JavaPolimorfisme;

/**
 * Classe base FiguraGeometrica que representa una figura geomètrica genèrica.
 * Aquesta classe demostra polimorfisme amb mètodes que seran sobreescrits per les subclasses.
 */
public class FiguraGeometrica {
    protected String nom;
    protected String color;
    
    /**
     * Constructor de la classe FiguraGeometrica
     * @param nom El nom de la figura
     * @param color El color de la figura
     */
    public FiguraGeometrica(String nom, String color) {
        this.nom = nom;
        this.color = color;
    }
    
    /**
     * Mètode per calcular l'àrea de la figura.
     * Aquest mètode serà sobreescrit per cada subclasse.
     * @return L'àrea de la figura
     */
    public double calcularArea() {
        return 0.0;
    }
    
    /**
     * Mètode per calcular el perímetre de la figura.
     * Aquest mètode serà sobreescrit per cada subclasse.
     * @return El perímetre de la figura
     */
    public double calcularPerimetre() {
        return 0.0;
    }
    
    /**
     * Mètode per mostrar informació de la figura
     */
    public void mostrarInfo() {
        System.out.println("Figura: " + nom);
        System.out.println("Color: " + color);
        System.out.println("Àrea: " + String.format("%.2f", calcularArea()));
        System.out.println("Perímetre: " + String.format("%.2f", calcularPerimetre()));
    }
    
    // Getters i Setters
    public String getNom() {
        return nom;
    }
    
    public void setNom(String nom) {
        this.nom = nom;
    }
    
    public String getColor() {
        return color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
}
