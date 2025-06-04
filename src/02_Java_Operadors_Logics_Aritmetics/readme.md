# Operadors Aritmètics i Lògics a Java

A Java, els operadors són símbols especials que realitzen operacions sobre operands (valors o variables). En aquest document, ens centrarem en dos grups fonamentals d'operadors: els aritmètics i els lògics.

## 1. Operadors Aritmètics

Els operadors aritmètics s'utilitzen per realitzar càlculs matemàtics comuns.

| Operador | Nom                | Descripció                                                                 | Exemple (`int a = 10; int b = 3;`) | Resultat de l'exemple |
| :------- | :----------------- | :------------------------------------------------------------------------- | :---------------------------------- | :---------------------- |
| `+`      | Addició            | Suma dos operands.                                                         | `int suma = a + b;`                 | `13`                    |
| `-`      | Sostracció         | Resta el segon operand del primer.                                         | `int resta = a - b;`                | `7`                     |
| `*`      | Multiplicació      | Multiplica dos operands.                                                   | `int producte = a * b;`             | `30`                    |
| `/`      | Divisió            | Divideix el primer operand pel segon. Si tots dos són enters, el resultat és la part entera de la divisió. | `int divisio = a / b;`              | `3`                     |
| `%`      | Mòdul (Residu)     | Retorna el residu de la divisió del primer operand pel segon.             | `int residu = a % b;`               | `1`                     |
| `++`     | Increment          | Augmenta el valor d'un operand en 1. Pot ser pre-increment (`++a`) o post-increment (`a++`). | `a++;` (ara `a` val 11)             | `a` esdevé `11`         |
| `--`     | Decrement          | Disminueix el valor d'un operand en 1. Pot ser pre-decrement (`--a`) o post-decrement (`a--`). | `b--;` (ara `b` val 2)              | `b` esdevé `2`          |

## 2. Operadors Lògics a Java 🚦

Els operadors lògics a Java s'utilitzen per realitzar operacions sobre valors booleans (`true` o `false`). Són fonamentals per construir expressions condicionals complexes i controlar el flux d'execució en els programes.

Els principals operadors lògics són:

1.  **AND Lògic (`&&`)**
2.  **OR Lògic (`||`)**
3.  **NOT Lògic (`!`)**

---
## 1. AND Lògic (`&&`)

L'operador `&&` retorna `true` si **ambdós** operands són `true`. Si el primer operand és `false`, el segon operand no s'avalua (això es coneix com a **avaluació en curtcircuit**).

| Operand1 | Operand2 | Resultat (`Operand1 && Operand2`) |
| :------- | :------- | :-------------------------------- |
| `true`   | `true`   | `true`                            |
| `true`   | `false`  | `false`                           |
| `false`  | `true`   | `false` (Operand2 no s'avalua)    |
| `false`  | `false`  | `false` (Operand2 no s'avalua)    |

### Exemple amb `&&`:

```java
public class OperadorAND {
    public static void main(String[] args) {
        int edat = 25;
        boolean teCarnetConduir = true;
        boolean potLlogarCotxe = (edat >= 21) && teCarnetConduir;
        //                         (true)    &&      (true)       -> true
        System.out.println("Pot llogar un cotxe? " + potLlogarCotxe); // true

        edat = 19;
        potLlogarCotxe = (edat >= 21) && teCarnetConduir;
        //                      (false)   &&      (true)        -> false (teCarnetConduir no es comprova necessàriament)
        System.out.println("Pot llogar un cotxe (19 anys)? " + potLlogarCotxe); // false

        // Demostració del curtcircuit
        int x = 5;
        // Com que (x == 0) és false, la segona part (x++ > 2) no s'executa
        boolean resultatCurtCircuit = (x == 0) && (x++ > 2);
        System.out.println("Resultat del curtcircuit AND: " + resultatCurtCircuit); // false
        System.out.println("Valor de x després de &&: " + x); // x segueix sent 5, no s'ha incrementat
    }
}
```

### Exemples d'Operadors Aritmètics:

```java
public class OperadorsAritmetics {
    public static void main(String[] args) {
        int num1 = 100;
        int num2 = 25;
        double numReal1 = 10.5;
        double numReal2 = 2.5;

        // Addició
        int suma = num1 + num2; // suma és 125
        System.out.println("Suma (int): " + num1 + " + " + num2 + " = " + suma);

        double sumaReals = numReal1 + numReal2; // sumaReals és 13.0
        System.out.println("Suma (double): " + numReal1 + " + " + numReal2 + " = " + sumaReals);

        // Sostracció
        int resta = num1 - num2; // resta és 75
        System.out.println("Resta: " + num1 + " - " + num2 + " = " + resta);

        // Multiplicació
        int producte = num1 * num2; // producte és 2500
        System.out.println("Producte: " + num1 + " * " + num2 + " = " + producte);

        // Divisió (enters)
        int divisioEnters = num1 / num2; // divisioEnters és 4
        System.out.println("Divisió (enters): " + num1 + " / " + num2 + " = " + divisioEnters);

        int divisioInexacta = 10 / 3; // divisioInexacta és 3 (la part decimal es trunca)
        System.out.println("Divisió (enters, inexacta): 10 / 3 = " + divisioInexacta);

        // Divisió (amb almenys un double per obtenir decimals)
        double divisioReals = numReal1 / numReal2; // divisioReals és 4.2
        System.out.println("Divisió (reals): " + numReal1 + " / " + numReal2 + " = " + divisioReals);
        double divisioMixta = (double)num1 / num2; // divisioMixta és 4.0 (cal fer un "cast" a double)
        System.out.println("Divisió (mixta): (double)" + num1 + " / " + num2 + " = " + divisioMixta);


        // Mòdul (Residu)
        int residu1 = num1 % num2; // residu1 és 0 (100 dividit per 25 dona 4 amb residu 0)
        System.out.println("Mòdul: " + num1 + " % " + num2 + " = " + residu1);

        int residu2 = 10 % 3; // residu2 és 1 (10 dividit per 3 dona 3 amb residu 1)
        System.out.println("Mòdul: 10 % 3 = " + residu2);

        // Increment
        int comptador = 5;
        comptador++; // comptador ara és 6 (post-increment)
        System.out.println("Post-increment: comptador = " + comptador);
        ++comptador; // comptador ara és 7 (pre-increment)
        System.out.println("Pre-increment: comptador = " + comptador);

        int x = 3;
        int y = ++x; // x s'incrementa a 4, i després s'assigna a y. x=4, y=4
        System.out.println("Pre-increment amb assignació: x=" + x + ", y=" + y);

        int z = 3;
        int w = z++; // z s'assigna a w (w=3), i després z s'incrementa a 4. z=4, w=3
        System.out.println("Post-increment amb assignació: z=" + z + ", w=" + w);


        // Decrement
        int enrere = 10;
        enrere--; // enrere ara és 9 (post-decrement)
        System.out.println("Post-decrement: enrere = " + enrere);
        --enrere; // enrere ara és 8 (pre-decrement)
        System.out.println("Pre-decrement: enrere = " + enrere);
    }
}


