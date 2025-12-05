# 11_03 - Llegir Fitxer Binari

## Introducció

Aquest exemple mostra com llegir fitxers binaris en Java. Els fitxers binaris contenen dades en format de bytes, diferents dels fitxers de text.

## Conceptes

### Lectura amb FileInputStream
```java
import java.io.FileInputStream;
import java.io.IOException;

try (FileInputStream fis = new FileInputStream("fitxer.bin")) {
    int byteValue;
    while ((byteValue = fis.read()) != -1) {
        // Processar byte
    }
}
```

### Diferència Text vs Binari
- **Fitxer de Text**: Caràcters codificats (ASCII, UTF-8)
- **Fitxer Binari**: Bytes sense codificació especial

## Exemples

Aquest exemple demostra:
- Llegir fitxers binaris byte a byte
- Utilitzar FileInputStream
- Processar dades binàries
- Gestió d'excepcions

## Notes Importants

💡 **Consells**:
- Per fitxers grans, utilitzar BufferedInputStream
- Comprovar el tipus de fitxer abans de processar

⚠️ **Atenció**:
- `read()` retorna -1 quan arriba al final
- Gestionar IOException
