# 03_01 - Java Scanner

## Introducció

Aquest exemple mostra com utilitzar la classe `Scanner` per llegir entrada de dades de l'usuari des de la consola. La classe Scanner és una de les formes més comunes i senzilles de capturar dades d'entrada en Java.

## Conceptes

### La Classe Scanner
- Classe del paquet `java.util`
- Permet llegir diferents tipus de dades de diverses fonts
- Font més comuna: `System.in` (entrada estàndard/teclat)

### Importació
```java
import java.util.Scanner;
```

### Creació d'un Objecte Scanner
```java
Scanner lector = new Scanner(System.in);
```

### Mètodes Principals

#### Lectura de Diferents Tipus de Dades
- **`nextLine()`**: Llegeix una línia completa de text (String)
- **`next()`**: Llegeix una paraula (String fins al primer espai)
- **`nextInt()`**: Llegeix un nombre enter (int)
- **`nextDouble()`**: Llegeix un nombre decimal (double)
- **`nextFloat()`**: Llegeix un nombre decimal (float)
- **`nextBoolean()`**: Llegeix un valor booleà (true/false)
- **`nextByte()`**: Llegeix un byte
- **`nextShort()`**: Llegeix un short
- **`nextLong()`**: Llegeix un long

### Bones Pràctiques
- Tancar el Scanner després d'utilitzar-lo: `lector.close()`
- Gestionar possibles excepcions (InputMismatchException)
- Netejar el buffer amb `nextLine()` després de llegir números

### Problema del Buffer
Quan es llegeix un número amb `nextInt()` o similar, el salt de línia (`\n`) queda al buffer. Si després es llegeix amb `nextLine()`, aquest llegirà el salt de línia buit.

**Solució**:
```java
int edat = lector.nextInt();
lector.nextLine(); // Neteja el buffer
String nom = lector.nextLine();
```

## Exemples

Aquest exemple demostra:
- Importar i crear un objecte Scanner
- Llegir diferents tipus de dades del teclat
- Utilitzar els mètodes de lectura adequats
- Mostrar les dades llegides per pantalla
- Tancar correctament el Scanner

## Exemple de Codi

```java
import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        System.out.print("Introdueix el teu nom: ");
        String nom = lector.nextLine();
        
        System.out.print("Introdueix la teva edat: ");
        int edat = lector.nextInt();
        
        System.out.println("Hola " + nom + ", tens " + edat + " anys.");
        
        lector.close();
    }
}
```

## Notes Importants

⚠️ **Atenció**:
- Sempre tancar el Scanner per alliberar recursos
- Gestionar possibles errors d'entrada (InputMismatchException)
- Tenir en compte el problema del buffer amb `nextLine()`

💡 **Consell**: Validar sempre les dades d'entrada de l'usuari abans de processar-les.
