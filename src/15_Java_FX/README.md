# 15 - Java FX (JavaFX)

## Introducció

Aquesta carpeta conté exemples de codi per aprendre a desenvolupar interfícies gràfiques modernes amb JavaFX. JavaFX és una plataforma de programari per crear aplicacions d'escriptori amb interfícies gràfiques riques i modernes, successor de Swing.

## Conceptes

### Què és JavaFX?
- Plataforma moderna per a interfícies gràfiques d'usuari
- Successor de Swing i AWT
- Suport natiu per a CSS per estilitzar components
- Animacions i efectes visuals avançats
- Suport per multimedia, gràfics 2D i 3D

### Components Principals de JavaFX

#### Stage i Scene
- **Stage**: Representa la finestra principal de l'aplicació
- **Scene**: Contenidor del contingut visual que es mostra a l'Stage
- **Scene Graph**: Estructura jeràrquica de nodes visuals

#### Layouts Comuns
- `VBox`: Organització vertical de components
- `HBox`: Organització horitzontal de components
- `BorderPane`: Divisió en cinc regions (top, bottom, left, right, center)
- `GridPane`: Organització en format de graella o taula
- `StackPane`: Apilament de components un sobre l'altre
- `FlowPane`: Organització fluida amb wrap automàtic

#### Controls i Components
- `Button`: Botons clicables
- `Label`: Etiquetes de text estàtic
- `TextField`: Camps d'entrada de text d'una línia
- `TextArea`: Àrea de text multilínia
- `ComboBox`: Llista desplegable d'opcions
- `CheckBox`: Caselles de selecció múltiple
- `RadioButton`: Botons d'opció exclusius
- `ListView`: Llista d'elements seleccionables
- `TableView`: Taula de dades
- `MenuBar`: Barra de menús

### Gestió d'Esdeveniments
- Event handlers per respondre a accions de l'usuari
- Lambda expressions per simplificar el codi
- Esdeveniments de ratolí, teclat i altres dispositius
- `EventHandler` i `ActionEvent`

### FXML
- Llenguatge XML per definir interfícies
- Separació entre disseny i lògica
- Scene Builder per disseny visual
- Controllers per gestionar la lògica

### Estilització amb CSS
- Aplicar estils personalitzats als components
- Crear temes i aparences personalitzades
- Selectors i classes d'estil
- Transicions i animacions amb CSS

## Exemples

### HelloWorld
Exemple que demostra:
- Estructura bàsica d'una aplicació JavaFX
- Creació d'una finestra simple
- Afegir components bàsics
- Primer contacte amb JavaFX

### JavaFX_Bobardino
Exemple que demostra:
- Aplicació JavaFX completa
- Utilització de diferents layouts
- Controls i components interactius
- Gestió d'esdeveniments
- Aplicació pràctica i completa

### demo
Exemple que demostra:
- Funcionalitats addicionals de JavaFX
- Exemples de components específics
- Tècniques avançades
- Bones pràctiques

## Estructura d'una Aplicació JavaFX

```java
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;

public class MevaAplicacio extends Application {
    @Override
    public void start(Stage primaryStage) {
        // Crear components
        VBox root = new VBox();
        
        // Crear l'escena
        Scene scene = new Scene(root, 400, 300);
        
        // Configurar l'stage
        primaryStage.setTitle("La Meva Aplicació");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
```

## Configuració de JavaFX

### Requisits
- **JDK**: Versió 11 o superior
- **JavaFX SDK**: Descarregat i configurat (des de JDK 11, JavaFX és separat)
- **IDE**: IntelliJ IDEA, Eclipse o NetBeans amb suport per JavaFX
- **Variables d'entorn**: PATH i CLASSPATH configurats correctament

### Configuració en IntelliJ IDEA
1. Descarregar JavaFX SDK
2. Afegir la llibreria al projecte (File > Project Structure > Libraries)
3. Configurar VM options: `--module-path "ruta/a/javafx-sdk/lib" --add-modules javafx.controls,javafx.fxml`

## Avantatges de JavaFX

- **Interfícies modernes**: Disseny atractiu i actual
- **CSS**: Estilització fàcil i flexible
- **FXML**: Separació entre disseny i lògica
- **Animacions**: Transicions i efectes fluids
- **Multiplataforma**: Funciona en Windows, macOS i Linux
- **Rich Media**: Suport per vídeo, àudio i gràfics avançats
- **Scene Builder**: Eina visual per dissenyar interfícies

## Notes Importants

💡 **Consells**: 
- Començar amb exemples simples (HelloWorld)
- Utilitzar Scene Builder per aprendre els components visualment
- Aprendre CSS per personalitzar l'aparença
- Separar sempre la lògica de negoci de la interfície
- Consultar la documentació oficial: [https://openjfx.io/](https://openjfx.io/)

⚠️ **Atenció**: 
- Des de JDK 11, JavaFX ja no s'inclou per defecte i cal descarregar-lo per separat
- Cal configurar correctament el `module-path` i `add-modules`
- Alguns IDE necessiten configuració addicional per funcionar amb JavaFX
- Assegurar-se que la versió de JavaFX coincideix amb la versió de JDK

## Recursos Addicionals

- **Documentació oficial**: [https://openjfx.io/](https://openjfx.io/)
- **JavaFX API**: [https://openjfx.io/javadoc/17/](https://openjfx.io/javadoc/17/)
- **Scene Builder**: [https://gluonhq.com/products/scene-builder/](https://gluonhq.com/products/scene-builder/)
- **Tutorials**: [https://docs.oracle.com/javafx/2/get_started/jfxpub-get_started.htm](https://docs.oracle.com/javafx/2/get_started/jfxpub-get_started.htm)
