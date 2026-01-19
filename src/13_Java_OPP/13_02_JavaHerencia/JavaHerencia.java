package Java_OPP.JavaHerencia;

/**
 * Classe principal que demostra l'ús de l'herència en Java.
 * Mostra com crear objectes de classes que hereten d'una classe base
 * i com utilitzen els mètodes heretats i sobreescrits.
 */
public class JavaHerencia {
    
    public static void main(String[] args) {
        System.out.println("=== EXEMPLE D'HERÈNCIA EN JAVA ===\n");
        
        // Crear un objecte de la classe Animal
        System.out.println("--- Animal genèric ---");
        Animal animal1 = new Animal("Desconegut", 5);
        animal1.presentar();
        animal1.menjar();
        animal1.dormir();
        
        System.out.println();
        
        // Crear un objecte de la classe Gos
        System.out.println("--- Gos ---");
        Gos gos1 = new Gos("Max", 3, "Labrador");
        gos1.presentar();
        gos1.menjar();  // Mètode sobreescrit
        gos1.dormir();  // Mètode heretat
        gos1.bordar();  // Mètode específic de Gos
        
        System.out.println();
        
        // Crear un altre objecte de la classe Gos
        System.out.println("--- Un altre Gos ---");
        Gos gos2 = new Gos("Toby", 5, "Pastor Alemany");
        gos2.presentar();
        gos2.bordar();
        
        System.out.println();
        
        // Crear un objecte de la classe Gat
        System.out.println("--- Gat ---");
        Gat gat1 = new Gat("Misi", 2, "taronja");
        gat1.presentar();
        gat1.menjar();  // Mètode sobreescrit
        gat1.dormir();  // Mètode heretat
        gat1.miolar();  // Mètode específic de Gat
        gat1.jugarAmbPilota();
        
        System.out.println();
        
        // Crear un altre objecte de la classe Gat
        System.out.println("--- Un altre Gat ---");
        Gat gat2 = new Gat("Felix", 4, "negre");
        gat2.presentar();
        gat2.miolar();
        
        System.out.println();
        
        // Demostració de polimorfisme: una referència de tipus Animal
        // pot apuntar a objectes de les subclasses
        System.out.println("--- Polimorfisme ---");
        Animal animalPolimorf1 = new Gos("Llamp", 1, "Golden Retriever");
        Animal animalPolimorf2 = new Gat("Luna", 3, "blanc");
        
        animalPolimorf1.presentar();  // Crida al mètode sobreescrit de Gos
        animalPolimorf1.menjar();     // Crida al mètode sobreescrit de Gos
        
        animalPolimorf2.presentar();  // Crida al mètode sobreescrit de Gat
        animalPolimorf2.menjar();     // Crida al mètode sobreescrit de Gat
        
        System.out.println("\n=== FI DE L'EXEMPLE ===");
    }
}
