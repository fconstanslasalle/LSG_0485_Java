# 11_01 - Rutes

## Introducció

Aquest exemple mostra com treballar amb rutes de fitxers i directoris en Java. Comprendre les rutes és fonamental per gestionar fitxers correctament.

## Conceptes

### Tipus de Rutes

#### Ruta Absoluta
Ruta completa des de l'arrel del sistema
```java
File fitxer = new File("C:\\Users\\usuari\\Documents\\fitxer.txt");
```

#### Ruta Relativa
Ruta des del directori actual
```java
File fitxer = new File("dades\\fitxer.txt");
```

### Classe File
```java
import java.io.File;

File fitxer = new File("exemple.txt");
File directori = new File("carpeta");
```

### Operacions amb Rutes

#### Comprovar Existència
```java
boolean existeix = fitxer.exists();
```

#### Obtenir Informació
```java
String nom = fitxer.getName();
String rutaAbsoluta = fitxer.getAbsolutePath();
long mida = fitxer.length();  // en bytes
boolean esDirectori = fitxer.isDirectory();
boolean esFitxer = fitxer.isFile();
```

#### Crear i Eliminar
```java
fitxer.createNewFile();        // Crear fitxer
directori.mkdir();             // Crear directori
directori.mkdirs();            // Crear directoris niats
fitxer.delete();               // Eliminar
```

### Separador de Rutes
```java
String separador = File.separator;  // '/' en Unix/Linux, '\' en Windows
```

## Exemples

Aquest exemple demostra:
- Crear objectes File
- Diferenciar rutes absolutes i relatives
- Comprovar existència de fitxers
- Obtenir informació de fitxers i directoris
- Llistar contingut d'un directori
- Utilitzar separadors de ruta multiplataforma

## Notes Importants

💡 **Consells**:
- Utilitzar `File.separator` per compatibilitat
- Comprovar `exists()` abans d'operar amb fitxers
- Gestionar excepcions (IOException)

⚠️ **Atenció**:
- Windows utilitza `\`, Unix/Linux utilitza `/`
- En Windows, escapar barres: `"C:\\ruta\\fitxer.txt"`
- O utilitzar barres normals: `"C:/ruta/fitxer.txt"` (també funciona en Windows)
