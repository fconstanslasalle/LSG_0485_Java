# 03_02 - Java Print

## Introducció

Aquest exemple mostra les diferents formes de mostrar informació per pantalla en Java. La sortida per consola és fonamental per comunicar resultats, depurar programes i interactuar amb l'usuari.

## Conceptes

### Mètodes de Sortida Principals

#### System.out.println()
- Imprimeix el text i afegeix un salt de línia al final
- Cada crida comença en una nova línia

```java
System.out.println("Hola món");
System.out.println("Aquesta és una altra línia");
```

#### System.out.print()
- Imprimeix el text sense afegir salt de línia
- La següent sortida continua a la mateixa línia

```java
System.out.print("Hola ");
System.out.print("món");
// Resultat: Hola món
```

#### System.out.printf()
- Imprimeix amb format (similar a printf en C)
- Permet especificar el format de sortida

```java
System.out.printf("El meu nom és %s i tinc %d anys%n", nom, edat);
```

### Especificadors de Format

Utilitzats amb `printf()`:
- **`%s`**: String (cadena de text)
- **`%d`**: Enter (int, byte, short, long)
- **`%f`**: Decimal (float, double)
- **`%c`**: Caràcter (char)
- **`%b`**: Booleà (boolean)
- **`%n`**: Salt de línia (multiplataforma)
- **`%.2f`**: Decimal amb 2 decimals

### Concatenació de Strings
```java
String nom = "Joan";
int edat = 20;
System.out.println("Em dic " + nom + " i tinc " + edat + " anys");
```

### Caràcters Especials (Escape Sequences)
- **`\n`**: Salt de línia
- **`\t`**: Tabulació
- **`\"`**: Cometes dobles
- **`\'`**: Cometa simple
- **`\\`**: Barra invertida

## Exemples

Aquest exemple demostra:
- Utilitzar `println()` per imprimir amb salt de línia
- Utilitzar `print()` per imprimir sense salt de línia
- Utilitzar `printf()` per formatjar sortides
- Concatenar strings amb l'operador `+`
- Aplicar especificadors de format
- Utilitzar caràcters d'escapament

## Exemples de Codi

```java
// println - amb salt de línia
System.out.println("Línia 1");
System.out.println("Línia 2");

// print - sense salt de línia
System.out.print("Part 1 ");
System.out.print("Part 2\n");

// printf - amb format
String nom = "Maria";
int edat = 22;
double nota = 8.75;
System.out.printf("Nom: %s, Edat: %d, Nota: %.2f%n", nom, edat, nota);
// Resultat: Nom: Maria, Edat: 22, Nota: 8.75

// Concatenació
System.out.println("Resultat: " + (5 + 3)); // Resultat: 8

// Caràcters especials
System.out.println("Línia 1\nLínia 2");
System.out.println("Columna1\tColumna2");
System.out.println("Ell va dir: \"Hola\"");
```

## Comparació de Mètodes

| Mètode | Salt de Línia | Format | Ús Principal |
|--------|---------------|--------|--------------|
| `println()` | Sí | No | Sortida simple |
| `print()` | No | No | Sortida en línia |
| `printf()` | No (usar %n) | Sí | Sortida formatada |

## Notes Importants

💡 **Consells**:
- Utilitzar `println()` per defecte per facilitar la lectura
- Utilitzar `printf()` quan es necessiti format específic (decimals, alineació)
- Preferir `%n` en lloc de `\n` en `printf()` per compatibilitat multiplataforma

⚠️ **Atenció**:
- Tenir en compte que la concatenació amb `+` crea nous objectes String
- Per a moltes concatenacions, considerar utilitzar `StringBuilder`
