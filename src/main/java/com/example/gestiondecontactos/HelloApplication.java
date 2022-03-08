package com.example.gestiondecontactos;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Locale spanish= new Locale("es","ES");
        Locale english= new Locale("en","UK");

        ResourceBundle rBSpanish = ResourceBundle.getBundle("strings/strings",spanish);
        ResourceBundle rBEnglish = ResourceBundle.getBundle("strings/strings",english);
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("main_view.fxml"),rBSpanish);
        Scene scene = new Scene(fxmlLoader.load(), 400, 720);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}