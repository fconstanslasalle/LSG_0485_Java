package Java_OPP.JavaPolimorfisme;

/**
 * Classe Rectangle que hereta de FiguraGeometrica.
 * Demostra polimorfisme implementant els mètodes específics per a un rectangle.
 */
public class Rectangle extends FiguraGeometrica {
    private double base;
    private double altura;
    
    /**
     * Constructor de la classe Rectangle
     * @param color El color del rectangle
     * @param base La base del rectangle
     * @param altura L'altura del rectangle
     */
    public Rectangle(String color, double base, double altura) {
        super("Rectangle", color);
        this.base = base;
        this.altura = altura;
    }
    
    /**
     * Sobreescriptura del mètode calcularArea per al rectangle.
     * Fórmula: base * altura
     * @return L'àrea del rectangle
     */
    @Override
    public double calcularArea() {
        return base * altura;
    }
    
    /**
     * Sobreescriptura del mètode calcularPerimetre per al rectangle.
     * Fórmula: 2 * (base + altura)
     * @return El perímetre del rectangle
     */
    @Override
    public double calcularPerimetre() {
        return 2 * (base + altura);
    }
    
    /**
     * Mètode per comprovar si el rectangle és un quadrat
     * @return true si és un quadrat, false en cas contrari
     */
    public boolean esQuadrat() {
        return base == altura;
    }
    
    // Getters i Setters
    public double getBase() {
        return base;
    }
    
    public void setBase(double base) {
        this.base = base;
    }
    
    public double getAltura() {
        return altura;
    }
    
    public void setAltura(double altura) {
        this.altura = altura;
    }
}
