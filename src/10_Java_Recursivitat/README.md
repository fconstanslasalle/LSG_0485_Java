# 10 - Java Recursivitat

## Introducció

Aquesta carpeta conté exemples de codi per aprendre a treballar amb la recursivitat en Java. La recursivitat és una tècnica de programació on un mètode es crida a si mateix per resoldre un problema dividint-lo en subproblemes més petits.

## Conceptes

### Recursivitat
- Definició de recursivitat
- Cas base i cas recursiu
- Pila de crides (call stack)
- Avantatges i desavantatges de la recursivitat

### Característiques d'un Mètode Recursiu
- **Cas base**: Condició que atura la recursivitat
- **Cas recursiu**: Crida al mateix mètode amb un problema reduït
- **Progressió cap al cas base**: Cada crida recursiva ha d'apropar-se al cas base

### Exemples Clàssics de Recursivitat
- Factorial d'un nombre
- Seqüència de Fibonacci
- Torres de Hanoi
- Recorregut d'arbres
- Cerca binària
- Ordenació (quicksort, mergesort)

## Exemples

### Aplicacions de la Recursivitat
- Càlculs matemàtics
- Recorregut d'estructures de dades
- Resolució de problemes complexos
- Algorismes de cerca i ordenació

### Recursivitat vs Iteració
- Comparació entre solucions recursives i iteratives
- Quan utilitzar recursivitat
- Consideracions de rendiment i memòria

## Notes Importants

⚠️ **Atenció**: La recursivitat pot consumir molta memòria si no es controla adequadament. És important assegurar-se que:
- Hi ha un cas base ben definit
- Cada crida recursiva s'apropa al cas base
- Es controlen els casos límit per evitar desbordaments de pila (stack overflow)
