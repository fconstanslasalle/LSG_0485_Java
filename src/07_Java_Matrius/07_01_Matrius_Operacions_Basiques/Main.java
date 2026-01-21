/**
 * Exemple 07_01: Operacions Bàsiques amb Matrius
 * 
 * Aquest programa demostra les operacions fonamentals amb matrius en Java:
 * - Declaració i inicialització de matrius
 * - Recorregut amb bucles for aniats
 * - Modificació d'elements
 * - Mostrar contingut de la matriu
 */

package Java_Matrius.Matrius_Operacions_Basiques;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        // Demanem les dimensions de la matriu
        System.out.print("Introdueix el nombre de files: ");
        int files = lector.nextInt();
        System.out.print("Introdueix el nombre de columnes: ");
        int columnes = lector.nextInt();

        // Declaració i inicialització d'una matriu amb les dimensions especificades
        int[][] matriu = new int[files][columnes];

        // Demanem a l'usuari que introdueixi els valors
        System.out.println("\nIntrodueix els valors de la matriu:");
        for (int i = 0; i < files; i++) {
            for (int j = 0; j < columnes; j++) {
                System.out.print("Valor [" + i + "][" + j + "]: ");
                matriu[i][j] = lector.nextInt();
            }
        }

        // Mostrem la matriu original
        System.out.println("\n--- Matriu Original ---");
        for (int i = 0; i < files; i++) {
            for (int j = 0; j < columnes; j++) {
                System.out.print(matriu[i][j] + "\t");
            }
            System.out.println();  // Salt de línia al final de cada fila
        }

        // Calculem la suma de tots els elements
        int suma = 0;
        for (int i = 0; i < files; i++) {
            for (int j = 0; j < columnes; j++) {
                suma = suma + matriu[i][j];
            }
        }
        System.out.println("\nLa suma de tots els elements és: " + suma);

        // Multipliquem cada element per 2
        System.out.println("\n--- Matriu multiplicada per 2 ---");
        for (int i = 0; i < files; i++) {
            for (int j = 0; j < columnes; j++) {
                matriu[i][j] = matriu[i][j] * 2;
                System.out.print(matriu[i][j] + "\t");
            }
            System.out.println();
        }

        // Exemple de matriu inicialitzada amb valors
        int[][] notesAlumnes = {
            {8, 7, 9, 6},
            {5, 8, 7, 9},
            {9, 9, 10, 8}
        };

        System.out.println("\n--- Notes dels Alumnes (3 alumnes, 4 assignatures) ---");
        for (int i = 0; i < notesAlumnes.length; i++) {
            System.out.print("Alumne " + (i + 1) + ": ");
            for (int j = 0; j < notesAlumnes[i].length; j++) {
                System.out.print(notesAlumnes[i][j] + "\t");
            }
            System.out.println();
        }

        lector.close();
    }
}
