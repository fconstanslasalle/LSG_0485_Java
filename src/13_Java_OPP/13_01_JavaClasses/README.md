# 13_01 - JavaClasses

## Introducció

Aquest exemple mostra els fonaments de la Programació Orientada a Objectes en Java, incloent la creació de classes, objectes, encapsulació i utilització de constructors.

## Conceptes

### Creació d'una Classe
```java
public class Persona {
    // Atributs
    private String nom;
    private int edat;
    
    // Constructor
    public Persona(String nom, int edat) {
        this.nom = nom;
        this.edat = edat;
    }
    
    // Getters i Setters
    public String getNom() {
        return nom;
    }
    
    public void setNom(String nom) {
        this.nom = nom;
    }
    
    // Mètodes
    public void presentar() {
        System.out.println("Hola, sóc " + nom);
    }
}
```

### Creació d'Objectes
```java
Persona p1 = new Persona("Joan", 25);
p1.presentar();
```

## Exemples

Aquest exemple demostra:
- Definició de classes
- Atributs privats (encapsulació)
- Constructors
- Getters i setters
- Mètodes d'instància
- Creació i utilització d'objectes

## Notes Importants

💡 **Consells**:
- Utilitzar encapsulació (private + getters/setters)
- Noms de classes en UpperCamelCase
- Un fitxer per classe pública
