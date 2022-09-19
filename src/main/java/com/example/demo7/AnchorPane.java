package com.example.demo7;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;

public class AnchorPane extends Application{

    public static void main(String[] args) {

        Application.launch(args);
    }

    @Override
    public void start(Stage stage) {

        Button topBtn = new Button("Top");
        javafx.scene.layout.AnchorPane.setTopAnchor(topBtn, 10.0);
        javafx.scene.layout.AnchorPane.setLeftAnchor(topBtn, 60.0);
        javafx.scene.layout.AnchorPane.setRightAnchor(topBtn, 60.0);

        Button bottomBtn = new Button("Bottom");
        javafx.scene.layout.AnchorPane.setBottomAnchor(bottomBtn, 10.0);
        javafx.scene.layout.AnchorPane.setLeftAnchor(bottomBtn, 60.0);
        javafx.scene.layout.AnchorPane.setRightAnchor(bottomBtn, 60.0);

        Button leftBtn = new Button("Left");
        javafx.scene.layout.AnchorPane.setTopAnchor(leftBtn, 30.0);
        javafx.scene.layout.AnchorPane.setLeftAnchor(leftBtn, 15.0);
        javafx.scene.layout.AnchorPane.setBottomAnchor(leftBtn, 30.0);

        Button rightBtn = new Button("Right");
        javafx.scene.layout.AnchorPane.setTopAnchor(rightBtn, 30.0);
        javafx.scene.layout.AnchorPane.setRightAnchor(rightBtn, 10.0);
        javafx.scene.layout.AnchorPane.setBottomAnchor(rightBtn, 30.0);

        javafx.scene.layout.AnchorPane root = new javafx.scene.layout.AnchorPane(topBtn, rightBtn, bottomBtn, leftBtn);

        Scene scene = new Scene(root, 300, 200);
        stage.setScene(scene);

        stage.setTitle("AnchorPane in JavaFX");

        stage.show();
    }
}