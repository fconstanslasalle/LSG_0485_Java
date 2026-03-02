# 09_08 - Demo Mètodes Bàsics

## Introducció

Aquest exemple mostra l'ús bàsic de mètodes `void` en Java. Demostra com cridar mètodes en funció d'una condició i com passar paràmetres primitius.

## Conceptes

### Mètodes void sense Paràmetres
```java
public static void salutacio() {
    System.out.println("Hello World");
}
```

### Mètodes void amb Paràmetres
```java
public static void despertador(boolean horaLlevarse) {
    if (horaLlevarse) {
        // ...
    }
}
```

### Crida Condicional a Mètodes
- Ús d'un `if-else` per decidir quin mètode cridar
- Pas de valors booleans com a paràmetres

## Exemples

Aquest exemple demostra:
- Declaració de mètodes `void`
- Mètodes amb i sense paràmetres
- Crida de mètodes des del `main`
- Ús de condicions per seleccionar el mètode a executar

## Notes Importants

💡 **Consells**:
- Els mètodes `void` no retornen cap valor
- Noms descriptius per als mètodes en català
- Separa les responsabilitats en mètodes independents
