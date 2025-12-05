# 04 - Java Condicionals

## Introducció

Aquesta carpeta conté exemples sobre les estructures condicionals en Java. Els condicionals permeten que els programes prenguin decisions i executin diferents blocs de codi segons les condicions.

## Conceptes

### Sentència `if`
Executa un bloc de codi si la condició és certa:
```java
if (edat >= 18) {
    System.out.println("És major d'edat");
}
```

### Sentència `if-else`
Executa un bloc o un altre segons la condició:
```java
if (nota >= 5) {
    System.out.println("Aprovat");
} else {
    System.out.println("Suspès");
}
```

### Sentència `if-else if-else`
Avalua múltiples condicions en seqüència:
```java
if (nota >= 9) {
    System.out.println("Excel·lent");
} else if (nota >= 7) {
    System.out.println("Notable");
} else if (nota >= 5) {
    System.out.println("Aprovat");
} else {
    System.out.println("Suspès");
}
```

### Operador Ternari
Forma compacta d'if-else per assignacions:
```java
String resultat = (nota >= 5) ? "Aprovat" : "Suspès";
```

### Sentència `switch`
Avalua una variable contra múltiples casos:
```java
switch (dia) {
    case 1:
        System.out.println("Dilluns");
        break;
    case 2:
        System.out.println("Dimarts");
        break;
    default:
        System.out.println("Altre dia");
}
```

### Condicionals Niats
Condicionals dins d'altres condicionals:
```java
if (edat >= 18) {
    if (teCarnet) {
        System.out.println("Pot conduir");
    }
}
```

## Bones Pràctiques

- Utilitzar claus `{}` sempre, fins i tot per blocs d'una línia
- Mantenir les condicions simples i llegibles
- Evitar niuar massa condicionals (màxim 2-3 nivells)
- Utilitzar `switch` quan hi ha múltiples casos per la mateixa variable
- Ordenar les condicions de més probable a menys probable

## Errors Comuns

⚠️ **Atenció**:
- No confondre `=` (assignació) amb `==` (comparació)
- Recordar el `break` en cada cas del `switch`
- Tenir en compte la precedència dels operadors lògics
- Validar que les condicions siguin expressions booleanes

## Exemples Pràctics

Els condicionals s'utilitzen per:
- Validar entrada de l'usuari
- Classificar dades (notes, edats, etc.)
- Controlar el flux del programa
- Gestionar errors i excepcions
- Implementar menús i opcions

## Notes Importants

💡 **Consells**:
- Utilitzar noms descriptius per a les variables booleanes
- Simplificar condicions complexes amb variables auxiliars
- Considerar l'ús de `switch` per múltiples casos
- Provar tots els camins possibles (testing)

📚 **Recursos**:
- El fitxer `readme.md` en aquesta carpeta conté més detalls i exemples
