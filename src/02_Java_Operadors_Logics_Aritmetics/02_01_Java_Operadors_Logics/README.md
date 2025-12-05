# 02_01 - Java Operadors Lògics

## Introducció

Aquest exemple mostra com utilitzar els operadors lògics en Java. Els operadors lògics permeten combinar expressions booleanes per crear condicions més complexes, fonamentals per al control de flux del programa.

## Conceptes

### Operadors Lògics Principals

#### AND Lògic (`&&`)
- Retorna `true` només si **ambdues** condicions són certes
- Avaluació en curtcircuit: si la primera condició és `false`, no avalua la segona

```java
boolean resultat = (edat >= 18) && (teCarnet == true);
```

#### OR Lògic (`||`)
- Retorna `true` si **almenys una** de les condicions és certa
- Avaluació en curtcircuit: si la primera condició és `true`, no avalua la segona

```java
boolean potEntrar = (esVIP == true) || (teEntrada == true);
```

#### NOT Lògic (`!`)
- Inverteix el valor booleà
- Converteix `true` en `false` i viceversa

```java
boolean noEsAdult = !(edat >= 18);
```

### Taules de Veritat

**AND (`&&`)**:
| A | B | A && B |
|---|---|--------|
| true | true | true |
| true | false | false |
| false | true | false |
| false | false | false |

**OR (`||`)**:
| A | B | A \|\| B |
|---|---|--------|
| true | true | true |
| true | false | true |
| false | true | true |
| false | false | false |

**NOT (`!`)**:
| A | !A |
|---|---|
| true | false |
| false | true |

### Operadors de Comparació (Relacionals)
- `==`: Igual a
- `!=`: Diferent de
- `>`: Major que
- `<`: Menor que
- `>=`: Major o igual que
- `<=`: Menor o igual que

### Precedència d'Operadors
1. `!` (NOT)
2. `&&` (AND)
3. `||` (OR)

Es poden utilitzar parèntesis per canviar l'ordre d'avaluació.

## Exemples

Aquest exemple demostra:
- Utilització de l'operador AND (`&&`)
- Utilització de l'operador OR (`||`)
- Utilització de l'operador NOT (`!`)
- Combinació de diversos operadors lògics
- Avaluació en curtcircuit
- Aplicació pràctica en condicions

## Notes Importants

💡 **Consells**:
- Utilitzar parèntesis per fer les expressions més clares
- Aprofitar l'avaluació en curtcircuit per optimitzar el codi
- No confondre `&` i `|` (operadors binaris) amb `&&` i `||` (operadors lògics)

⚠️ **Atenció**:
- L'operador `==` compara valors, per a Strings utilitzar `.equals()`
- Tenir en compte la precedència dels operadors
