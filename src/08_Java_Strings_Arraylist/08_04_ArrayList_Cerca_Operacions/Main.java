/**
 * Exemple 08_04: Cerca i Operacions amb ArrayList
 * 
 * Aquest programa demostra operacions avançades amb ArrayList:
 * - contains: comprovar si un element existeix
 * - indexOf: trobar la posició d'un element
 * - lastIndexOf: trobar l'última posició d'un element
 * - Cerca del valor màxim i mínim en ArrayList de nombres
 * - Calcular la mitjana
 * - Ordenar i invertir l'ArrayList
 */

package Java_Strings_Arraylist.ArrayList_Cerca_Operacions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        // Creem un ArrayList d'enters
        ArrayList<Integer> nombres = new ArrayList<Integer>();

        // Demanem els nombres a l'usuari
        System.out.print("Quants nombres vols introduir? ");
        int quantitat = lector.nextInt();

        System.out.println("Introdueix " + quantitat + " nombres enters:");
        for (int i = 0; i < quantitat; i++) {
            System.out.print("Nombre " + (i + 1) + ": ");
            int nombre = lector.nextInt();
            nombres.add(nombre);
        }

        // Mostrem l'ArrayList original
        System.out.println("\n--- ArrayList Original ---");
        System.out.println("Contingut: " + nombres);

        // --- Cerca amb contains ---
        System.out.println("\n--- Cerca amb contains ---");
        System.out.print("Quin nombre vols cercar? ");
        int valorCercar = lector.nextInt();
        
        if (nombres.contains(valorCercar)) {
            System.out.println("El valor " + valorCercar + " SÍ existeix a l'ArrayList");
        } else {
            System.out.println("El valor " + valorCercar + " NO existeix a l'ArrayList");
        }

        // --- Cerca amb indexOf ---
        System.out.println("\n--- Cerca amb indexOf ---");
        int posicio = nombres.indexOf(valorCercar);
        if (posicio != -1) {
            System.out.println("Primera aparició de " + valorCercar + " a la posició: " + posicio);
        } else {
            System.out.println("El valor " + valorCercar + " no s'ha trobat");
        }

        // --- Cerca amb lastIndexOf ---
        int ultimaPosicio = nombres.lastIndexOf(valorCercar);
        if (ultimaPosicio != -1 && ultimaPosicio != posicio) {
            System.out.println("Última aparició de " + valorCercar + " a la posició: " + ultimaPosicio);
        }

        // --- Trobar el valor màxim ---
        System.out.println("\n--- Valor Màxim i Mínim ---");
        if (nombres.size() > 0) {
            int maxim = nombres.get(0);
            int minim = nombres.get(0);
            
            for (int i = 1; i < nombres.size(); i++) {
                if (nombres.get(i) > maxim) {
                    maxim = nombres.get(i);
                }
                if (nombres.get(i) < minim) {
                    minim = nombres.get(i);
                }
            }
            System.out.println("Valor màxim: " + maxim);
            System.out.println("Valor mínim: " + minim);
            
            // També podem usar Collections.max() i Collections.min()
            System.out.println("Màxim amb Collections.max(): " + Collections.max(nombres));
            System.out.println("Mínim amb Collections.min(): " + Collections.min(nombres));
        }

        // --- Calcular la suma i la mitjana ---
        System.out.println("\n--- Suma i Mitjana ---");
        int suma = 0;
        for (int i = 0; i < nombres.size(); i++) {
            suma = suma + nombres.get(i);
        }
        System.out.println("Suma total: " + suma);
        
        double mitjana = (double) suma / nombres.size();
        System.out.println("Mitjana: " + mitjana);

        // --- Comptar ocurrències d'un valor ---
        System.out.println("\n--- Comptar Ocurrències ---");
        System.out.print("Quin nombre vols comptar? ");
        int valorComptar = lector.nextInt();
        
        int comptador = 0;
        for (int i = 0; i < nombres.size(); i++) {
            if (nombres.get(i) == valorComptar) {
                comptador++;
            }
        }
        System.out.println("El valor " + valorComptar + " apareix " + comptador + " vegades");
        
        // També podem usar Collections.frequency()
        int frequencia = Collections.frequency(nombres, valorComptar);
        System.out.println("Freqüència amb Collections.frequency(): " + frequencia);

        // --- Ordenar l'ArrayList ---
        System.out.println("\n--- Ordenar l'ArrayList ---");
        System.out.println("ArrayList abans d'ordenar: " + nombres);
        
        Collections.sort(nombres);  // Ordena de menor a major
        System.out.println("ArrayList ordenat (ascendent): " + nombres);
        
        Collections.reverse(nombres);  // Inverteix l'ordre
        System.out.println("ArrayList ordenat (descendent): " + nombres);

        // --- Invertir l'ArrayList ---
        Collections.reverse(nombres);  // Tornem a l'ordre ascendent
        System.out.println("\n--- Crear una còpia de l'ArrayList ---");
        ArrayList<Integer> copia = new ArrayList<Integer>(nombres);
        System.out.println("ArrayList original: " + nombres);
        System.out.println("Còpia de l'ArrayList: " + copia);

        // --- Eliminar duplicats ---
        System.out.println("\n--- Eliminar Duplicats (manual) ---");
        ArrayList<Integer> senseDuplicats = new ArrayList<Integer>();
        for (int i = 0; i < nombres.size(); i++) {
            if (!senseDuplicats.contains(nombres.get(i))) {
                senseDuplicats.add(nombres.get(i));
            }
        }
        System.out.println("ArrayList sense duplicats: " + senseDuplicats);

        lector.close();
    }
}
