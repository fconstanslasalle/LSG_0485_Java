# 11_02 - Llegir Fitxer Text

## Introducció

Aquest exemple mostra com llegir fitxers de text en Java. La lectura de fitxers és essencial per processar dades emmagatzemades.

## Conceptes

### Lectura amb BufferedReader
```java
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

try (BufferedReader br = new BufferedReader(new FileReader("fitxer.txt"))) {
    String linia;
    while ((linia = br.readLine()) != null) {
        System.out.println(linia);
    }
} catch (IOException e) {
    e.printStackTrace();
}
```

### Try-with-Resources
```java
try (BufferedReader br = new BufferedReader(new FileReader("fitxer.txt"))) {
    // El BufferedReader es tanca automàticament
}
```

### Lectura amb Scanner
```java
import java.util.Scanner;
import java.io.File;

try (Scanner scanner = new Scanner(new File("fitxer.txt"))) {
    while (scanner.hasNextLine()) {
        String linia = scanner.nextLine();
        System.out.println(linia);
    }
}
```

## Exemples

Aquest exemple demostra:
- Obrir un fitxer de text
- Llegir línia per línia amb BufferedReader
- Try-with-resources per tancament automàtic
- Gestió d'excepcions (IOException)
- Processar el contingut llegit

## Notes Importants

💡 **Consells**:
- Utilitzar try-with-resources per tancar automàticament
- BufferedReader és més eficient per fitxers grans
- Comprovar que el fitxer existeix abans de llegir

⚠️ **Atenció**:
- Gestionar FileNotFoundException
- Gestionar IOException
- Tancar sempre els recursos
- Codificació del fitxer (UTF-8 per defecte)
