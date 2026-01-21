/**
 * Exemple 08_03: Operacions Bàsiques amb ArrayList
 * 
 * Aquest programa demostra les operacions fonamentals amb ArrayList:
 * - Declaració i inicialització d'ArrayList
 * - add: afegir elements
 * - get: obtenir un element per posició
 * - set: modificar un element
 * - remove: eliminar elements
 * - size: obtenir la mida de l'ArrayList
 * - Recorregut amb bucle for clàssic i for-each
 */

package Java_Strings_Arraylist.ArrayList_Operacions_Basiques;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        // Declaració i inicialització d'un ArrayList d'Strings
        ArrayList<String> noms = new ArrayList<String>();

        // --- Afegir elements amb add ---
        System.out.println("--- Afegir elements a l'ArrayList ---");
        System.out.print("Quants noms vols introduir? ");
        int quantitat = lector.nextInt();
        lector.nextLine();  // Netejem el buffer

        for (int i = 0; i < quantitat; i++) {
            System.out.print("Nom " + (i + 1) + ": ");
            String nom = lector.nextLine();
            noms.add(nom);  // Afegim el nom a l'ArrayList
        }

        // Mostrem la mida de l'ArrayList
        System.out.println("\nL'ArrayList té " + noms.size() + " elements");

        // --- Recorregut amb bucle for clàssic ---
        System.out.println("\n--- Recorregut amb for clàssic ---");
        for (int i = 0; i < noms.size(); i++) {
            System.out.println("Posició " + i + ": " + noms.get(i));
        }

        // --- Recorregut amb for-each ---
        System.out.println("\n--- Recorregut amb for-each ---");
        for (String nom : noms) {
            System.out.println("Nom: " + nom);
        }

        // --- Modificar un element amb set ---
        if (noms.size() > 0) {
            System.out.println("\n--- Modificar un element ---");
            System.out.print("Quina posició vols modificar? (0-" + (noms.size() - 1) + "): ");
            int posicio = lector.nextInt();
            lector.nextLine();
            
            if (posicio >= 0 && posicio < noms.size()) {
                System.out.println("Valor actual: " + noms.get(posicio));
                System.out.print("Nou valor: ");
                String nouValor = lector.nextLine();
                noms.set(posicio, nouValor);
                System.out.println("Element modificat correctament!");
            } else {
                System.out.println("Posició no vàlida!");
            }
        }

        // Mostrem l'ArrayList després de la modificació
        System.out.println("\n--- ArrayList després de la modificació ---");
        for (int i = 0; i < noms.size(); i++) {
            System.out.println("Posició " + i + ": " + noms.get(i));
        }

        // --- Afegir un element en una posició específica ---
        System.out.println("\n--- Afegir element en posició específica ---");
        System.out.print("En quina posició vols afegir un nou nom? (0-" + noms.size() + "): ");
        int posicioNova = lector.nextInt();
        lector.nextLine();
        
        if (posicioNova >= 0 && posicioNova <= noms.size()) {
            System.out.print("Nom a afegir: ");
            String nomNou = lector.nextLine();
            noms.add(posicioNova, nomNou);  // add(posició, element)
            System.out.println("Element afegit correctament!");
        }

        // --- Eliminar un element ---
        if (noms.size() > 0) {
            System.out.println("\n--- Eliminar un element ---");
            System.out.print("Quina posició vols eliminar? (0-" + (noms.size() - 1) + "): ");
            int posicioEliminar = lector.nextInt();
            lector.nextLine();
            
            if (posicioEliminar >= 0 && posicioEliminar < noms.size()) {
                String elementEliminat = noms.remove(posicioEliminar);
                System.out.println("S'ha eliminat: " + elementEliminat);
            }
        }

        // Mostrem l'ArrayList final
        System.out.println("\n--- ArrayList Final ---");
        System.out.println("Mida: " + noms.size() + " elements");
        for (int i = 0; i < noms.size(); i++) {
            System.out.println("Posició " + i + ": " + noms.get(i));
        }

        // --- Comprovar si l'ArrayList està buit ---
        System.out.println("\n--- Altres operacions ---");
        System.out.println("L'ArrayList està buit? " + noms.isEmpty());

        // --- Netejar l'ArrayList ---
        System.out.print("Vols netejar tot l'ArrayList? (s/n): ");
        String resposta = lector.nextLine();
        if (resposta.equalsIgnoreCase("s")) {
            noms.clear();
            System.out.println("ArrayList netejat. Mida actual: " + noms.size());
        }

        lector.close();
    }
}
