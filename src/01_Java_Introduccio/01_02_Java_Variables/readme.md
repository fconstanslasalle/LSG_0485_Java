
# Tipus de Variables a Java

A Java, les variables són contenidors que emmagatzemen valors de dades durant l'execució d'un programa. Cada variable ha de ser declarada amb un tipus de dada específic, que determina la mida i el tipus de valors que pot emmagatzemar. Podem classificar les variables a Java principalment en dos grans grups: **tipus primitius** i **tipus objecte (o no primitius)**.

## 1. Tipus Primitius (Primitive Types)

Els tipus primitius són els blocs de construcció bàsics de les dades a Java. Són predefinits pel llenguatge i s'anomenen amb paraules clau reservades. Hi ha 8 tipus primitius:

### a. Tipus Enters

Aquests tipus s'utilitzen per emmagatzemar nombres enters (sense decimals). Es diferencien per la mida de memòria que ocupen i, per tant, pel rang de valors que poden representar.

* **`byte`**:
    * Mida: 8 bits
    * Rang: de -128 a 127
    * Ús: Quan l'estalvi de memòria és important i el valor està dins del rang.
    * Exemple:
        ```java
        byte edat = 25;
        byte temperaturaExterior = -5;
        ```

* **`short`**:
    * Mida: 16 bits
    * Rang: de -32,768 a 32,767
    * Ús: Menys comú, però útil si `byte` és massa petit i `int` massa gran per a les necessitats de memòria.
    * Exemple:
        ```java
        short anyFabricacio = 2023;
        short nombreAlumnes = 1500;
        ```

* **`int`** (Integer):
    * Mida: 32 bits
    * Rang: de -2,147,483,648 a 2,147,483,647 (aproximadament ±2 mil milions)
    * Ús: És el tipus enter per defecte i el més utilitzat per a valors numèrics sense decimals.
    * Exemple:
        ```java
        int puntuacio = 100000;
        int nombreHabitants = 7500000;
        ```

* **`long`**:
    * Mida: 64 bits
    * Rang: de -9,223,372,036,854,775,808 a 9,223,372,036,854,775,807 (aproximadament ±9 trilions)
    * Ús: Quan es necessiten nombres enters molt grans que excedeixen el rang d'un `int`. Els literals `long` han de finalitzar amb una `L` o `l`.
    * Exemple:
        ```java
        long distanciaEstrellaAnysLlum = 100000000000L;
        long tempsEnMiliseconds = System.currentTimeMillis();
        ```

### b. Tipus de Coma Flotant (Floating-Point Types)

Aquests tipus s'utilitzen per emmagatzemar nombres amb part decimal.

* **`float`**:
    * Mida: 32 bits (precisió simple)
    * Rang: Aproximadament ±3.40282347E+38F (amb 6-7 dígits decimals de precisió)
    * Ús: Quan es necessiten nombres decimals i la precisió no és extremadament crítica, o per estalviar memòria en grans arrays de nombres decimals. Els literals `float` han de finalitzar amb una `f` o `F`.
    * Exemple:
        ```java
        float preuProducte = 19.99f;
        float piAproximat = 3.14159F;
        ```

* **`double`**:
    * Mida: 64 bits (precisió doble)
    * Rang: Aproximadament ±1.79769313486231570E+308 (amb ~15 dígits decimals de precisió)
    * Ús: És el tipus per defecte per a valors decimals i el més utilitzat per a una major precisió.
    * Exemple:
        ```java
        double alturaMetres = 1.75;
        double constantGravitacional = 6.67430e-11; // Notació científica
        ```

### c. Tipus Caràcter

* **`char`**:
    * Mida: 16 bits (Unicode)
    * Rang: de 0 a 65,535 (representa caràcters Unicode)
    * Ús: Per emmagatzemar un únic caràcter. Els literals de caràcter s'escriuen entre cometes simples (`' '`).
    * Exemple:
        ```java
        char inicial = 'J';
        char simbolEuro = '€';
        char lletraA = '\u0041'; // També es pot utilitzar la representació Unicode
        ```

### d. Tipus Booleà

* **`boolean`**:
    * Mida: Depèn de la JVM (normalment 1 bit, però pot ocupar més per alineació)
    * Valors: `true` o `false`
    * Ús: Per emmagatzemar valors lògics, típicament utilitzats en expressions condicionals i bucles.
    * Exemple:
        ```java
        boolean esActiu = true;
        boolean tePermis = false;
        boolean esMajorDEdat = (edat >= 18); // edat és una variable int prèviament definida
        ```

## 2. Tipus Objecten (Reference Types / Non-Primitive Types)

Els tipus de referència no emmagatzemen directament el valor en la variable, sinó una referència (o adreça de memòria) a la ubicació on es troba l'objecte real. Els objectes són instàncies de classes.

* **Característiques:**
    * Poden ser utilitzats per cridar mètodes per realitzar certes operacions.
    * Poden tenir un valor `null`, que significa que no fan referència a cap objecte.
    * Inclouen **Classes**, **Interfícies**, **Arrays** i **Enumeracions (Enums)**.
    * Els noms de les classes comencen amb majúscula per convenció.

### a. Classes

Les classes són plantilles per crear objectes. Java té moltes classes predefinides (com `String`, `System`, `ArrayList`) i pots crear les teves pròpies.

* **`String`**:
    * Tot i que sembla un tipus primitiu per la seva facilitat d'ús, `String` és una classe a Java (del paquet `java.lang`).
    * S'utilitza per emmagatzemar seqüències de caràcters (text).
    * Els literals de `String` s'escriuen entre cometes dobles (`" "`).
    * Exemple:
        ```java
        String nom = "Joan";
        String missatge = "Hola, món!";
        String salutacio = new String("Bon dia"); // També es pot crear explícitament un objecte String
        ```

* **Objectes de Classes Personalitzades**:
    * Pots definir les teves pròpies classes per modelar entitats del món real o conceptes abstractes.
    * Exemple (suposant que tenim una classe `Gos`):
        ```java
        // Definició simple de la classe Gos (en un altre fitxer o dins la mateixa classe si és interna)
        // class Gos {
        //     String nomRaca;
        //     int edat;
        //     void bordar() {
        //         System.out.println("Bup, bup!");
        //     }
        // }

        Gos elMeuGos = new Gos(); // Creació d'un objecte (instància) de la classe Gos
        elMeuGos.nomRaca = "Labrador";
        elMeuGos.edat = 3;
        // elMeuGos.bordar(); // Crida a un mètode de l'objecte
        ```

### b. Arrays (Matrius)

Els arrays són objectes contenidors que emmagatzemen un nombre fix d'elements del mateix tipus de dada. La mida d'un array es defineix en el moment de la seva creació i no pot canviar.

* Exemple:
    ```java
    // Array d'enters
    int[] nombres = new int[5]; // Declara i crea un array de 5 enters
    nombres[0] = 10;
    nombres[1] = 20;
    // ...

    // Array de Strings inicialitzat directament
    String[] diesSetmana = {"dilluns", "dimarts", "dimecres", "dijous", "divendres", "dissabte", "diumenge"};

    // Array d'objectes Gos
    // Gos[] gossada = new Gos[3];
    // gossada[0] = new Gos();
    // gossada[1] = new Gos();
    ```

### c. Interfícies

Les interfícies són un tipus de referència que defineixen un contracte de mètodes que una classe pot implementar. Una variable de tipus interfície pot referenciar qualsevol objecte d'una classe que implementi aquesta interfície.

* Exemple (suposant una interfície `Animal` i una classe `Gat` que la implementa):
    ```java
    // interface Animal {
    //     void ferSo();
    // }
    // class Gat implements Animal {
    //     public void ferSo() {
    //         System.out.println("Mèu!");
    //     }
    // }

    // Animal elMeuAnimal = new Gat();
    // elMeuAnimal.ferSo();
    ```

## Resum de Diferències Clau

| Característica         | Tipus Primitius                            | Tipus de Referència                         |
| :--------------------- | :----------------------------------------- | :------------------------------------------ |
| **Emmagatzematge** | Valor directe                              | Adreça de memòria (referència a l'objecte) |
| **Valor per defecte** | 0, 0.0, '\u0000', `false` (depèn del tipus) | `null`                                      |
| **Mida** | Fixa i predefinida                         | Variable (depèn de l'objecte)               |
| **Manipulació** | Directa                                    | A través de mètodes (generalment)           |
| **Comportament** | Emmagatzemen dades simples                 | Poden tenir mètodes i atributs complexos    |
| **Nomenclatura** | Paraules clau en minúscula (`int`, `char`) | Comencen amb majúscula per convenció (`String`, `Gos`) |

Entendre la distinció entre tipus primitius i tipus de referència és fonamental per programar correctament a Java, especialment pel que fa a la gestió de memòria i el pas de paràmetres a mètodes.