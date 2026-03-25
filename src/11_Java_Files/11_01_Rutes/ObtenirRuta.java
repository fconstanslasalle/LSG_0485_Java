import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ObtenirRuta {

    public static void main(String[] args) {
        System.out.println("--- Treballant amb Rutes en Java ---");

        // 1. Obtenir el directori actual on s'està executant el programa
        String directoriActual = System.getProperty("user.dir");
        System.out.println("1. Directori actual d'execució: " + directoriActual);

        // 2. Exemple amb classe File de java.io (Clàssic)
        File fitxerIo = new File("exemple_io.txt");
        System.out.println("\n2. [java.io.File]");
        System.out.println("   Ruta donada: " + fitxerIo.getPath());
        System.out.println("   Ruta absoluta: " + fitxerIo.getAbsolutePath());
        System.out.println("   És directori? " + fitxerIo.isDirectory());
        System.out.println("   Existeix? " + fitxerIo.exists());

        // 3. Exemple amb classe Path/Paths de java.nio.file (Modern - Java 7+)
        Path rutaNio = Paths.get("exemple_nio.txt");
        System.out.println("\n3. [java.nio.file.Path]");
        System.out.println("   Ruta donada: " + rutaNio.toString());
        System.out.println("   Ruta absoluta: " + rutaNio.toAbsolutePath());
        System.out.println("   Nom de l'arxiu: " + rutaNio.getFileName());
        System.out.println("   Carpeta pare de ruta absoluta: " + rutaNio.toAbsolutePath().getParent());

        // 4. Exemple de construcció d'una ruta amb diversos elements
        Path rutaMiriade = Paths.get("carpeta", "subcarpeta", "arxiu.doc");
        System.out.println("\n4. Muntant una ruta de diverses parts:");
        System.out.println("   " + rutaMiriade.toString());
    }
}
