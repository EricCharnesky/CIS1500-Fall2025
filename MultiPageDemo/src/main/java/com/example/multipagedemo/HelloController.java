package com.example.multipagedemo;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML
    private Button helloButton;

    @FXML
    protected void onHelloButtonClick() {
        try{
            Stage stage = (Stage) helloButton.getScene().getWindow();
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("second-page.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 600, 400);
            stage.setScene(scene);
        }
        catch (IOException ex){
            welcomeText.setText("IO Exception");
        }

    }
}