# 12 - Java Exceptions

## Introducció

Aquesta carpeta conté exemples de codi per aprendre a treballar amb excepcions en Java. Les excepcions són esdeveniments que ocorren durant l'execució d'un programa i que interrompen el flux normal d'instruccions. La gestió adequada d'excepcions és crucial per crear aplicacions robustes i fiables.

## Conceptes

### Què són les Excepcions?
- Errors en temps d'execució
- Diferència entre errors i excepcions
- Jerarquia d'excepcions en Java
- Excepcions checked vs unchecked

### Gestió d'Excepcions
- Bloc `try-catch`
- Bloc `finally`
- Instrucció `throw` per llançar excepcions
- Clàusula `throws` en la signatura de mètodes
- Try-with-resources per gestionar recursos

### Tipus d'Excepcions Comunes
- `NullPointerException`
- `ArrayIndexOutOfBoundsException`
- `NumberFormatException`
- `IOException`
- `FileNotFoundException`
- `ArithmeticException`

### Bones Pràctiques
- Capturar excepcions específiques abans que les genèriques
- No capturar excepcions que no es poden gestionar
- Proporcionar missatges d'error clars
- Alliberar recursos en el bloc `finally`
- Crear excepcions personalitzades quan sigui necessari

## Exemples

### 11_01 - Caixer Automàtic
Exemple que demostra:
- Gestió d'excepcions en una aplicació real
- Validació d'entrada de l'usuari
- Excepcions personalitzades per errors bancaris
- Control de saldo insuficient
- Gestió d'operacions bancàries amb try-catch

### 11_02 - DemoExceptions
Exemple que demostra:
- Tipus bàsics d'excepcions
- Estructura try-catch-finally
- Captura d'excepcions múltiples
- Llançament d'excepcions amb `throw`
- Propagació d'excepcions amb `throws`
- Exemples pràctics de diferents tipus d'errors

## Avantatges de la Gestió d'Excepcions

- **Separació de codi**: El codi de gestió d'errors està separat del codi normal
- **Propagació d'errors**: Els errors es poden propagar cap amunt en la pila de crides
- **Agrupació**: Es poden agrupar tipus d'errors similars
- **Robustesa**: L'aplicació pot recuperar-se d'errors i continuar executant-se

## Notes Importants

⚠️ **Atenció**: 
- No utilitzar excepcions per controlar el flux normal del programa
- Sempre proporcionar informació útil en els missatges d'error
- No capturar `Exception` de forma genèrica sense motiu
- Documentar les excepcions que pot llançar un mètode
