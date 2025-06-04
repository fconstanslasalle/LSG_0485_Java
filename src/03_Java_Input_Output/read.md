

# 📘 Implementació d'Input i Output en Java

En aquest document s'explica com es pot gestionar l'entrada (input) i la sortida (output) en Java, tant des de consola com mitjançant fitxers.

## ✍️ Entrada de dades (Input)

Java ofereix diverses formes per llegir dades de l'usuari o de fonts externes. La més comuna per a entrada per consola és la classe `Scanner`.

### 🔹 Entrada per consola amb `Scanner`

```java
import java.util.Scanner;

public class ExempleInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introdueix el teu nom: ");
        String nom = sc.nextLine();

        System.out.print("Introdueix la teva edat: ");
        int edat = sc.nextInt();

        System.out.println("Hola " + nom + ", tens " + edat + " anys.");

        sc.close();
    }
}
```

### 📌 Notes:
- `nextLine()` llegeix una línia sencera de text.
- `nextInt()`, `nextDouble()`, etc., llegeixen números.


## 📤 Sortida de dades (Output)

Java permet escriure sortides tant per consola com per fitxer.

### 🔹 Sortida per consola amb `System.out`

```java
public class ExempleOutput {
    public static void main(String[] args) {
        String missatge = "Hola món!";
        System.out.println(missatge);
    }
}
```

## ✅ Resum

| Mètode          | Classe                 | Tipus           |
|----------------|------------------------|------------------|
| `Scanner`       | `java.util.Scanner`    | Input            |
| `System.out`    | `java.lang.System`     | Output consola   |
| `PrintWriter`   | `java.io.PrintWriter`  | Output fitxer    |
| `File`          | `java.io.File`         | Input fitxer     |

## 📚 Recursos recomanats
- [Documentació oficial de Java](https://docs.oracle.com/en/java/)
- Llibre: *"Head First Java"*