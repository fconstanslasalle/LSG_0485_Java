package Java_OPP.JavaAbstraccio;

/**
 * Interfície Submergible que defineix el comportament dels objectes que poden submergir-se.
 */
public interface Submergible {
    
    /**
     * Mètode per submergir l'objecte
     */
    void submergir();
    
    /**
     * Mètode per emergir a la superfície
     */
    void emergir();
    
    /**
     * Mètode per obtenir la profunditat màxima
     * @return La profunditat màxima en metres
     */
    double obtenirProfunditatMaxima();
}
