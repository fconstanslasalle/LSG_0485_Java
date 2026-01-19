package Java_OPP.JavaHerencia;

/**
 * Classe Gos que hereta de la classe Animal.
 * Demostra herència i sobreescriptura de mètodes.
 */
public class Gos extends Animal {
    // Atribut específic de Gos
    private String raca;
    
    /**
     * Constructor de la classe Gos
     * @param nom El nom del gos
     * @param edat L'edat del gos
     * @param raca La raça del gos
     */
    public Gos(String nom, int edat, String raca) {
        // Cridem el constructor de la classe pare amb super
        super(nom, edat);
        this.raca = raca;
    }
    
    /**
     * Mètode específic de Gos per bordar
     */
    public void bordar() {
        System.out.println(nom + " està bordant: Bup bup!");
    }
    
    /**
     * Sobreescriptura del mètode menjar de la classe Animal
     * per proporcionar un comportament específic per a gossos
     */
    @Override
    public void menjar() {
        System.out.println(nom + " està menjant pinso per a gossos.");
    }
    
    /**
     * Sobreescriptura del mètode presentar per incloure informació de la raça
     */
    @Override
    public void presentar() {
        System.out.println("Hola, sóc " + nom + ", tinc " + edat + " anys i sóc un gos de raça " + raca + ".");
    }
    
    // Getter i Setter per a raca
    public String getRaca() {
        return raca;
    }
    
    public void setRaca(String raca) {
        this.raca = raca;
    }
}
