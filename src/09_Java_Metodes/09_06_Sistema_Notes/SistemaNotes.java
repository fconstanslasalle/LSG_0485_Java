/**
 * Exemple 09_06: Sistema de Gestió de Notes
 * 
 * Aquest programa gestiona les notes d'un alumne i calcula estadístiques.
 * Permet introduir notes, calcular mitjana, trobar màxims i mínims.
 * 
 * Conceptes treballats:
 * - Mètodes que treballen amb arrays
 * - Mètodes amb retorn de diferents tipus (double, int, boolean)
 * - Càlculs estadístics (mitjana, màxim, mínim)
 * - Organització de codi modular
 * - Validació de notes
 */

import java.util.Scanner;

public class SistemaNotes {
    private static final int MAX_NOTES = 5;
    private static final double NOTA_MINIMA = 0.0;
    private static final double NOTA_MAXIMA = 10.0;

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        double[] notes = new double[MAX_NOTES];
        int nombreNotesIntroduides = 0;
        int opcio;

        System.out.println("=== SISTEMA DE GESTIÓ DE NOTES ===");
        System.out.println("Màxim de notes: " + MAX_NOTES);
        System.out.println();

        do {
            mostrarMenu();
            opcio = llegirEnter(lector);

            switch (opcio) {
                case 1:
                    if (nombreNotesIntroduides < MAX_NOTES) {
                        introduirNota(lector, notes, nombreNotesIntroduides);
                        nombreNotesIntroduides++;
                    } else {
                        System.out.println("Ja has introduït el màxim de notes!");
                    }
                    break;
                case 2:
                    mostrarNotes(notes, nombreNotesIntroduides);
                    break;
                case 3:
                    calcularIMostrarMitjana(notes, nombreNotesIntroduides);
                    break;
                case 4:
                    mostrarNotaMaxima(notes, nombreNotesIntroduides);
                    break;
                case 5:
                    mostrarNotaMinima(notes, nombreNotesIntroduides);
                    break;
                case 6:
                    mostrarEstadistiques(notes, nombreNotesIntroduides);
                    break;
                case 7:
                    System.out.println("Sortint del programa. Adéu!");
                    break;
                default:
                    System.out.println("Opció no vàlida!");
                    break;
            }

            System.out.println();

        } while (opcio != 7);

        lector.close();
    }

    /**
     * Mostra el menú d'opcions disponibles
     */
    public static void mostrarMenu() {
        System.out.println("--- MENÚ ---");
        System.out.println("[1] Introduir una nota");
        System.out.println("[2] Mostrar totes les notes");
        System.out.println("[3] Calcular mitjana");
        System.out.println("[4] Mostrar nota màxima");
        System.out.println("[5] Mostrar nota mínima");
        System.out.println("[6] Mostrar estadístiques completes");
        System.out.println("[7] Sortir");
        System.out.print("Tria una opció: ");
    }

    /**
     * Llegeix un número enter de l'usuari
     * @param lector Scanner per llegir l'entrada
     * @return el número enter introduït
     */
    public static int llegirEnter(Scanner lector) {
        while (!lector.hasNextInt()) {
            System.out.print("Introdueix un número enter vàlid: ");
            lector.nextLine();
        }
        int numero = lector.nextInt();
        lector.nextLine(); // Netegem el buffer
        return numero;
    }

    /**
     * Llegeix una nota vàlida de l'usuari (entre 0 i 10)
     * @param lector Scanner per llegir l'entrada
     * @return la nota introduïda
     */
    public static double llegirNota(Scanner lector) {
        double nota;
        boolean notaValida;

        do {
            while (!lector.hasNextDouble()) {
                System.out.print("Introdueix una nota vàlida (0-10): ");
                lector.nextLine();
            }
            nota = lector.nextDouble();
            lector.nextLine(); // Netegem el buffer

            notaValida = validarNota(nota);
            if (!notaValida) {
                System.out.print("La nota ha d'estar entre 0 i 10. Torna a intentar-ho: ");
            }

        } while (!notaValida);

        return nota;
    }

    /**
     * Valida que una nota estigui dins del rang permès
     * @param nota la nota a validar
     * @return true si la nota és vàlida, false altrament
     */
    public static boolean validarNota(double nota) {
        return nota >= NOTA_MINIMA && nota <= NOTA_MAXIMA;
    }

    /**
     * Introdueix una nova nota a l'array
     * @param lector Scanner per llegir l'entrada
     * @param notes array on guardar la nota
     * @param posicio posició on guardar la nota
     */
    public static void introduirNota(Scanner lector, double[] notes, int posicio) {
        System.out.print("Introdueix la nota " + (posicio + 1) + ": ");
        notes[posicio] = llegirNota(lector);
        System.out.println("Nota guardada correctament!");
    }

    /**
     * Mostra totes les notes introduïdes
     * @param notes array amb les notes
     * @param quantitat nombre de notes introduïdes
     */
    public static void mostrarNotes(double[] notes, int quantitat) {
        if (quantitat == 0) {
            System.out.println("No hi ha cap nota introduïda.");
            return;
        }

        System.out.println("\n--- NOTES INTRODUÏDES ---");
        for (int i = 0; i < quantitat; i++) {
            String qualificacio = obtenirQualificacio(notes[i]);
            System.out.printf("Nota %d: %.2f - %s%n", (i + 1), notes[i], qualificacio);
        }
    }

    /**
     * Calcula la mitjana de les notes
     * @param notes array amb les notes
     * @param quantitat nombre de notes a considerar
     * @return la mitjana de les notes
     */
    public static double calcularMitjana(double[] notes, int quantitat) {
        if (quantitat == 0) {
            return 0.0;
        }

        double suma = 0.0;
        for (int i = 0; i < quantitat; i++) {
            suma = suma + notes[i];
        }

        return suma / quantitat;
    }

    /**
     * Calcula i mostra la mitjana de les notes
     * @param notes array amb les notes
     * @param quantitat nombre de notes introduïdes
     */
    public static void calcularIMostrarMitjana(double[] notes, int quantitat) {
        if (quantitat == 0) {
            System.out.println("No hi ha cap nota per calcular la mitjana.");
            return;
        }

        double mitjana = calcularMitjana(notes, quantitat);
        String qualificacio = obtenirQualificacio(mitjana);
        System.out.printf("La mitjana de les notes és: %.2f - %s%n", mitjana, qualificacio);
    }

    /**
     * Troba la nota màxima de l'array
     * @param notes array amb les notes
     * @param quantitat nombre de notes a considerar
     * @return la nota màxima
     */
    public static double trobarMaxim(double[] notes, int quantitat) {
        if (quantitat == 0) {
            return 0.0;
        }

        double maxim = notes[0];
        for (int i = 1; i < quantitat; i++) {
            if (notes[i] > maxim) {
                maxim = notes[i];
            }
        }

        return maxim;
    }

    /**
     * Mostra la nota màxima
     * @param notes array amb les notes
     * @param quantitat nombre de notes introduïdes
     */
    public static void mostrarNotaMaxima(double[] notes, int quantitat) {
        if (quantitat == 0) {
            System.out.println("No hi ha cap nota introduïda.");
            return;
        }

        double maxim = trobarMaxim(notes, quantitat);
        System.out.printf("La nota màxima és: %.2f%n", maxim);
    }

    /**
     * Troba la nota mínima de l'array
     * @param notes array amb les notes
     * @param quantitat nombre de notes a considerar
     * @return la nota mínima
     */
    public static double trobarMinim(double[] notes, int quantitat) {
        if (quantitat == 0) {
            return 0.0;
        }

        double minim = notes[0];
        for (int i = 1; i < quantitat; i++) {
            if (notes[i] < minim) {
                minim = notes[i];
            }
        }

        return minim;
    }

    /**
     * Mostra la nota mínima
     * @param notes array amb les notes
     * @param quantitat nombre de notes introduïdes
     */
    public static void mostrarNotaMinima(double[] notes, int quantitat) {
        if (quantitat == 0) {
            System.out.println("No hi ha cap nota introduïda.");
            return;
        }

        double minim = trobarMinim(notes, quantitat);
        System.out.printf("La nota mínima és: %.2f%n", minim);
    }

    /**
     * Obté la qualificació textual d'una nota
     * @param nota la nota numèrica
     * @return la qualificació textual
     */
    public static String obtenirQualificacio(double nota) {
        if (nota < 5.0) {
            return "Suspès";
        } else if (nota < 7.0) {
            return "Aprovat";
        } else if (nota < 9.0) {
            return "Notable";
        } else {
            return "Excel·lent";
        }
    }

    /**
     * Compta quantes notes estan aprovades (>= 5)
     * @param notes array amb les notes
     * @param quantitat nombre de notes a considerar
     * @return el nombre de notes aprovades
     */
    public static int comptarAprovades(double[] notes, int quantitat) {
        int aprovades = 0;
        for (int i = 0; i < quantitat; i++) {
            if (notes[i] >= 5.0) {
                aprovades++;
            }
        }
        return aprovades;
    }

    /**
     * Mostra totes les estadístiques de les notes
     * @param notes array amb les notes
     * @param quantitat nombre de notes introduïdes
     */
    public static void mostrarEstadistiques(double[] notes, int quantitat) {
        if (quantitat == 0) {
            System.out.println("No hi ha cap nota per mostrar estadístiques.");
            return;
        }

        System.out.println("\n=== ESTADÍSTIQUES COMPLETES ===");
        System.out.println("Nombre de notes: " + quantitat);
        
        double mitjana = calcularMitjana(notes, quantitat);
        System.out.printf("Mitjana: %.2f - %s%n", mitjana, obtenirQualificacio(mitjana));
        
        double maxim = trobarMaxim(notes, quantitat);
        System.out.printf("Nota màxima: %.2f%n", maxim);
        
        double minim = trobarMinim(notes, quantitat);
        System.out.printf("Nota mínima: %.2f%n", minim);
        
        int aprovades = comptarAprovades(notes, quantitat);
        int suspeses = quantitat - aprovades;
        System.out.println("Notes aprovades: " + aprovades);
        System.out.println("Notes suspeses: " + suspeses);
        
        double percentatgeAprovades = (aprovades * 100.0) / quantitat;
        System.out.printf("Percentatge d'aprovats: %.2f%%%n", percentatgeAprovades);
        
        System.out.println("===============================");
    }
}
