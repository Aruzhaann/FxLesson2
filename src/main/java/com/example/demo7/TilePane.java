package com.example.demo7;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;

public class TilePane extends Application{

    public static void main(String[] args) {

        Application.launch(args);
    }

    @Override
    public void start(Stage stage) {

        Button first = new Button("First");
        Button second = new Button("Second");
        Button third = new Button("Third");
        Button fourth = new Button("Fourth");
        Button fifth = new Button("Fifth");
        Button sixth = new Button("Sixth");

        javafx.scene.layout.TilePane tilepane = new javafx.scene.layout.TilePane(first, second, third, fourth, fifth, sixth);

        Scene scene = new Scene(tilepane, 300, 200);
        stage.setScene(scene);

        stage.setTitle("TilePane in JavaFX");

        stage.show();
    }
}