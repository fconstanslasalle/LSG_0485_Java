/**
 * Exemple 07_02: Operacions Avançades amb Matrius
 * 
 * Aquest programa demostra operacions avançades amb matrius:
 * - Suma d'elements de cada fila
 * - Suma d'elements de cada columna
 * - Diagonal principal (en matrius quadrades)
 * - Transposició d'una matriu
 */

package Java_Matrius.Matrius_Operacions_Avancades;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        // Demanem la mida de la matriu quadrada
        System.out.print("Introdueix la mida de la matriu quadrada (n x n): ");
        int n = lector.nextInt();

        // Creem la matriu quadrada
        int[][] matriu = new int[n][n];

        // Omplim la matriu amb les dades de l'usuari
        System.out.println("\nIntrodueix els valors de la matriu:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Valor [" + i + "][" + j + "]: ");
                matriu[i][j] = lector.nextInt();
            }
        }

        // Mostrem la matriu original
        System.out.println("\n--- Matriu Original ---");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriu[i][j] + "\t");
            }
            System.out.println();
        }

        // --- Suma de cada fila ---
        System.out.println("\n--- Suma de cada fila ---");
        for (int i = 0; i < n; i++) {
            int sumaFila = 0;
            for (int j = 0; j < n; j++) {
                sumaFila = sumaFila + matriu[i][j];
            }
            System.out.println("Suma fila " + i + ": " + sumaFila);
        }

        // --- Suma de cada columna ---
        System.out.println("\n--- Suma de cada columna ---");
        for (int j = 0; j < n; j++) {
            int sumaColumna = 0;
            for (int i = 0; i < n; i++) {
                sumaColumna = sumaColumna + matriu[i][j];
            }
            System.out.println("Suma columna " + j + ": " + sumaColumna);
        }

        // --- Diagonal principal ---
        System.out.println("\n--- Diagonal Principal ---");
        System.out.print("Elements: ");
        int sumaDiagonal = 0;
        for (int i = 0; i < n; i++) {
            System.out.print(matriu[i][i] + " ");
            sumaDiagonal = sumaDiagonal + matriu[i][i];
        }
        System.out.println("\nSuma de la diagonal principal: " + sumaDiagonal);

        // --- Diagonal secundària ---
        System.out.println("\n--- Diagonal Secundària ---");
        System.out.print("Elements: ");
        int sumaDiagonalSec = 0;
        for (int i = 0; i < n; i++) {
            System.out.print(matriu[i][n - 1 - i] + " ");
            sumaDiagonalSec = sumaDiagonalSec + matriu[i][n - 1 - i];
        }
        System.out.println("\nSuma de la diagonal secundària: " + sumaDiagonalSec);

        // --- Transposició de la matriu ---
        int[][] matriuTransposada = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriuTransposada[j][i] = matriu[i][j];
            }
        }

        System.out.println("\n--- Matriu Transposada ---");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriuTransposada[i][j] + "\t");
            }
            System.out.println();
        }

        lector.close();
    }
}
