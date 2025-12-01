/**
 * Exemple 08_02: Manipulació de Strings
 * 
 * Aquest programa demostra operacions avançades de manipulació de Strings:
 * - substring: extreure una part del String
 * - replace: substituir caràcters o subcadenes
 * - split: dividir un String en parts
 * - trim: eliminar espais en blanc al principi i al final
 * - concat: concatenar Strings
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        // Demanem una frase a l'usuari
        System.out.print("Escriu una frase: ");
        String frase = lector.nextLine();

        // Mostrem informació bàsica del String
        System.out.println("\n--- Informació Bàsica ---");
        System.out.println("Frase original: \"" + frase + "\"");
        System.out.println("Longitud: " + frase.length() + " caràcters");

        // --- Ús de substring ---
        System.out.println("\n--- Ús de substring ---");
        if (frase.length() >= 5) {
            // substring(inici, final) - final no inclòs
            String primersCaracters = frase.substring(0, 5);
            System.out.println("Primers 5 caràcters: \"" + primersCaracters + "\"");
            
            // substring(inici) - des de l'inici fins al final
            String desDelMig = frase.substring(frase.length() / 2);
            System.out.println("Des del mig fins al final: \"" + desDelMig + "\"");
        } else {
            System.out.println("La frase és massa curta per demostrar substring");
        }

        // --- Ús de replace ---
        System.out.println("\n--- Ús de replace ---");
        // Substituïm tots els espais per guions baixos
        String fraseAmbGuions = frase.replace(' ', '_');
        System.out.println("Espais per guions baixos: \"" + fraseAmbGuions + "\"");
        
        // Substituïm una subcadena per una altra
        String fraseModificada = frase.replace("a", "@");
        System.out.println("Lletres 'a' per '@': \"" + fraseModificada + "\"");

        // --- Ús de split ---
        System.out.println("\n--- Ús de split ---");
        // Dividim la frase per espais (obtenim les paraules)
        String[] paraules = frase.split(" ");
        System.out.println("Nombre de paraules: " + paraules.length);
        System.out.println("Paraules:");
        for (int i = 0; i < paraules.length; i++) {
            System.out.println("  Paraula " + (i + 1) + ": \"" + paraules[i] + "\"");
        }

        // --- Ús de trim ---
        System.out.println("\n--- Ús de trim ---");
        System.out.print("Escriu un text amb espais al principi i al final: ");
        String textAmbEspais = lector.nextLine();
        String textNetejat = textAmbEspais.trim();
        System.out.println("Text original: \"" + textAmbEspais + "\" (longitud: " + textAmbEspais.length() + ")");
        System.out.println("Text netejat:  \"" + textNetejat + "\" (longitud: " + textNetejat.length() + ")");

        // --- Ús de concat i operador + ---
        System.out.println("\n--- Concatenació de Strings ---");
        String part1 = "Hola";
        String part2 = "Món";
        
        // Concatenació amb mètode concat
        String resultatConcat = part1.concat(" ").concat(part2);
        System.out.println("Amb concat(): \"" + resultatConcat + "\"");
        
        // Concatenació amb operador +
        String resultatOperador = part1 + " " + part2 + "!";
        System.out.println("Amb operador +: \"" + resultatOperador + "\"");

        // --- Conversió entre majúscules i minúscules ---
        System.out.println("\n--- Conversió de Majúscules/Minúscules ---");
        System.out.println("Tot majúscules: \"" + frase.toUpperCase() + "\"");
        System.out.println("Tot minúscules: \"" + frase.toLowerCase() + "\"");

        lector.close();
    }
}
