package Java_OPP.JavaHerencia;

/**
 * Classe Gat que hereta de la classe Animal.
 * Demostra herència amb comportament diferent al Gos.
 */
public class Gat extends Animal {
    // Atribut específic de Gat
    private String color;
    
    /**
     * Constructor de la classe Gat
     * @param nom El nom del gat
     * @param edat L'edat del gat
     * @param color El color del pelatge del gat
     */
    public Gat(String nom, int edat, String color) {
        // Cridem el constructor de la classe pare amb super
        super(nom, edat);
        this.color = color;
    }
    
    /**
     * Mètode específic de Gat per miolar
     */
    public void miolar() {
        System.out.println(nom + " està miolant: Miau miau!");
    }
    
    /**
     * Sobreescriptura del mètode menjar de la classe Animal
     * per proporcionar un comportament específic per a gats
     */
    @Override
    public void menjar() {
        System.out.println(nom + " està menjant pinso per a gats i peix.");
    }
    
    /**
     * Sobreescriptura del mètode presentar per incloure informació del color
     */
    @Override
    public void presentar() {
        System.out.println("Hola, sóc " + nom + ", tinc " + edat + " anys i sóc un gat de color " + color + ".");
    }
    
    /**
     * Mètode específic de Gat que demostra un comportament únic
     */
    public void jugarAmbPilota() {
        System.out.println(nom + " està jugant amb una pilota de llana.");
    }
    
    // Getter i Setter per a color
    public String getColor() {
        return color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
}
