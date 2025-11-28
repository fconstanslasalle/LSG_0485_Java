/**
 * Exemple 06_01: Operacions Bàsiques amb Arrays
 * 
 * Aquest programa demostra les operacions fonamentals amb arrays en Java:
 * - Declaració i inicialització d'arrays
 * - Recorregut amb bucle for clàssic
 * - Modificació d'elements
 * - Mostrar contingut de l'array
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        // Declaració i inicialització d'un array de 5 enters
        int[] nombres = new int[5];

        // Demanem a l'usuari que introdueixi els valors
        System.out.println("Introdueix 5 nombres enters:");
        for (int i = 0; i < nombres.length; i++) {
            System.out.print("Nombre " + (i + 1) + ": ");
            nombres[i] = lector.nextInt();
        }

        // Mostrem l'array original
        System.out.println("\n--- Array Original ---");
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Posició " + i + ": " + nombres[i]);
        }

        // Calculem la suma de tots els elements
        int suma = 0;
        for (int i = 0; i < nombres.length; i++) {
            suma = suma + nombres[i];
        }
        System.out.println("\nLa suma de tots els elements és: " + suma);

        // Multipliquem cada element per 2
        System.out.println("\n--- Array multiplicat per 2 ---");
        for (int i = 0; i < nombres.length; i++) {
            nombres[i] = nombres[i] * 2;
            System.out.println("Posició " + i + ": " + nombres[i]);
        }

        // Array inicialitzat amb valors
        String[] diesSetmana = {"Dilluns", "Dimarts", "Dimecres", "Dijous", "Divendres", "Dissabte", "Diumenge"};
        
        System.out.println("\n--- Dies de la Setmana ---");
        for (int i = 0; i < diesSetmana.length; i++) {
            System.out.println("Dia " + (i + 1) + ": " + diesSetmana[i]);
        }

        lector.close();
    }
}
