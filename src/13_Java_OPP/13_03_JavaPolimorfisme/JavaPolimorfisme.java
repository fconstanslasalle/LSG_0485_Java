package Java_OPP.JavaPolimorfisme;

/**
 * Classe principal que demostra l'ús del polimorfisme en Java.
 * Mostra com diferents objectes poden ser tractats de manera uniforme
 * a través d'una referència de tipus superclasse.
 */
public class JavaPolimorfisme {
    
    public static void main(String[] args) {
        System.out.println("=== EXEMPLE DE POLIMORFISME EN JAVA ===\n");
        
        // Crear objectes de diferents tipus de figures
        System.out.println("--- Creació de Figures Individuals ---");
        
        Cercle cercle = new Cercle("vermell", 5.0);
        System.out.println("Cercle creat:");
        cercle.mostrarInfo();
        
        System.out.println();
        
        Rectangle rectangle = new Rectangle("blau", 4.0, 6.0);
        System.out.println("Rectangle creat:");
        rectangle.mostrarInfo();
        if (rectangle.esQuadrat()) {
            System.out.println("És un quadrat!");
        }
        
        System.out.println();
        
        Triangle triangle = new Triangle("verd", 3.0, 4.0, 3.0, 4.0, 5.0);
        System.out.println("Triangle creat:");
        triangle.mostrarInfo();
        
        System.out.println();
        
        // Demostració de polimorfisme: utilitzar un array de FiguraGeometrica
        System.out.println("--- Polimorfisme amb Array ---");
        FiguraGeometrica[] figures = new FiguraGeometrica[5];
        
        // Tots aquests objectes són de diferents tipus però es poden
        // emmagatzemar en un array de tipus FiguraGeometrica
        figures[0] = new Cercle("groc", 3.0);
        figures[1] = new Rectangle("taronja", 5.0, 3.0);
        figures[2] = new Triangle("rosa", 4.0);  // Triangle equilàter
        figures[3] = new Cercle("morat", 7.0);
        figures[4] = new Rectangle("negre", 4.0, 4.0);  // Quadrat
        
        // Calcular l'àrea total de totes les figures
        double areaTotal = 0.0;
        double perimetreTotal = 0.0;
        
        System.out.println("Processant totes les figures:");
        for (int i = 0; i < figures.length; i++) {
            System.out.println("\nFigura " + (i + 1) + ":");
            figures[i].mostrarInfo();
            
            // Gràcies al polimorfisme, cada figura crida la seva pròpia
            // implementació de calcularArea() i calcularPerimetre()
            areaTotal += figures[i].calcularArea();
            perimetreTotal += figures[i].calcularPerimetre();
        }
        
        System.out.println("\n--- Resultats Finals ---");
        System.out.println("Àrea total de totes les figures: " + String.format("%.2f", areaTotal));
        System.out.println("Perímetre total de totes les figures: " + String.format("%.2f", perimetreTotal));
        
        // Demostració de sobrecàrrega de constructors
        System.out.println("\n--- Sobrecàrrega de Constructors ---");
        Triangle triangleEquilater = new Triangle("cyan", 6.0);
        System.out.println("Triangle equilàter creat amb constructor simplificat:");
        triangleEquilater.mostrarInfo();
        System.out.println("És equilàter? " + (triangleEquilater.esEquilater() ? "Sí" : "No"));
        
        System.out.println("\n=== FI DE L'EXEMPLE ===");
    }
}
