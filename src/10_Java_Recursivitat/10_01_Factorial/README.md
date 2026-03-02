# 10_01 - Factorial

## Introducció

Aquest exemple mostra com calcular el factorial d'un nombre de forma recursiva. És un dels exemples clàssics per entendre el concepte de recursivitat.

## Conceptes

### Definició de Factorial
- El factorial de `n` (escrit com `n!`) és el producte de tots els enters positius fins a `n`
- Exemple: `5! = 5 × 4 × 3 × 2 × 1 = 120`
- Per convenció: `0! = 1`

### Estructura Recursiva
```java
public static long calcularFactorial(int n) {
    // Cas base
    if (n <= 1) {
        return 1;
    }
    // Cas recursiu
    return n * calcularFactorial(n - 1);
}
```

### Cas Base i Cas Recursiu
- **Cas base**: `n <= 1` → retorna `1` (atura la recursivitat)
- **Cas recursiu**: `n! = n * (n-1)!` (crida al mateix mètode amb `n-1`)

### Pila de Crides (Call Stack)
Quan es crida `calcularFactorial(4)`:
```
calcularFactorial(4)
  → 4 * calcularFactorial(3)
       → 3 * calcularFactorial(2)
            → 2 * calcularFactorial(1)
                 → retorna 1
            → retorna 2 * 1 = 2
       → retorna 3 * 2 = 6
  → retorna 4 * 6 = 24
```

## Exemples

Aquest exemple demostra:
- Implementació d'un mètode recursiu
- Definició del cas base per aturar la recursivitat
- Definició del cas recursiu
- Progressió cap al cas base (n decreix en cada crida)

## Notes Importants

💡 **Consells**:
- Sempre definir el cas base abans del cas recursiu
- Assegurar-se que cada crida s'apropa al cas base
- Usar `long` per evitar desbordaments amb nombres grans

⚠️ **Atenció**:
- El factorial creix molt ràpidament (20! ja supera el límit de `long`)
- No s'accepten nombres negatius
