# 09_01 - Calculadora

## Introducció

Aquest exemple mostra com crear una calculadora utilitzant mètodes per organitzar el codi. Cada operació aritmètica es defineix com un mètode independent, demostrant la reutilització i modularitat del codi.

## Conceptes

### Estructura amb Mètodes
```java
public int suma(int a, int b) {
    return a + b;
}

public int resta(int a, int b) {
    return a - b;
}
```

### Paràmetres i Retorn
- **Paràmetres**: Valors d'entrada del mètode
- **Tipus de retorn**: Tipus de dada que retorna el mètode
- **`void`**: Quan no retorna cap valor

### Validació en Mètodes
```java
public int divisio(int a, int b) {
    if (b == 0) {
        System.out.println("Error: Divisió per zero");
        return 0;
    }
    return a / b;
}
```

### Mètodes Auxiliars
```java
private boolean comprovarZero(int n) {
    return n == 0;
}
```

## Exemples

Aquest exemple demostra:
- Mètodes per operacions bàsiques (suma, resta, multiplicació, divisió)
- Mètodes amb paràmetres i valor de retorn
- Validació d'entrada (divisió per zero)
- Mètode per llegir enters amb validació
- Utilització d'un menú amb `switch`
- Organització del codi amb mètodes

## Estructura del Programa

1. **Mètode `main`**: Punt d'entrada
2. **Mètode `init`**: Lògica principal
3. **Mètodes d'operacions**: suma, resta, multiplicacio, divisio
4. **Mètodes auxiliars**: comprovarZero, llegirInt

## Notes Importants

💡 **Consells**:
- Cada mètode ha de tenir una responsabilitat clara
- Noms descriptius per als mètodes
- Validar sempre les dades d'entrada
- Separar la lògica en mètodes facilita el manteniment

⚠️ **Atenció**:
- Gestionar la divisió per zero
- Validar que l'entrada sigui del tipus esperat
- Tancar el Scanner adequadament
