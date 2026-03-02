# 10_02 - Fibonacci

## Introducció

Aquest exemple mostra com calcular la seqüència de Fibonacci de forma recursiva. La seqüència de Fibonacci és un exemple clàssic on un problema es pot descompondre en dos subproblemes més petits.

## Conceptes

### Definició de la Seqüència de Fibonacci
- La seqüència comença: `0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ...`
- Cada nombre és la suma dels dos anteriors
- `Fibonacci(0) = 0`, `Fibonacci(1) = 1`

### Estructura Recursiva
```java
public static long calcularFibonacci(int n) {
    // Cas base
    if (n == 0) return 0;
    if (n == 1) return 1;
    // Cas recursiu (dues crides recursives!)
    return calcularFibonacci(n - 1) + calcularFibonacci(n - 2);
}
```

### Dos Casos Base
A diferència del factorial, Fibonacci té **dos casos base**:
- `Fibonacci(0) = 0`
- `Fibonacci(1) = 1`

### Pila de Crides (Call Stack)
Quan es crida `calcularFibonacci(4)`:
```
calcularFibonacci(4)
  → calcularFibonacci(3) + calcularFibonacci(2)
       → (calcularFibonacci(2) + calcularFibonacci(1)) + (calcularFibonacci(1) + calcularFibonacci(0))
            → ((calcularFibonacci(1) + calcularFibonacci(0)) + 1) + (1 + 0)
                 → ((1 + 0) + 1) + 1
                 → 3
```
Resultat: `Fibonacci(4) = 3`

## Exemples

Aquest exemple demostra:
- Implementació d'un mètode recursiu amb dos casos base
- Cas recursiu amb dues crides recursives
- Visualització de la seqüència completa fins a una posició

## Notes Importants

💡 **Consells**:
- Fibonacci recursiu és senzill d'entendre però ineficient per a valors grans
- Cada crida genera dues noves crides, el cost és exponencial O(2^n)
- Per a valors grans, és recomanable usar un enfocament iteratiu o memoization

⚠️ **Atenció**:
- Per a posicions > 40, el temps de càlcul es fa molt elevat
- Valors superiors a 92 desbordaran el tipus `long`
