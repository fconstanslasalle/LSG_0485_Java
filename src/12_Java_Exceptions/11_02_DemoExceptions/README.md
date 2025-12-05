# 11_02 - DemoExceptions

## Introducció

Aquest exemple mostra els diferents tipus d'excepcions en Java i com gestionar-les. És una demostració educativa dels conceptes bàsics de gestió d'errors.

## Conceptes

### Try-Catch-Finally
```java
try {
    // Codi que pot generar excepcions
} catch (ExceptionType1 e) {
    // Gestionar ExceptionType1
} catch (ExceptionType2 e) {
    // Gestionar ExceptionType2
} finally {
    // Sempre s'executa
}
```

### Excepcions Comunes
```java
// NullPointerException
String text = null;
text.length();  // Error!

// ArrayIndexOutOfBoundsException
int[] array = new int[5];
int value = array[10];  // Error!

// NumberFormatException
int num = Integer.parseInt("abc");  // Error!
```

## Exemples

Aquest exemple demostra:
- Diferents tipus d'excepcions
- Try-catch bàsic
- Try-catch-finally
- Múltiples catch
- Jerarquia d'excepcions

## Notes Importants

💡 **Consells**:
- Capturar excepcions específiques primer
- Utilitzar `finally` per alliberar recursos
- No capturar Exception genèric sense motiu
