/**
 * Exemple 06_02: Cerca i Operacions amb Arrays
 * 
 * Aquest programa demostra operacions avançades amb arrays:
 * - Cerca lineal d'un element
 * - Trobar el valor màxim
 * - Trobar el valor mínim
 * - Calcular la mitjana
 * - Comptar ocurrències d'un valor
 */

package Java_Arrays.Arrays_Cerca_Operacions;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        // Demanem la mida de l'array
        System.out.print("Quants nombres vols introduir? ");
        int mida = lector.nextInt();

        // Creem l'array amb la mida especificada
        int[] nombres = new int[mida];

        // Omplim l'array amb les dades de l'usuari
        System.out.println("Introdueix " + mida + " nombres enters:");
        for (int i = 0; i < mida; i++) {
            System.out.print("Nombre " + (i + 1) + ": ");
            nombres[i] = lector.nextInt();
        }

        // --- Cerca del valor màxim ---
        int maxim = nombres[0];
        int posicioMaxim = 0;
        for (int i = 1; i < mida; i++) {
            if (nombres[i] > maxim) {
                maxim = nombres[i];
                posicioMaxim = i;
            }
        }
        System.out.println("\nValor màxim: " + maxim + " (posició " + posicioMaxim + ")");

        // --- Cerca del valor mínim ---
        int minim = nombres[0];
        int posicioMinim = 0;
        for (int i = 1; i < mida; i++) {
            if (nombres[i] < minim) {
                minim = nombres[i];
                posicioMinim = i;
            }
        }
        System.out.println("Valor mínim: " + minim + " (posició " + posicioMinim + ")");

        // --- Calcular la mitjana ---
        int suma = 0;
        for (int i = 0; i < mida; i++) {
            suma = suma + nombres[i];
        }
        double mitjana = (double) suma / mida;
        System.out.println("Mitjana: " + mitjana);

        // --- Cerca lineal d'un element ---
        System.out.print("\nQuin nombre vols cercar? ");
        int valorCercat = lector.nextInt();

        boolean trobat = false;
        int posicioTrobat = -1;
        for (int i = 0; i < mida; i++) {
            if (nombres[i] == valorCercat) {
                trobat = true;
                posicioTrobat = i;
                break;  // Sortim del bucle quan trobem el valor
            }
        }

        if (trobat) {
            System.out.println("El valor " + valorCercat + " s'ha trobat a la posició " + posicioTrobat);
        } else {
            System.out.println("El valor " + valorCercat + " no s'ha trobat a l'array");
        }

        // --- Comptar quantes vegades apareix un valor ---
        System.out.print("\nQuin nombre vols comptar? ");
        int valorComptar = lector.nextInt();

        int comptador = 0;
        for (int i = 0; i < mida; i++) {
            if (nombres[i] == valorComptar) {
                comptador++;
            }
        }
        System.out.println("El valor " + valorComptar + " apareix " + comptador + " vegades");

        lector.close();
    }
}
