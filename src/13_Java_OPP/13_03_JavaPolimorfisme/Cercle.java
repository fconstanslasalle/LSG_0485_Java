package Java_OPP.JavaPolimorfisme;

/**
 * Classe Cercle que hereta de FiguraGeometrica.
 * Demostra polimorfisme implementant els mètodes específics per a un cercle.
 */
public class Cercle extends FiguraGeometrica {
    private double radi;
    
    /**
     * Constructor de la classe Cercle
     * @param color El color del cercle
     * @param radi El radi del cercle
     */
    public Cercle(String color, double radi) {
        super("Cercle", color);
        this.radi = radi;
    }
    
    /**
     * Sobreescriptura del mètode calcularArea per al cercle.
     * Fórmula: π * r²
     * @return L'àrea del cercle
     */
    @Override
    public double calcularArea() {
        return Math.PI * radi * radi;
    }
    
    /**
     * Sobreescriptura del mètode calcularPerimetre per al cercle.
     * Fórmula: 2 * π * r
     * @return El perímetre (circumferència) del cercle
     */
    @Override
    public double calcularPerimetre() {
        return 2 * Math.PI * radi;
    }
    
    /**
     * Mètode per calcular el diàmetre del cercle
     * @return El diàmetre del cercle
     */
    public double calcularDiametre() {
        return 2 * radi;
    }
    
    // Getter i Setter
    public double getRadi() {
        return radi;
    }
    
    public void setRadi(double radi) {
        this.radi = radi;
    }
}
