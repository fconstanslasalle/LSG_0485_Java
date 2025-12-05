# 09_06 - Sistema de Notes

## Introducció

Aquest exemple mostra com crear un sistema de gestió de notes utilitzant mètodes. Inclou càlcul de mitjanes, classificació de notes i generació d'estadístiques.

## Conceptes

### Mètodes de Càlcul

#### Calcular Mitjana
```java
public double calcularMitjana(double[] notes) {
    double suma = 0;
    for (double nota : notes) {
        suma += nota;
    }
    return suma / notes.length;
}
```

#### Trobar Nota Màxima/Mínima
```java
public double trobarMaxim(double[] notes) {
    double max = notes[0];
    for (double nota : notes) {
        if (nota > max) max = nota;
    }
    return max;
}
```

### Classificació de Notes
```java
public String classificarNota(double nota) {
    if (nota >= 9) return "Excel·lent";
    else if (nota >= 7) return "Notable";
    else if (nota >= 5) return "Aprovat";
    else return "Suspès";
}
```

### Mètodes d'Estadístiques
```java
public int comptarAprovats(double[] notes) {
    int comptador = 0;
    for (double nota : notes) {
        if (nota >= 5) comptador++;
    }
    return comptador;
}
```

## Exemples

Aquest exemple demostra:
- Mètodes per processar arrays
- Càlculs estadístics (mitjana, màxim, mínim)
- Mètodes de classificació
- Comptatge d'elements que compleixen condicions
- Combinació de diversos mètodes
- Generació d'informes

## Funcionalitats

1. **Introduir notes**: Llegir notes dels estudiants
2. **Calcular mitjana**: Mitjana aritmètica de les notes
3. **Trobar màxim i mínim**: Notes més alta i més baixa
4. **Classificar**: Assignar qualificacions textuals
5. **Comptar**: Aprovats, suspesos, excel·lents, etc.
6. **Generar informe**: Resum complet de les estadístiques

## Notes Importants

💡 **Consells**:
- Crear mètodes reutilitzables per càlculs comuns
- Separar lògica de càlcul de la presentació
- Validar que l'array no estigui buit

⚠️ **Atenció**:
- Gestionar divisió per zero en mitjanes
- Validar rang de notes (0-10)
- Comprovar que hi ha notes abans de processar
