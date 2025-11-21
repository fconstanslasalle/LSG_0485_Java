package org.example.javafx_bobardino;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("TRALALERO TRALALA\n" + "BOMBARDINO COCODRILO");
    }
}