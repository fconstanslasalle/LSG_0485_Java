package Java_Recursivitat.Fibonacci;

import java.util.Scanner;

/**
 * Exemple de recursivitat: càlcul de la seqüència de Fibonacci.
 * La seqüència de Fibonacci és: 0, 1, 1, 2, 3, 5, 8, 13, 21, ...
 * Cada nombre és la suma dels dos anteriors.
 */
public class Fibonacci {

    /**
     * Mètode principal que demana una posició i en calcula el valor de Fibonacci.
     * @param args arguments de la línia de comandes (no s'utilitzen)
     */
    public static void main(String[] args) {
        Scanner llegir = new Scanner(System.in);
        int posicio;

        System.out.print("Escriu la posició de la seqüència de Fibonacci (0 o més): ");
        posicio = llegir.nextInt();

        if (posicio < 0) {
            System.out.println("La posició ha de ser un nombre positiu o zero.");
        } else {
            long resultat = calcularFibonacci(posicio);
            System.out.println("El valor de Fibonacci a la posició " + posicio + " és: " + resultat);

            // Mostrar la seqüència fins a la posició indicada
            System.out.print("Seqüència fins a la posició " + posicio + ": ");
            for (int i = 0; i <= posicio; i++) {
                System.out.print(calcularFibonacci(i));
                if (i < posicio) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
    }

    /**
     * Calcula el valor de Fibonacci a la posició indicada de forma recursiva.
     * Cas base: Fibonacci(0) = 0, Fibonacci(1) = 1.
     * Cas recursiu: Fibonacci(n) = Fibonacci(n-1) + Fibonacci(n-2).
     * @param n la posició dins la seqüència (ha de ser >= 0)
     * @return el valor de Fibonacci a la posició n
     */
    public static long calcularFibonacci(int n) {
        // Cas base: les dues primeres posicions de la seqüència
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        // Cas recursiu: Fibonacci(n) = Fibonacci(n-1) + Fibonacci(n-2)
        return calcularFibonacci(n - 1) + calcularFibonacci(n - 2);
    }
}
