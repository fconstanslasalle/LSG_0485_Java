package Java_Recursivitat.Factorial;

import java.util.Scanner;

/**
 * Exemple de recursivitat: càlcul del factorial d'un nombre.
 * El factorial de n (n!) és el producte de tots els enters positius fins a n.
 * Exemple: 5! = 5 * 4 * 3 * 2 * 1 = 120
 */
public class Factorial {

    /**
     * Mètode principal que demana un nombre i en calcula el factorial.
     * @param args arguments de la línia de comandes (no s'utilitzen)
     */
    public static void main(String[] args) {
        Scanner llegir = new Scanner(System.in);
        int nombre;

        System.out.print("Escriu un nombre enter positiu: ");
        nombre = llegir.nextInt();

        if (nombre < 0) {
            System.out.println("El factorial no està definit per a nombres negatius.");
        } else {
            long resultat = calcularFactorial(nombre);
            System.out.println("El factorial de " + nombre + " és: " + resultat);
        }
    }

    /**
     * Calcula el factorial d'un nombre de forma recursiva.
     * Cas base: el factorial de 0 és 1.
     * Cas recursiu: n! = n * (n-1)!
     * @param n el nombre del qual es calcula el factorial (ha de ser >= 0)
     * @return el factorial de n
     */
    public static long calcularFactorial(int n) {
        // Cas base: el factorial de 0 i de 1 és 1
        if (n <= 1) {
            return 1;
        }
        // Cas recursiu: n! = n * (n-1)!
        return n * calcularFactorial(n - 1);
    }
}
