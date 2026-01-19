# 13_03 - JavaPolimorfisme

## Introducció

Aquest exemple mostra el concepte de **polimorfisme** en Java, un dels principis fonamentals de la Programació Orientada a Objectes. El polimorfisme permet que objectes de diferents classes siguin tractats de manera uniforme a través d'una interfície comuna.

## Conceptes

### Polimorfisme
El polimorfisme és la capacitat d'un objecte de prendre moltes formes. En Java, això significa que una referència de tipus superclasse pot apuntar a objectes de qualsevol de les seves subclasses.

```java
FiguraGeometrica figura = new Cercle(5.0);
figura.calcularArea(); // Crida al mètode de Cercle
```

### Tipus de Polimorfisme

#### 1. Polimorfisme en Temps de Compilació (Sobrecàrrega)
Diversos mètodes amb el mateix nom però diferents paràmetres:
```java
public double calcularArea(double radi) { ... }
public double calcularArea(double base, double altura) { ... }
```

#### 2. Polimorfisme en Temps d'Execució (Sobreescriptura)
Les subclasses proporcionen implementacions específiques de mètodes de la superclasse:
```java
@Override
public double calcularArea() {
    return Math.PI * radi * radi;
}
```

### Avantatges del Polimorfisme
- **Flexibilitat**: Permet escriure codi més genèric
- **Extensibilitat**: Facilita afegir noves classes sense modificar codi existent
- **Mantenibilitat**: Redueix la duplicació de codi

## Exemples

Aquest exemple demostra:
- Creació d'una jerarquia de figures geomètriques
- Polimorfisme amb diferents tipus de figures (Cercle, Rectangle, Triangle)
- Sobrecàrrega de mètodes
- Sobreescriptura de mètodes amb comportaments específics
- Utilització d'arrays de tipus superclasse per gestionar múltiples objectes
- Càlcul polimòrfic d'àrees i perímetres

## Notes Importants

💡 **Consells**:
- El polimorfisme requereix herència o implementació d'interfícies
- Els mètodes polimòrfics s'han de declarar a la classe pare
- Utilitzar `@Override` per assegurar la correcta sobreescriptura
- El tipus de la variable determina quins mètodes es poden cridar
- El tipus de l'objecte determina quin mètode s'executa
