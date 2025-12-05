# 11_04 - BucleInfinito

## Introducció

Aquest exemple mostra com monitoritzar canvis en fitxers de forma contínua, utilitzant bucles infinits controlats per llegir fitxers repetidament.

## Conceptes

### Bucle de Monitorització
```java
while (true) {
    // Llegir fitxer
    // Processar dades
    // Esperar un temps
    Thread.sleep(1000); // 1 segon
}
```

### Control de Bucles Infinits
- Utilitzar una variable de control
- `break` per sortir del bucle
- Gestió d'interrupcions

## Exemples

Aquest exemple demostra:
- Lectura contínua de fitxers
- Bucles infinits controlats
- Esperes entre lectures
- Detecció de canvis

## Notes Importants

⚠️ **Atenció**:
- Sempre proporcionar forma de sortir del bucle
- Gestionar excepcions dins del bucle
- No saturar el sistema amb lectures constants
