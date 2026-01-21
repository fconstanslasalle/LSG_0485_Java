/**
 * Exemple 09_04: Validador de DNI Espanyol
 * 
 * Aquest programa valida números de DNI espanyols utilitzant l'algorisme oficial.
 * Un DNI espanyol consta de 8 dígits seguits d'una lletra de control.
 * 
 * Conceptes treballats:
 * - Mètodes amb retorn boolean per validacions
 * - Manipulació de Strings (substring, charAt)
 * - Arrays de caràcters
 * - Operacions mòdul (%) per càlculs
 * - Validacions complexes dividides en mètodes
 */

package Java_Metodes.Validador_DNI;

import java.util.Scanner;

public class ValidadorDNI {
    // Lletres de control del DNI en ordre (posició 0 = residu 0, etc.)
    private static final char[] LLETRES_DNI = {
        'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B',
        'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'
    };

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        String dni;
        boolean continuar = true;

        System.out.println("=== VALIDADOR DE DNI ESPANYOL ===");
        System.out.println("Format: 8 dígits + 1 lletra (exemple: 12345678Z)");
        System.out.println();

        while (continuar) {
            System.out.print("Introdueix un DNI (o 'sortir' per acabar): ");
            dni = lector.nextLine().trim().toUpperCase();

            if (dni.equalsIgnoreCase("sortir")) {
                continuar = false;
                System.out.println("Sortint del programa. Adéu!");
            } else {
                validarIMostrarResultat(dni);
                System.out.println();
            }
        }

        lector.close();
    }

    /**
     * Valida un DNI i mostra el resultat per pantalla
     * @param dni el DNI a validar
     */
    public static void validarIMostrarResultat(String dni) {
        if (validarFormatDNI(dni)) {
            int numeros = extreurePartNumerica(dni);
            char lletraIntroduida = extreureLletra(dni);
            char lletraCorrecta = calcularLletraDNI(numeros);

            System.out.println("DNI: " + dni);
            System.out.println("Part numèrica: " + numeros);
            System.out.println("Lletra introduïda: " + lletraIntroduida);
            System.out.println("Lletra correcta: " + lletraCorrecta);

            if (lletraIntroduida == lletraCorrecta) {
                System.out.println("✓ El DNI és VÀLID");
            } else {
                System.out.println("✗ El DNI és INVÀLID (lletra incorrecta)");
            }
        } else {
            System.out.println("✗ El DNI té un format invàlid");
            System.out.println("  Ha de tenir exactament 8 dígits seguits d'una lletra");
        }
    }

    /**
     * Valida que el format del DNI sigui correcte (8 dígits + 1 lletra)
     * @param dni el DNI a validar
     * @return true si el format és correcte, false altrament
     */
    public static boolean validarFormatDNI(String dni) {
        // Comprova la longitud
        if (dni.length() != 9) {
            return false;
        }

        // Comprova que els primers 8 caràcters siguin dígits
        for (int i = 0; i < 8; i++) {
            if (!Character.isDigit(dni.charAt(i))) {
                return false;
            }
        }

        // Comprova que l'últim caràcter sigui una lletra
        if (!Character.isLetter(dni.charAt(8))) {
            return false;
        }

        return true;
    }

    /**
     * Extreu la part numèrica del DNI (els primers 8 dígits)
     * @param dni el DNI complet
     * @return la part numèrica com a enter
     */
    public static int extreurePartNumerica(String dni) {
        String partNumerica = dni.substring(0, 8);
        return Integer.parseInt(partNumerica);
    }

    /**
     * Extreu la lletra del DNI (l'últim caràcter)
     * @param dni el DNI complet
     * @return la lletra del DNI
     */
    public static char extreureLletra(String dni) {
        return dni.charAt(8);
    }

    /**
     * Calcula la lletra de control correcta per un número de DNI
     * L'algorisme és: lletra = LLETRES_DNI[numero % 23]
     * @param numeroDNI la part numèrica del DNI
     * @return la lletra de control corresponent
     */
    public static char calcularLletraDNI(int numeroDNI) {
        int residu = numeroDNI % 23;
        return LLETRES_DNI[residu];
    }
}
