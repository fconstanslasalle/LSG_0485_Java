# 08_01 - DemoString

## Introducció

Aquest exemple demostra les operacions bàsiques amb Strings en Java. Els Strings són objectes immutables que representen cadenes de caràcters i són fonamentals en qualsevol aplicació Java.

## Conceptes

### Immutabilitat dels Strings
- Els Strings són immutables: no es poden modificar després de crear-se
- Cada operació que "modifica" un String crea un nou objecte

### Creació de Strings
```java
String nom1 = "Hola";              // Literal
String nom2 = new String("Hola");  // Objecte
```

### Mètodes Bàsics

#### Longitud
```java
String text = "Hola món";
int longitud = text.length(); // 8
```

#### Concatenació
```java
String salutacio = "Hola" + " " + "món";
String resultat = text.concat(" i adéu");
```

#### Accedir a Caràcters
```java
char primer = text.charAt(0);     // 'H'
char ultim = text.charAt(text.length() - 1);
```

#### Comparació
```java
String a = "Hola";
String b = "Hola";
boolean iguals = a.equals(b);     // true
boolean ignoreCase = a.equalsIgnoreCase("hola"); // true
```

### Conversió
```java
String upper = text.toUpperCase();  // "HOLA MÓN"
String lower = text.toLowerCase();  // "hola món"
```

## Exemples

Aquest exemple demostra:
- Creació de Strings
- Concatenació de cadenes
- Obtenir la longitud d'un String
- Accedir a caràcters individuals
- Comparar Strings correctament
- Conversió a majúscules i minúscules

## Notes Importants

⚠️ **Atenció**:
- **NO** utilitzar `==` per comparar Strings, utilitzar `.equals()`
- Els Strings són immutables
- `charAt(index)` pot llançar `StringIndexOutOfBoundsException`

💡 **Consell**: Per a moltes concatenacions, utilitzar `StringBuilder`
