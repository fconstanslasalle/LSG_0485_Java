# 09_02 - Màquina de Bitllets

## Introducció

Aquest exemple simula una màquina de bitllets (ATM) utilitzant mètodes per organitzar les diferents operacions bancàries. Demostra com descomposar un problema complex en mètodes més simples i manejables.

## Conceptes

### Descomposició en Mètodes
- **Menú principal**: Mostrar opcions
- **Consultar saldo**: Retornar el saldo actual
- **Ingressar diners**: Afegir al saldo
- **Retirar diners**: Restar del saldo
- **Validacions**: Comprovar saldo suficient

### Gestió d'Estat
```java
private double saldo = 1000.0;  // Variable d'estat

public double consultarSaldo() {
    return saldo;
}

public void ingressar(double quantitat) {
    if (quantitat > 0) {
        saldo += quantitat;
    }
}
```

### Validacions
```java
public boolean retirar(double quantitat) {
    if (quantitat > saldo) {
        System.out.println("Saldo insuficient");
        return false;
    }
    saldo -= quantitat;
    return true;
}
```

## Exemples

Aquest exemple demostra:
- Organització d'una aplicació amb múltiples funcionalitats
- Mètodes per a cada operació bancària
- Gestió de variables d'estat (saldo)
- Validacions (saldo suficient, quantitats positives)
- Menú interactiu amb bucle
- Control de flux amb condicionals i retorns boolearis

## Operacions Disponibles

1. **Consultar saldo**: Mostrar el saldo actual
2. **Ingressar diners**: Afegir una quantitat al saldo
3. **Retirar diners**: Restar una quantitat del saldo
4. **Sortir**: Finalitzar el programa

## Notes Importants

💡 **Consells**:
- Cada operació és un mètode independent
- Validar totes les transaccions
- Proporcionar feedback clar a l'usuari
- Mantenir l'estat consistent

⚠️ **Atenció**:
- Comprovar saldo abans de retirar
- Validar que les quantitats siguin positives
- Gestionar errors d'entrada
