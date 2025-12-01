/**
 * Exemple 08_05: Combinació de Strings i ArrayList
 * 
 * Aquest programa demostra com treballar amb Strings i ArrayList conjuntament:
 * - Emmagatzemar i manipular llistes de Strings
 * - Filtrar elements per criteris de text
 * - Cercar Strings que continguin un patró
 * - Ordenar alfabèticament
 * - Processar text i emmagatzemar paraules
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        // Creem un ArrayList per emmagatzemar noms d'alumnes
        ArrayList<String> alumnes = new ArrayList<String>();

        // --- Afegir alumnes ---
        System.out.println("--- Registre d'Alumnes ---");
        System.out.print("Quants alumnes vols registrar? ");
        int quantitat = lector.nextInt();
        lector.nextLine();

        for (int i = 0; i < quantitat; i++) {
            System.out.print("Nom de l'alumne " + (i + 1) + ": ");
            String nom = lector.nextLine();
            alumnes.add(nom);
        }

        // Mostrem la llista d'alumnes
        System.out.println("\n--- Llista d'Alumnes ---");
        for (int i = 0; i < alumnes.size(); i++) {
            System.out.println((i + 1) + ". " + alumnes.get(i));
        }

        // --- Cercar alumnes que continguin un text ---
        System.out.println("\n--- Cercar Alumnes ---");
        System.out.print("Introdueix un text per cercar: ");
        String textCerca = lector.nextLine();

        System.out.println("Alumnes que contenen \"" + textCerca + "\":");
        boolean trobatAlmenys = false;
        for (int i = 0; i < alumnes.size(); i++) {
            // Usem toLowerCase per fer la cerca insensible a majúscules
            if (alumnes.get(i).toLowerCase().contains(textCerca.toLowerCase())) {
                System.out.println("  - " + alumnes.get(i));
                trobatAlmenys = true;
            }
        }
        if (!trobatAlmenys) {
            System.out.println("  No s'han trobat coincidències");
        }

        // --- Filtrar per inicial ---
        System.out.println("\n--- Filtrar per Inicial ---");
        System.out.print("Introdueix una lletra inicial: ");
        String inicial = lector.nextLine().toUpperCase();

        System.out.println("Alumnes que comencen per \"" + inicial + "\":");
        ArrayList<String> filtrats = new ArrayList<String>();
        for (int i = 0; i < alumnes.size(); i++) {
            if (alumnes.get(i).toUpperCase().startsWith(inicial)) {
                filtrats.add(alumnes.get(i));
                System.out.println("  - " + alumnes.get(i));
            }
        }
        System.out.println("Total: " + filtrats.size() + " alumnes");

        // --- Ordenar alfabèticament ---
        System.out.println("\n--- Ordenar Alfabèticament ---");
        System.out.println("Llista original: " + alumnes);
        
        Collections.sort(alumnes);
        System.out.println("Llista ordenada (A-Z): " + alumnes);
        
        Collections.reverse(alumnes);
        System.out.println("Llista ordenada (Z-A): " + alumnes);

        // --- Processar una frase i extreure paraules ---
        System.out.println("\n--- Processar Frase ---");
        System.out.print("Escriu una frase: ");
        String frase = lector.nextLine();

        // Dividim la frase en paraules
        String[] paraulesArray = frase.split(" ");
        ArrayList<String> paraules = new ArrayList<String>();
        
        // Afegim cada paraula a l'ArrayList
        for (int i = 0; i < paraulesArray.length; i++) {
            // Netegem la paraula d'espais innecessaris
            String paraula = paraulesArray[i].trim();
            if (!paraula.isEmpty()) {
                paraules.add(paraula);
            }
        }

        System.out.println("Paraules trobades: " + paraules.size());
        System.out.println("Llista de paraules: " + paraules);

        // --- Comptar paraules per longitud ---
        System.out.println("\n--- Estadístiques de Paraules ---");
        int curtes = 0;     // menys de 4 caràcters
        int mitjanes = 0;   // entre 4 i 7 caràcters
        int llargues = 0;   // més de 7 caràcters

        for (int i = 0; i < paraules.size(); i++) {
            int longitud = paraules.get(i).length();
            if (longitud < 4) {
                curtes++;
            } else if (longitud <= 7) {
                mitjanes++;
            } else {
                llargues++;
            }
        }

        System.out.println("Paraules curtes (<4 caràcters): " + curtes);
        System.out.println("Paraules mitjanes (4-7 caràcters): " + mitjanes);
        System.out.println("Paraules llargues (>7 caràcters): " + llargues);

        // --- Trobar la paraula més llarga ---
        System.out.println("\n--- Paraula Més Llarga ---");
        if (paraules.size() > 0) {
            String paraulaMesLlarga = paraules.get(0);
            for (int i = 1; i < paraules.size(); i++) {
                if (paraules.get(i).length() > paraulaMesLlarga.length()) {
                    paraulaMesLlarga = paraules.get(i);
                }
            }
            System.out.println("La paraula més llarga és: \"" + paraulaMesLlarga + "\" (" + paraulaMesLlarga.length() + " caràcters)");
        }

        // --- Convertir totes les paraules a majúscules ---
        System.out.println("\n--- Transformar Paraules ---");
        ArrayList<String> paraulesEnMajuscules = new ArrayList<String>();
        for (int i = 0; i < paraules.size(); i++) {
            paraulesEnMajuscules.add(paraules.get(i).toUpperCase());
        }
        System.out.println("Paraules en majúscules: " + paraulesEnMajuscules);

        // --- Unir paraules en una sola cadena ---
        System.out.println("\n--- Unir Paraules ---");
        String fraseReconstruida = "";
        for (int i = 0; i < paraules.size(); i++) {
            if (i > 0) {
                fraseReconstruida = fraseReconstruida + " ";
            }
            fraseReconstruida = fraseReconstruida + paraules.get(i);
        }
        System.out.println("Frase reconstruïda: \"" + fraseReconstruida + "\"");

        // Unir amb un altre separador
        String ambGuions = "";
        for (int i = 0; i < paraules.size(); i++) {
            if (i > 0) {
                ambGuions = ambGuions + "-";
            }
            ambGuions = ambGuions + paraules.get(i);
        }
        System.out.println("Amb guions: \"" + ambGuions + "\"");

        lector.close();
    }
}
