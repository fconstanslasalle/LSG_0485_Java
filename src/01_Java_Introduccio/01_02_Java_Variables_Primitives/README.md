# 01_02 - Java Variables Primitives

## Introducció

Aquest exemple mostra com treballar amb els tipus de dades primitius en Java. Les variables primitives són els tipus de dades bàsics del llenguatge que emmagatzemen valors simples directament en memòria.

## Conceptes

### Tipus de Dades Primitius en Java

#### Tipus Numèrics Enters
- **`byte`**: 8 bits, rang de -128 a 127
- **`short`**: 16 bits, rang de -32,768 a 32,767
- **`int`**: 32 bits, rang de -2^31 a 2^31-1 (més utilitzat)
- **`long`**: 64 bits, rang de -2^63 a 2^63-1

#### Tipus Numèrics Decimals
- **`float`**: 32 bits, precisió simple (afegir `f` al final: 3.14f)
- **`double`**: 64 bits, precisió doble (més utilitzat per decimals)

#### Altres Tipus
- **`boolean`**: Només pot ser `true` o `false`
- **`char`**: Un sol caràcter Unicode (16 bits), entre cometes simples: 'A'

### Declaració i Inicialització

```java
int edat = 25;
double altura = 1.75;
boolean esEstudiant = true;
char inicial = 'J';
```

### Diferència entre Declaració i Assignació
- **Declaració**: Crear la variable amb el seu tipus
- **Inicialització**: Assignar un valor inicial
- **Assignació**: Canviar el valor d'una variable existent

## Exemples

Aquest exemple demostra:
- Declaració de variables de diferents tipus primitius
- Assignació de valors a variables
- Operacions bàsiques amb variables
- Mostrar valors de variables per pantalla
- Diferències entre els tipus de dades

## Notes Importants

⚠️ **Atenció**:
- Les variables han de ser declarades abans d'utilitzar-se
- Java és un llenguatge tipat, cal especificar el tipus de cada variable
- Els noms de variables han de començar amb lletra minúscula (convenció camelCase)
- No confondre `=` (assignació) amb `==` (comparació)

💡 **Consell**: Utilitzar noms de variables descriptius que reflecteixin el seu propòsit.
