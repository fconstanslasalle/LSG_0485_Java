# 08_04 - ArrayList Cerca i Operacions

## Introducció

Aquest exemple mostra operacions avançades amb ArrayList, incloent cerca d'elements, ordenació i altres operacions útils.

## Conceptes

### Cerca d'Elements

#### indexOf i lastIndexOf
```java
ArrayList<String> llista = new ArrayList<>();
int posicio = llista.indexOf("element");      // Primera aparició
int ultima = llista.lastIndexOf("element");   // Última aparició
// Retorna -1 si no es troba
```

### Ordenació
```java
import java.util.Collections;

Collections.sort(llista);           // Ordre natural (ascendent)
Collections.sort(llista, Collections.reverseOrder());  // Descendent
```

### Trobar Màxim i Mínim
```java
Integer max = Collections.max(nombres);
Integer min = Collections.min(nombres);
```

### Comptar Ocurrències
```java
int comptador = Collections.frequency(llista, "element");
```

### Revertir l'Ordre
```java
Collections.reverse(llista);
```

### Barrejar Elements
```java
Collections.shuffle(llista);
```

## Exemples

Aquest exemple demostra:
- Cercar elements amb `indexOf` i `lastIndexOf`
- Ordenar ArrayList amb `Collections.sort`
- Trobar màxim i mínim
- Compt ar ocurrències d'un element
- Revertir l'ordre dels elements
- Comprovar si està buit amb `isEmpty`
- Obtenir subl listes amb `subList`

## Notes Importants

💡 **Consells**:
- Utilitzar `Collections` per operacions avançades
- Per ordenar objectes personalitzats, implementar `Comparable`
- Preferir `Collections.frequency` en lloc de bucles manuals

⚠️ **Atenció**:
- L'ArrayList ha d'estar ordenat per a cerca binària
- `sort` modifica l'ArrayList original
