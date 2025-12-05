# 07_01 - Matrius Operacions Bàsiques

## Introducció

Aquest exemple mostra com treballar amb matrius (arrays bidimensionals) en Java. Les matrius són estructures de dades que permeten emmagatzemar informació en format de taula amb files i columnes.

## Conceptes

### Què és una Matriu?
- Array bidimensional (array d'arrays)
- Estructura amb files i columnes
- Accés mitjançant dos índexs: `matriu[fila][columna]`
- Útil per representar taules, graelles, mapes, etc.

### Declaració i Inicialització

#### Declaració amb mida
```java
int[][] matriu = new int[3][4]; // 3 files, 4 columnes
```

#### Declaració amb valors
```java
int[][] matriu = {
    {1, 2, 3, 4},
    {5, 6, 7, 8},
    {9, 10, 11, 12}
};
```

### Accedir a Elements
```java
int element = matriu[1][2]; // Element fila 1, columna 2
matriu[0][0] = 100; // Modificar primer element
```

### Dimensions d'una Matriu
```java
int numFiles = matriu.length;           // Nombre de files
int numColumnes = matriu[0].length;     // Nombre de columnes
```

### Recorregut de Matrius

#### Bucles niats (for)
```java
for (int i = 0; i < matriu.length; i++) {
    for (int j = 0; j < matriu[i].length; j++) {
        System.out.print(matriu[i][j] + " ");
    }
    System.out.println();
}
```

#### For-each niat
```java
for (int[] fila : matriu) {
    for (int element : fila) {
        System.out.print(element + " ");
    }
    System.out.println();
}
```

## Exemples

Aquest exemple demostra:
- Declarar una matriu buida
- Inicialitzar una matriu amb valors
- Accedir a elements específics
- Modificar elements de la matriu
- Recórrer tota la matriu amb bucles niats
- Mostrar la matriu en format de taula
- Calcular la suma de tots els elements

## Exemple de Codi

```java
// Crear matriu
int[][] matriu = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};

// Mostrar matriu
System.out.println("Matriu:");
for (int i = 0; i < matriu.length; i++) {
    for (int j = 0; j < matriu[i].length; j++) {
        System.out.print(matriu[i][j] + "\t");
    }
    System.out.println();
}

// Suma de tots els elements
int suma = 0;
for (int i = 0; i < matriu.length; i++) {
    for (int j = 0; j < matriu[i].length; j++) {
        suma += matriu[i][j];
    }
}
System.out.println("Suma total: " + suma);
```

## Notes Importants

⚠️ **Atenció**:
- Els índexs comencen a 0
- Primer índex = fila, segon índex = columna
- Cuidar amb `ArrayIndexOutOfBoundsException`
- Les matrius poden tenir files de diferent longitud (jagged arrays)

💡 **Consells**:
- Utilitzar `\t` per alinear la sortida en format de taula
- Sempre comprovar les dimensions abans d'accedir
- Els bucles niats són essencials per treballar amb matrius
