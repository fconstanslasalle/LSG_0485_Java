/**
 * Exemple 09_05: Generador de Taules de Multiplicar
 * 
 * Aquest programa genera i mostra taules de multiplicar utilitzant mètodes.
 * Permet generar una taula individual o un rang de taules.
 * 
 * Conceptes treballats:
 * - Mètodes sense retorn (void) amb paràmetres
 * - Mètodes per formatar sortida
 * - Bucles dins de mètodes
 * - Organització del codi en funcions
 */

import java.util.Scanner;

public class TaulesMultiplicar {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int opcio;

        do {
            mostrarMenu();
            opcio = llegirEnter(lector);

            switch (opcio) {
                case 1:
                    generarTaulaIndividual(lector);
                    break;
                case 2:
                    generarRangTaules(lector);
                    break;
                case 3:
                    System.out.println("Sortint del programa. Adéu!");
                    break;
                default:
                    System.out.println("Opció no vàlida!");
                    break;
            }

            if (opcio != 3) {
                System.out.println("\nPrem Enter per continuar...");
                lector.nextLine();
            }

        } while (opcio != 3);

        lector.close();
    }

    /**
     * Mostra el menú principal del programa
     */
    public static void mostrarMenu() {
        System.out.println("\n" + "=".repeat(40));
        System.out.println("  GENERADOR DE TAULES DE MULTIPLICAR");
        System.out.println("=".repeat(40));
        System.out.println("[1] Generar una taula individual");
        System.out.println("[2] Generar un rang de taules");
        System.out.println("[3] Sortir");
        System.out.print("\nTria una opció: ");
    }

    /**
     * Llegeix un número enter de l'usuari amb validació
     * @param lector Scanner per llegir l'entrada
     * @return el número enter introduït
     */
    public static int llegirEnter(Scanner lector) {
        while (!lector.hasNextInt()) {
            System.out.print("Si us plau, introdueix un número enter: ");
            lector.nextLine();
        }
        int numero = lector.nextInt();
        lector.nextLine(); // Netegem el buffer
        return numero;
    }

    /**
     * Genera i mostra una taula de multiplicar individual
     * @param lector Scanner per llegir l'entrada de l'usuari
     */
    public static void generarTaulaIndividual(Scanner lector) {
        System.out.print("\nIntrodueix el número de la taula (1-10): ");
        int numero = llegirEnter(lector);

        if (numero < 1 || numero > 10) {
            System.out.println("El número ha d'estar entre 1 i 10!");
            return;
        }

        mostrarTaula(numero);
    }

    /**
     * Genera i mostra un rang de taules de multiplicar
     * @param lector Scanner per llegir l'entrada de l'usuari
     */
    public static void generarRangTaules(Scanner lector) {
        System.out.print("\nIntrodueix el número inicial (1-10): ");
        int inicial = llegirEnter(lector);

        System.out.print("Introdueix el número final (1-10): ");
        int finall = llegirEnter(lector);

        if (inicial < 1 || inicial > 10 || finall < 1 || finall > 10) {
            System.out.println("Els números han d'estar entre 1 i 10!");
            return;
        }

        if (inicial > finall) {
            System.out.println("El número inicial ha de ser menor o igual que el final!");
            return;
        }

        for (int i = inicial; i <= finall; i++) {
            mostrarTaula(i);
            if (i < finall) {
                System.out.println(); // Espai entre taules
            }
        }
    }

    /**
     * Mostra una taula de multiplicar completa (del 1 al 10)
     * @param numero el número de la taula a mostrar
     */
    public static void mostrarTaula(int numero) {
        mostrarCapçaleraTaula(numero);
        
        for (int i = 1; i <= 10; i++) {
            int resultat = numero * i;
            mostrarLiniaMultiplicacio(numero, i, resultat);
        }
        
        mostrarPeuTaula();
    }

    /**
     * Mostra la capçalera d'una taula de multiplicar
     * @param numero el número de la taula
     */
    public static void mostrarCapçaleraTaula(int numero) {
        System.out.println("\n" + "-".repeat(30));
        System.out.println("  TAULA DEL " + numero);
        System.out.println("-".repeat(30));
    }

    /**
     * Mostra una línia de multiplicació formatada
     * @param numero1 primer número
     * @param numero2 segon número
     * @param resultat el resultat de la multiplicació
     */
    public static void mostrarLiniaMultiplicacio(int numero1, int numero2, int resultat) {
        System.out.printf("%2d × %2d = %3d%n", numero1, numero2, resultat);
    }

    /**
     * Mostra el peu d'una taula de multiplicar
     */
    public static void mostrarPeuTaula() {
        System.out.println("-".repeat(30));
    }
}
