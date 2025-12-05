# 08_03 - ArrayList Operacions Bàsiques

## Introducció

Aquest exemple mostra les operacions fonamentals amb ArrayList, una col·lecció dinàmica que permet emmagatzemar elements de forma flexible.

## Conceptes

### Què és un ArrayList?
- Col·lecció de mida dinàmica
- Part del framework Collections
- Pot créixer o reduir-se segons necessitat
- Només pot contenir objectes (no tipus primitius)

### Importació
```java
import java.util.ArrayList;
```

### Creació
```java
ArrayList<String> llista = new ArrayList<>();
ArrayList<Integer> nombres = new ArrayList<>();
```

### Operacions Bàsiques

#### Afegir Elements
```java
llista.add("Poma");           // Afegir al final
llista.add(0, "Pera");        // Afegir en posició específica
```

#### Accedir a Elements
```java
String element = llista.get(0);      // Obtenir element
int mida = llista.size();            // Obtenir mida
```

#### Modificar Elements
```java
llista.set(1, "Plàtan");     // Canviar element en posició 1
```

#### Eliminar Elements
```java
llista.remove(0);            // Eliminar per índex
llista.remove("Poma");       // Eliminar per valor
llista.clear();              // Eliminar tots
```

#### Comprovar Existència
```java
boolean conte = llista.contains("Poma");
boolean buit = llista.isEmpty();
```

### Recorregut
```java
// For clàssic
for (int i = 0; i < llista.size(); i++) {
    System.out.println(llista.get(i));
}

// For-each
for (String element : llista) {
    System.out.println(element);
}
```

## Exemples

Aquest exemple demostra:
- Crear un ArrayList
- Afegir elements amb `add`
- Accedir a elements amb `get`
- Modificar elements amb `set`
- Eliminar elements amb `remove`
- Obtenir la mida amb `size`
- Comprovar existència amb `contains`
- Recórrer amb bucles

## ArrayList vs Array

| Característica | Array | ArrayList |
|----------------|-------|-----------|
| Mida | Fixa | Dinàmica |
| Tipus | Primitius i objectes | Només objectes |
| Sintaxi | `array[i]` | `list.get(i)` |
| Mètodes | Pocs | Molts |

## Notes Importants

💡 **Consells**:
- Per enters, utilitzar `ArrayList<Integer>`, no `int`
- Utilitzar generics `<>` per especificar el tipus
- Preferir ArrayList quan la mida pot variar

⚠️ **Atenció**:
- `get(index)` pot llançar `IndexOutOfBoundsException`
- ArrayList no pot contenir tipus primitius directament
- Els índexs comencen a 0
