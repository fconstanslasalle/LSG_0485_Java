# 08_05 - String i ArrayList Combinat

## Introducció

Aquest exemple integra els conceptes de Strings i ArrayList per crear aplicacions més complexes que processen col·leccions de text.

## Conceptes

### Conversió entre Array i ArrayList
```java
// Array a ArrayList
String[] array = {"a", "b", "c"};
ArrayList<String> llista = new ArrayList<>(Arrays.asList(array));

// ArrayList a Array
String[] nouArray = llista.toArray(new String[0]);
```

### Processar Llistes de Text
```java
ArrayList<String> noms = new ArrayList<>();
// Afegir, modificar, cercar noms
```

### Split i Join
```java
// Split: String a ArrayList
String text = "poma,pera,plàtan";
String[] parts = text.split(",");
ArrayList<String> fruites = new ArrayList<>(Arrays.asList(parts));

// Join: ArrayList a String
String juntat = String.join(", ", llista);
```

### Filtrar Elements
```java
ArrayList<String> filtrats = new ArrayList<>();
for (String element : llista) {
    if (element.length() > 5) {
        filtrats.add(element);
    }
}
```

## Exemples

Aquest exemple demostra:
- Crear un ArrayList de Strings
- Processar i manipular text en llistes
- Cercar i filtrar elements
- Convertir entre diferents formats
- Combinar operacions de String i ArrayList
- Aplicació pràctica dels conceptes apresos

## Notes Importants

💡 **Consells**:
- Combinar els mètodes de String amb ArrayList per processar text
- Utilitzar `split` i `join` per conversions
- Considerar expressions regulars per cerca complexa

⚠️ **Atenció**:
- No oblidar importar `java.util.ArrayList` i `java.util.Arrays`
- Gestionar casos on la llista pot estar buida
