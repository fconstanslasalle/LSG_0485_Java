# 09_05 - Taules de Multiplicar

## Introducció

Aquest exemple mostra com generar taules de multiplicar utilitzant mètodes amb bucles. Demostra la combinació de mètodes, bucles i format de sortida.

## Conceptes

### Mètode per Generar Taula
```java
public void mostrarTaula(int numero) {
    System.out.println("Taula del " + numero + ":");
    for (int i = 1; i <= 10; i++) {
        int resultat = numero * i;
        System.out.println(numero + " x " + i + " = " + resultat);
    }
}
```

### Mètode amb Rang Personalitzat
```java
public void mostrarTaulaRang(int numero, int inici, int fi) {
    for (int i = inici; i <= fi; i++) {
        System.out.println(numero + " x " + i + " = " + (numero * i));
    }
}
```

### Format de Sortida
```java
System.out.printf("%d x %2d = %3d%n", numero, i, resultat);
```

## Exemples

Aquest exemple demostra:
- Mètodes amb bucles
- Paràmetres per personalitzar comportament
- Format de sortida alineat
- Generació de taules completes
- Validació de rangs

## Notes Importants

💡 **Consells**:
- Utilitzar `printf` per alinear columnes
- Parametritzar el rang per flexibilitat
- Crear mètodes reutilitzables

⚠️ **Atenció**:
- Validar que inici < fi
- Gestionar nombres negatius si cal
