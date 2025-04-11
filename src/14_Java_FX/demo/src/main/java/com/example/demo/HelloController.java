package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    public int iterator = 0;

    @FXML
    protected void onHelloButtonClick() {
        iterator++;

        if (iterator == 1)  {welcomeText.setText("Welcome to JavaFX Application!");}
        else {welcomeText.setText("Still here? Go to the f..g gym!");}
    }
}