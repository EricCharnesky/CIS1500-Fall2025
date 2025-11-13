package com.example.multipagedemo;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class SecondPage
{
    @javafx.fxml.FXML
    private Button clickMeButton;
    @javafx.fxml.FXML
    private Label label;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void clickMeButtonClicked(ActionEvent actionEvent) {
        try{
            Stage stage = (Stage) clickMeButton.getScene().getWindow();
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 600, 400);
            stage.setScene(scene);
        }
        catch (IOException ex){
            label.setText("IO Exception");
        }
    }
}