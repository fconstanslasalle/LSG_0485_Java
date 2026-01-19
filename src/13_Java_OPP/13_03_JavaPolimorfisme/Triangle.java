package Java_OPP.JavaPolimorfisme;

/**
 * Classe Triangle que hereta de FiguraGeometrica.
 * Demostra polimorfisme implementant els mètodes específics per a un triangle.
 */
public class Triangle extends FiguraGeometrica {
    private double base;
    private double altura;
    private double costat1;
    private double costat2;
    private double costat3;
    
    /**
     * Constructor de la classe Triangle
     * @param color El color del triangle
     * @param base La base del triangle
     * @param altura L'altura del triangle
     * @param costat1 El primer costat del triangle
     * @param costat2 El segon costat del triangle
     * @param costat3 El tercer costat del triangle
     */
    public Triangle(String color, double base, double altura, double costat1, double costat2, double costat3) {
        super("Triangle", color);
        this.base = base;
        this.altura = altura;
        this.costat1 = costat1;
        this.costat2 = costat2;
        this.costat3 = costat3;
    }
    
    /**
     * Constructor simplificat per a triangles equilàters
     * @param color El color del triangle
     * @param costat La longitud del costat (tots els costats són iguals)
     */
    public Triangle(String color, double costat) {
        super("Triangle Equilàter", color);
        this.costat1 = costat;
        this.costat2 = costat;
        this.costat3 = costat;
        this.base = costat;
        // Altura d'un triangle equilàter: (√3 / 2) * costat
        this.altura = (Math.sqrt(3) / 2) * costat;
    }
    
    /**
     * Sobreescriptura del mètode calcularArea per al triangle.
     * Fórmula: (base * altura) / 2
     * @return L'àrea del triangle
     */
    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }
    
    /**
     * Sobreescriptura del mètode calcularPerimetre per al triangle.
     * Fórmula: suma dels tres costats
     * @return El perímetre del triangle
     */
    @Override
    public double calcularPerimetre() {
        return costat1 + costat2 + costat3;
    }
    
    /**
     * Mètode per comprovar si el triangle és equilàter
     * @return true si és equilàter, false en cas contrari
     */
    public boolean esEquilater() {
        return (costat1 == costat2) && (costat2 == costat3);
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
