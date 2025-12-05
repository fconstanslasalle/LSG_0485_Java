# 08_02 - String Manipulació

## Introducció

Aquest exemple mostra operacions avançades de manipulació de Strings, incloent cerca, extracció de substrings i transformacions.

## Conceptes

### Cerca dins de Strings

#### indexOf
```java
String text = "Hola món, hola Java";
int posicio = text.indexOf("món");        // 5
int ultima = text.lastIndexOf("hola");    // 11 (última aparició)
```

#### contains
```java
boolean conte = text.contains("Java");    // true
```

### Extracció de Substrings
```java
String text = "Hola món";
String sub1 = text.substring(5);          // "món"
String sub2 = text.substring(0, 4);       // "Hola"
```

### Divisió de Strings
```java
String text = "poma,pera,plàtan";
String[] fruites = text.split(",");       // ["poma", "pera", "plàtan"]
```

### Reemplaçament
```java
String text = "Hola món";
String nou = text.replace("món", "Java"); // "Hola Java"
```

### Neteja d'Espais
```java
String text = "  Hola món  ";
String net = text.trim();                 // "Hola món"
```

### Comprovar Inici/Final
```java
boolean comenca = text.startsWith("Hola");  // true
boolean acaba = text.endsWith("món");       // true
```

## Exemples

Aquest exemple demostra:
- Cerca de substrings amb `indexOf` i `lastIndexOf`
- Extracció de parts d'un String amb `substring`
- Divisió d'un String en parts amb `split`
- Reemplaçament de text amb `replace`
- Neteja d'espais amb `trim`
- Validació amb `startsWith` i `endsWith`
- Comprovar si conté text amb `contains`

## Notes Importants

💡 **Consells**:
- `indexOf` retorna -1 si no troba el text
- `substring(start, end)`: `end` no està inclòs
- `split` retorna un array de Strings

⚠️ **Atenció**:
- Els índexs comencen a 0
- Controlar `StringIndexOutOfBoundsException`
