# 03 - Java Input/Output

## Introducció

Aquesta carpeta conté exemples sobre com gestionar l'entrada i sortida de dades en Java. Aprendre a llegir dades de l'usuari i mostrar resultats és essencial per crear programes interactius.

## Conceptes

### Entrada de Dades (Input)
La classe **Scanner** és la forma més comuna de llegir dades de l'usuari:
```java
import java.util.Scanner;

Scanner lector = new Scanner(System.in);
String text = lector.nextLine();
int numero = lector.nextInt();
```

#### Mètodes de Scanner
- `nextLine()`: Llegeix una línia completa
- `next()`: Llegeix una paraula
- `nextInt()`: Llegeix un enter
- `nextDouble()`: Llegeix un decimal
- `nextBoolean()`: Llegeix un booleà

### Sortida de Dades (Output)
Diversos mètodes per mostrar informació per pantalla:

#### System.out.println()
```java
System.out.println("Text amb salt de línia");
```

#### System.out.print()
```java
System.out.print("Text sense salt de línia");
```

#### System.out.printf()
```java
System.out.printf("Nom: %s, Edat: %d%n", nom, edat);
```

### Especificadors de Format
- `%s`: String
- `%d`: Enter
- `%f`: Decimal
- `%.2f`: Decimal amb 2 decimals
- `%n`: Salt de línia multiplataforma

## Exemples

### 03_01 - Java Scanner
Exemple que demostra:
- Importar i crear un objecte Scanner
- Llegir diferents tipus de dades
- Gestionar el buffer d'entrada
- Bones pràctiques amb Scanner

### 03_02 - Java Print
Exemple que demostra:
- Utilitzar `println()`, `print()` i `printf()`
- Formatjar la sortida amb especificadors
- Concatenar strings
- Utilitzar caràcters d'escapament

## Problema Comú: Buffer del Scanner

Després de llegir un número amb `nextInt()`, el salt de línia queda al buffer:
```java
int edat = lector.nextInt();
lector.nextLine(); // Neteja el buffer
String nom = lector.nextLine(); // Ara funciona correctament
```

## Notes Importants

💡 **Consells**:
- Sempre tancar el Scanner amb `lector.close()`
- Netejar el buffer després de llegir números
- Validar l'entrada de l'usuari
- Utilitzar `printf()` per format precís

⚠️ **Atenció**:
- Gestionar excepcions com `InputMismatchException`
- Tenir en compte el problema del buffer
- Proporcionar missatges clars a l'usuari
- Tancar el Scanner per alliberar recursos
