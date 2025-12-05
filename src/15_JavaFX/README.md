# 15 - JavaFX

## Introducció

Aquesta carpeta conté exemples de codi per aprendre a desenvolupar interfícies gràfiques modernes amb JavaFX. JavaFX és una plataforma de programari per crear aplicacions d'escriptori amb interfícies gràfiques riques i modernes.

## Conceptes

### Què és JavaFX?
- Plataforma moderna per a interfícies gràfiques
- Successor de Swing
- Suport per a CSS per estilitzar components
- Animacions i efectes visuals
- Multimedia i gràfics 2D/3D

### Components Principals de JavaFX

#### Stage i Scene
- **Stage**: Finestra principal de l'aplicació
- **Scene**: Contenidor del contingut visual
- **Scene Graph**: Jerarquia de nodes visuals

#### Layouts
- `VBox`: Organització vertical
- `HBox`: Organització horitzontal
- `BorderPane`: Organització en regions (top, bottom, left, right, center)
- `GridPane`: Organització en graella
- `StackPane`: Apilament de components

#### Controls
- `Button`: Botons interactius
- `Label`: Etiquetes de text
- `TextField`: Camps d'entrada de text
- `TextArea`: Àrea de text multilínia
- `ComboBox`: Llista desplegable
- `CheckBox`: Caselles de verificació
- `RadioButton`: Botons d'opció

### Gestió d'Esdeveniments
- Event handlers
- Lambda expressions per gestionar esdeveniments
- Esdeveniments de ratolí i teclat

### Estilització amb CSS
- Aplicar estils a components
- Crear temes personalitzats
- Classes d'estil

## Exemples

### JavaFX_Bobardino
Exemple que demostra:
- Creació d'una aplicació JavaFX completa
- Utilització de diferents layouts
- Controls i components interactius
- Gestió d'esdeveniments
- Aplicació pràctica dels conceptes de JavaFX

## Estructura d'una Aplicació JavaFX

```java
public class MevaAplicacio extends Application {
    @Override
    public void start(Stage primaryStage) {
        // Configuració de la interfície
        // Creació de Scene
        // Configuració del Stage
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
```

## Configuració de JavaFX

### Requisits
- JDK 11 o superior
- JavaFX SDK descarregat i configurat
- Variables d'entorn configurades
- IDE amb suport per JavaFX (IntelliJ IDEA, Eclipse, NetBeans)

## Avantatges de JavaFX

- Interfícies modernes i atractives
- Separació entre lògica i presentació (FXML)
- Suport per CSS
- Animacions i transicions fluides
- Multiplataforma (Windows, macOS, Linux)
- Comunitat activa i documentació completa

## Notes Importants

💡 **Consells**: 
- Començar amb exemples simples i anar augmentant la complexitat
- Utilitzar Scene Builder per dissenyar interfícies visualment
- Aprendre CSS per personalitzar l'aparença
- Separar la lògica de negoci de la presentació
- Consultar la documentació oficial de JavaFX

⚠️ **Atenció**: 
- JavaFX no s'inclou per defecte des de JDK 11, cal descarregar-lo per separat
- Configurar correctament el classpath i module-path
- Alguns IDE necessiten configuració addicional per JavaFX
