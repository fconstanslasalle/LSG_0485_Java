/**
 * Exemple 09_03: Conversió de Temperatures
 * 
 * Aquest programa demostra l'ús de mètodes amb retorn i paràmetres
 * per convertir temperatures entre Celsius i Fahrenheit.
 * 
 * Conceptes treballats:
 * - Mètodes amb paràmetres i retorn de valor
 * - Càlculs matemàtics dins mètodes
 * - Menú d'opcions amb switch
 * - Validació d'entrada
 */

package Java_Metodes.Conversio_Temperatures;

import java.util.Scanner;

public class ConversioTemperatures {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int opcio;
        double temperatura;
        double resultat;

        do {
            mostrarMenu();
            opcio = llegirOpcio(lector);

            if (opcio == 1 || opcio == 2) {
                System.out.print("Introdueix la temperatura: ");
                temperatura = lector.nextDouble();

                if (opcio == 1) {
                    resultat = celsiusAFahrenheit(temperatura);
                    System.out.printf("%.2f°C = %.2f°F%n", temperatura, resultat);
                } else {
                    resultat = fahrenheitACelsius(temperatura);
                    System.out.printf("%.2f°F = %.2f°C%n", temperatura, resultat);
                }
            } else if (opcio == 3) {
                System.out.println("Sortint del programa. Adéu!");
            } else {
                System.out.println("Opció no vàlida!");
            }

            System.out.println(); // Línia en blanc per separar

        } while (opcio != 3);

        lector.close();
    }

    /**
     * Mostra el menú d'opcions disponibles
     */
    public static void mostrarMenu() {
        System.out.println("=== CONVERSOR DE TEMPERATURES ===");
        System.out.println("[1] Celsius a Fahrenheit");
        System.out.println("[2] Fahrenheit a Celsius");
        System.out.println("[3] Sortir");
        System.out.print("Tria una opció: ");
    }

    /**
     * Llegeix una opció vàlida de l'usuari
     * @param lector Scanner per llegir l'entrada
     * @return l'opció seleccionada per l'usuari
     */
    public static int llegirOpcio(Scanner lector) {
        int opcio = 0;
        
        if (lector.hasNextInt()) {
            opcio = lector.nextInt();
        } else {
            lector.nextLine(); // Netegem el buffer
        }
        
        return opcio;
    }

    /**
     * Converteix una temperatura de Celsius a Fahrenheit
     * Fórmula: F = (C × 9/5) + 32
     * @param celsius temperatura en graus Celsius
     * @return temperatura en graus Fahrenheit
     */
    public static double celsiusAFahrenheit(double celsius) {
        return (celsius * 9.0 / 5.0) + 32.0;
    }

    /**
     * Converteix una temperatura de Fahrenheit a Celsius
     * Fórmula: C = (F - 32) × 5/9
     * @param fahrenheit temperatura en graus Fahrenheit
     * @return temperatura en graus Celsius
     */
    public static double fahrenheitACelsius(double fahrenheit) {
        return (fahrenheit - 32.0) * 5.0 / 9.0;
    }
}
