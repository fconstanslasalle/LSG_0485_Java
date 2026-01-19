package Java_OPP.JavaAbstraccio;

/**
 * Interfície Volador que defineix el comportament dels objectes que poden volar.
 * Les interfícies defineixen un contracte que les classes han d'implementar.
 */
public interface Volador {
    
    /**
     * Mètode per fer volar l'objecte
     */
    void volar();
    
    /**
     * Mètode per fer aterrar l'objecte
     */
    void aterrar();
    
    /**
     * Mètode per obtenir l'altitud màxima
     * @return L'altitud màxima en metres
     */
    double obtenirAltitudMaxima();
}
