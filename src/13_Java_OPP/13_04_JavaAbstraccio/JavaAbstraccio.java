package Java_OPP.JavaAbstraccio;

/**
 * Classe principal que demostra l'ús de l'abstracció en Java.
 * Mostra com utilitzar classes abstractes i interfícies per crear
 * una jerarquia flexible i extensible.
 */
public class JavaAbstraccio {
    
    public static void main(String[] args) {
        System.out.println("=== EXEMPLE D'ABSTRACCIÓ EN JAVA ===\n");
        
        // No podem crear instàncies de classes abstractes:
        // Vehicle v = new Vehicle("Genèric", "X", 2020); // Això donaria error!
        
        // Crear un cotxe (hereta de Vehicle)
        System.out.println("--- Cotxe ---");
        Cotxe cotxe = new Cotxe("Toyota", "Corolla", 2022, 4);
        cotxe.mostrarInfo();
        cotxe.arrencar();
        cotxe.accelerar();
        cotxe.frenar();
        cotxe.obrir_portes();
        
        System.out.println();
        
        // Crear un avió (hereta de Vehicle i implementa Volador)
        System.out.println("--- Avió ---");
        Avio avio = new Avio("Boeing", "747", 2020, 416, 13000.0);
        avio.mostrarInfo();
        avio.arrencar();
        avio.accelerar();
        avio.volar();
        System.out.println("Altitud màxima: " + avio.obtenirAltitudMaxima() + " metres");
        avio.aterrar();
        avio.frenar();
        
        System.out.println();
        
        // Crear un dron (implementa Volador però NO hereta de Vehicle)
        System.out.println("--- Dron ---");
        Dron dron = new Dron("DJI Phantom 4", 4, 6000.0);
        dron.mostrarInfo();
        dron.volar();
        dron.ferFoto();
        System.out.println("Altitud màxima: " + dron.obtenirAltitudMaxima() + " metres");
        dron.aterrar();
        
        System.out.println();
        
        // Crear un submarí (hereta de Vehicle i implementa Submergible)
        System.out.println("--- Submarí ---");
        Submari submari = new Submari("Nautilus", "SSN-571", 1954, 140, 730.0);
        submari.mostrarInfo();
        submari.arrencar();
        submari.submergir();
        submari.accelerar();
        System.out.println("Profunditat màxima: " + submari.obtenirProfunditatMaxima() + " metres");
        submari.emergir();
        submari.frenar();
        
        System.out.println();
        
        // Demostració de polimorfisme amb interfícies
        System.out.println("--- Polimorfisme amb Interfícies ---");
        
        // Array de Voladors (interfície)
        Volador[] voladors = new Volador[2];
        voladors[0] = avio;
        voladors[1] = dron;
        
        System.out.println("Tots els objectes voladors:");
        for (int i = 0; i < voladors.length; i++) {
            System.out.println("\nVolador " + (i + 1) + ":");
            voladors[i].volar();
            System.out.println("Altitud màxima: " + voladors[i].obtenirAltitudMaxima() + " metres");
            voladors[i].aterrar();
        }
        
        System.out.println();
        
        // Array de Vehicles (classe abstracta)
        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = cotxe;
        vehicles[1] = avio;
        vehicles[2] = submari;
        
        System.out.println("--- Tots els Vehicles ---");
        for (int i = 0; i < vehicles.length; i++) {
            System.out.println("\nVehicle " + (i + 1) + ":");
            vehicles[i].mostrarInfo();
            vehicles[i].accelerar();
            vehicles[i].frenar();
        }
        
        System.out.println("\n=== FI DE L'EXEMPLE ===");
    }
}
