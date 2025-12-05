# 06_01 - Arrays Operacions Bàsiques

## Introducció

Aquest exemple mostra les operacions fonamentals amb arrays en Java. Els arrays són estructures de dades que permeten emmagatzemar múltiples valors del mateix tipus en una sola variable.

## Conceptes

### Què és un Array?
- Estructura de dades que emmagatzema múltiples elements del mateix tipus
- Mida fixa definida en la creació
- Els elements s'accedeixen per índex (començant per 0)
- Emmagatzemat de forma contigua en memòria

### Declaració i Inicialització

#### Declaració amb mida
```java
int[] nombres = new int[5]; // Array de 5 enters (inicialitzat a 0)
```

#### Declaració amb valors
```java
int[] nombres = {10, 20, 30, 40, 50};
String[] dies = {"Dilluns", "Dimarts", "Dimecres"};
```

### Operacions Bàsiques

#### Accedir a Elements
```java
int primerElement = nombres[0]; // Primer element (índex 0)
int ultimElement = nombres[nombres.length - 1]; // Últim element
```

#### Modificar Elements
```java
nombres[2] = 100; // Canviar el tercer element
```

#### Recórrer un Array
```java
// Bucle for clàssic
for (int i = 0; i < nombres.length; i++) {
    System.out.println(nombres[i]);
}

// For-each (només lectura)
for (int num : nombres) {
    System.out.println(num);
}
```

#### Propietat length
```java
int mida = nombres.length; // Retorna el nombre d'elements
```

### Operacions Comunes
- Suma de tots els elements
- Trobar el màxim o mínim
- Calcular la mitjana
- Cercar un element específic
- Comptar ocurrències

## Exemples

Aquest exemple demostra:
- Declarar un array d'enters buit
- Emplenar l'array amb dades de l'usuari
- Recórrer l'array amb bucle for
- Accedir a elements per índex
- Modificar elements de l'array
- Calcular la suma dels elements
- Utilitzar la propietat `length`
- Treballar amb array de Strings inicialitzat

## Exemple de Codi

```java
Scanner lector = new Scanner(System.in);

// Declarar i inicialitzar
int[] nombres = new int[5];

// Emplenar l'array
System.out.println("Introdueix 5 nombres:");
for (int i = 0; i < nombres.length; i++) {
    System.out.print("Nombre " + (i + 1) + ": ");
    nombres[i] = lector.nextInt();
}

// Mostrar l'array
System.out.println("\n--- Array Original ---");
for (int i = 0; i < nombres.length; i++) {
    System.out.println("Posició " + i + ": " + nombres[i]);
}

// Calcular suma
int suma = 0;
for (int i = 0; i < nombres.length; i++) {
    suma += nombres[i];
}
System.out.println("Suma total: " + suma);

// Array de Strings
String[] dies = {"Dilluns", "Dimarts", "Dimecres", "Dijous", "Divendres"};
for (String dia : dies) {
    System.out.println(dia);
}
```

## Notes Importants

⚠️ **Atenció**:
- Els índexs van de 0 a `length - 1`
- Accedir a un índex fora de rang genera `ArrayIndexOutOfBoundsException`
- La mida de l'array és fixa, no es pot canviar després de crear-lo
- Els arrays d'objectes s'inicialitzen a `null`, els d'enters a 0, els de booleans a false

💡 **Consells**:
- Utilitzar `length` per iterar, no valors literals
- Validar índexs abans d'accedir als elements
- Preferir for-each quan només es necessita llegir valors
