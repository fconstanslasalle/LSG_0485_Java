package Java_OPP.JavaHerencia;

/**
 * Classe base Animal que representa un animal genèric.
 * Aquesta classe servirà com a superclasse per a altres animals específics.
 */
public class Animal {
    // Atributs protected per permetre accés des de subclasses
    protected String nom;
    protected int edat;
    
    /**
     * Constructor de la classe Animal
     * @param nom El nom de l'animal
     * @param edat L'edat de l'animal
     */
    public Animal(String nom, int edat) {
        this.nom = nom;
        this.edat = edat;
    }
    
    /**
     * Mètode que simula que l'animal menja
     */
    public void menjar() {
        System.out.println(nom + " està menjant.");
    }
    
    /**
     * Mètode que simula que l'animal dorm
     */
    public void dormir() {
        System.out.println(nom + " està dormint. Zzz...");
    }
    
    /**
     * Mètode que fa que l'animal es presenti
     */
    public void presentar() {
        System.out.println("Hola, sóc " + nom + " i tinc " + edat + " anys.");
    }
    
    // Getters i Setters
    public String getNom() {
        return nom;
    }
    
    public void setNom(String nom) {
        this.nom = nom;
    }
    
    public int getEdat() {
        return edat;
    }
    
    public void setEdat(int edat) {
        this.edat = edat;
    }
}
