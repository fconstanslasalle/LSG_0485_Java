# 09_03 - Conversió de Temperatures

## Introducció

Aquest exemple mostra com crear mètodes per convertir entre diferents unitats de temperatura (Celsius, Fahrenheit, Kelvin). Demostra l'ús de fórmules matemàtiques dins de mètodes.

## Conceptes

### Mètodes de Conversió

#### Celsius a Fahrenheit
```java
public double celsiusAFahrenheit(double celsius) {
    return (celsius * 9/5) + 32;
}
```

#### Fahrenheit a Celsius
```java
public double fahrenheitACelsius(double fahrenheit) {
    return (fahrenheit - 32) * 5/9;
}
```

#### Celsius a Kelvin
```java
public double celsiusAKelvin(double celsius) {
    return celsius + 273.15;
}
```

### Fórmules de Conversió
- **C → F**: F = (C × 9/5) + 32
- **F → C**: C = (F - 32) × 5/9
- **C → K**: K = C + 273.15
- **K → C**: C = K - 273.15

## Exemples

Aquest exemple demostra:
- Mètodes amb càlculs matemàtics
- Tipus de retorn `double` per decimals
- Aplicació de fórmules de conversió
- Entrada i sortida de dades
- Format de sortida amb decimals

## Notes Importants

💡 **Consells**:
- Utilitzar `double` per temperatures (no `int`)
- Arrodonir resultats si cal amb `Math.round()` o `printf`
- Validar temperatures lògiques (Kelvin >= 0)

⚠️ **Atenció**:
- Ordre d'operacions en les fórmules
- Divisió entera vs divisió decimal (9/5 vs 9.0/5.0)
