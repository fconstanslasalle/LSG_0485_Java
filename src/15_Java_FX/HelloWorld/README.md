# HelloWorld JavaFX

## Introducció

Aquest és l'exemple més bàsic d'una aplicació JavaFX. És el punt de partida per aprendre a crear interfícies gràfiques amb JavaFX.

## Conceptes

### Aplicació Mínima
```java
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class HelloWorld extends Application {
    @Override
    public void start(Stage primaryStage) {
        Label label = new Label("Hello, World!");
        StackPane root = new StackPane(label);
        Scene scene = new Scene(root, 300, 200);
        
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
```

## Exemples

Aquest exemple demostra:
- Estructura mínima d'una aplicació JavaFX
- Creació d'un Stage i Scene
- Afegir un component simple (Label)
- Mostrar la finestra

## Notes Importants

💡 **Consells**:
- Començar sempre per aquest exemple
- Comprendre cada línia abans de continuar
- Experimentar canviant valors i components
