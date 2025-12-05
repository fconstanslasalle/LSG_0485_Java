# 11_01 - Caixer Automàtic

## Introducció

Aquest exemple implementa un caixer automàtic amb gestió completa d'excepcions. Demostra com utilitzar excepcions per gestionar errors en operacions bancàries.

## Conceptes

### Excepcions Personalitzades
```java
class SaldoInsuficientException extends Exception {
    public SaldoInsuficientException(String missatge) {
        super(missatge);
    }
}
```

### Llançar Excepcions
```java
public void retirar(double quantitat) throws SaldoInsuficientException {
    if (quantitat > saldo) {
        throw new SaldoInsuficientException("Saldo insuficient");
    }
    saldo -= quantitat;
}
```

### Capturar Excepcions
```java
try {
    compte.retirar(500);
} catch (SaldoInsuficientException e) {
    System.out.println(e.getMessage());
}
```

## Exemples

Aquest exemple demostra:
- Creació d'excepcions personalitzades
- Llançament d'excepcions amb `throw`
- Captura d'excepcions amb try-catch
- Gestió d'errors en operacions bancàries
- Validacions amb excepcions

## Notes Importants

💡 **Consells**:
- Crear excepcions personalitzades per errors específics
- Proporcionar missatges descriptius
- Gestionar cada tipus d'excepció adequadament

⚠️ **Atenció**:
- Declarar excepcions amb `throws`
- No capturar excepcions que no es poden gestionar
