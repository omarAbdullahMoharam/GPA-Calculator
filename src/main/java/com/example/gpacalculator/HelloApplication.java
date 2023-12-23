package com.example.gpacalculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
//        showGPAScene(stage);
//        showSuggestScene(stage);
//        showEnrollScene(stage);
//          showSuggestScene(stage);
    }

    public static void main(String[] args) {
        launch();
    }
    private void showFirstScene(Stage stage) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 873, 540);
        stage.setTitle("Welcome");
        stage.setScene(scene);
        stage.show();
    }
    private void showEnrollScene(Stage stage) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Enroll.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 873, 540);
        stage.setTitle("Welcome");
        stage.setScene(scene);
        stage.show();
    }
    private void showGPAScene(Stage stage) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("GPA.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 873, 540);
        stage.setTitle("Welcome");
        stage.setScene(scene);
        stage.show();
    }

    private void showSuggestScene(Stage stage) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Suggest.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 873, 540);
        stage.setTitle("Welcome");
        stage.setScene(scene);
        stage.show();
    }

}