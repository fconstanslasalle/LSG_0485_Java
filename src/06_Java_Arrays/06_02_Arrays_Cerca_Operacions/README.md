# 06_02 - Arrays Cerca i Operacions

## Introducció

Aquest exemple mostra operacions més avançades amb arrays, centrant-se en algoritmes de cerca i càlculs estadístics bàsics. Aquestes operacions són fonamentals per processar col·leccions de dades.

## Conceptes

### Cerca Lineal
- Recórrer l'array element per element
- Comparar cada element amb el valor cercat
- Retornar l'índex si es troba, -1 si no existeix

```java
int cercarElement(int[] array, int valor) {
    for (int i = 0; i < array.length; i++) {
        if (array[i] == valor) {
            return i; // Retorna l'índex
        }
    }
    return -1; // No trobat
}
```

### Trobar Màxim i Mínim
```java
int trobarMaxim(int[] array) {
    int max = array[0];
    for (int i = 1; i < array.length; i++) {
        if (array[i] > max) {
            max = array[i];
        }
    }
    return max;
}
```

### Calcular la Mitjana
```java
double calcularMitjana(int[] array) {
    int suma = 0;
    for (int element : array) {
        suma += element;
    }
    return (double) suma / array.length;
}
```

### Compt ar Ocurrències
```java
int comptarOcurrencies(int[] array, int valor) {
    int comptador = 0;
    for (int element : array) {
        if (element == valor) {
            comptador++;
        }
    }
    return comptador;
}
```

### Operacions Estadístiques
- **Suma**: Acumular tots els elements
- **Mitjana**: Suma dividida pel nombre d'elements
- **Màxim**: Element més gran
- **Mínim**: Element més petit
- **Rang**: Diferència entre màxim i mínim

## Exemples

Aquest exemple demostra:
- Cerca lineal d'un element específic
- Trobar el valor màxim de l'array
- Trobar el valor mínim de l'array
- Calcular la mitjana dels elements
- Compt ar quantes vegades apareix un valor
- Determinar si un element existeix a l'array
- Trobar la posició d'un element

## Exemple de Codi

```java
int[] nombres = {15, 7, 23, 45, 7, 12, 7, 30};

// Cerca lineal
int valorCercat = 23;
int posicio = -1;
for (int i = 0; i < nombres.length; i++) {
    if (nombres[i] == valorCercat) {
        posicio = i;
        break;
    }
}
if (posicio != -1) {
    System.out.println("Trobat a la posició: " + posicio);
} else {
    System.out.println("No trobat");
}

// Trobar màxim
int max = nombres[0];
for (int i = 1; i < nombres.length; i++) {
    if (nombres[i] > max) {
        max = nombres[i];
    }
}
System.out.println("Valor màxim: " + max);

// Calcular mitjana
int suma = 0;
for (int num : nombres) {
    suma += num;
}
double mitjana = (double) suma / nombres.length;
System.out.println("Mitjana: " + mitjana);

// Comptar ocurrències
int valorComptar = 7;
int comptador = 0;
for (int num : nombres) {
    if (num == valorComptar) {
        comptador++;
    }
}
System.out.println("El " + valorComptar + " apareix " + comptador + " vegades");
```

## Algoritmes de Cerca

### Cerca Lineal
- **Complexitat**: O(n)
- **Avantatge**: Funciona amb arrays ordenats i desordenats
- **Desavantatge**: Pot ser lent per arrays grans

### Cerca Binària (per arrays ordenats)
- **Complexitat**: O(log n)
- **Avantatge**: Molt més ràpid per arrays grans
- **Desavantatge**: Requereix que l'array estigui ordenat

## Notes Importants

💡 **Consells**:
- Validar que l'array no estigui buit abans de cercar
- Utilitzar `break` per sortir del bucle quan es troba l'element
- Per a arrays grans, considerar ordenar primer i utilitzar cerca binària
- Gestionar adequadament el cas en què l'element no es troba

⚠️ **Atenció**:
- Comprovar que l'array tingui almenys un element abans d'accedir a `array[0]`
- Fer cast a `double` quan calgui per evitar divisió entera
- Tenir en compte que la cerca lineal és O(n), pot ser lenta per arrays grans
