# 09_07 - Demo Mètodes Hello World

## Introducció

Aquest exemple introdueix els mètodes en Java amb un cas senzill de salutació. Demostra com descompondre un problema en mètodes petits i reutilitzables.

## Conceptes

### Mètodes amb Retorn
```java
public static String demanarNom() {
    // Llegeix i retorna el nom de l'usuari
    return nomPersona;
}
```

### Mètodes void
```java
private static void ferSalutacio(String nom) {
    System.out.println("Hola " + nom);
}
```

### Validació dins d'un Mètode
- Ús d'un bucle `do-while` per validar l'entrada
- Retorn del valor quan és correcte

## Exemples

Aquest exemple demostra:
- Separació de responsabilitats en mètodes
- Mètode que retorna un `String`
- Mètode `void` que imprimeix per pantalla
- Validació d'entrada dins d'un mètode

## Notes Importants

💡 **Consells**:
- Cada mètode ha de tenir una única responsabilitat
- Noms descriptius en català per als mètodes
- Validar sempre les dades d'entrada

⚠️ **Atenció**:
- Tancar el `Scanner` quan no es necessiti més
