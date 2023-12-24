package com.example.gpacalculator;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.Objects;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
//        Parent root =  FXMLLoader.load(HelloApplication.class.getResource("hello-view.fxml"));

//        Stage newStage = new Stage();
//        newStage.setTitle("Login");
//        newStage.setScene(new Scene(root));
//        newStage.setOnCloseRequest(e -> ((Stage) root.getScene().getWindow()).close());
//        newStage.show();
//        showEnrollScene(stage);
           showFirstScene(stage);
//        showUpdateScene(stage);

//        showCalculatorScene(stage);
    }
//    private void showFirstScene(Stage stage) throws IOException{
//=======
//        FXMLLoader loader = new FXMLLoader(getClass().getResource("hello-view.fxml"));
//        Parent root = loader.load();
//
//        Stage newStage = new Stage();
//        newStage.setTitle("Login");
//        newStage.setScene(new Scene(root));
//        newStage.setOnCloseRequest(e -> ((Stage) root.getScene().getWindow()).close());
//        newStage.show();


//        showCalculatorScene(stage);
//          showFirstScene(stage); //  Done Style
//        showGPAScene(stage); //Done
//        showSuggestScene(stage); // Done
//        showEnrollScene(stage); //
//          showSuggestScene(stage); //Done
//        showUpdateScene(stage); // Done
//        showDatabaseScene(stage);
//    }


       private void showFirstScene(Stage stage) throws IOException{

//        Stage newStage = new Stage();
//        newStage.setTitle("Login");
//        newStage.setScene(new Scene(root));
//        newStage.show();
//        showEnrollScene(stage);
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 873, 540);
           stage.setOnCloseRequest(e -> ((Stage) scene.getWindow()).close());
           scene.getStylesheets().add(Objects.requireNonNull(HelloApplication.class.getResource("/style.css")).toExternalForm());
        stage.setTitle("Welcome");
        stage.setScene(scene);
        stage.show();

    }

    private void showEnrollScene(Stage stage) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Enroll.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 873, 540);
        scene.getStylesheets().add(Objects.requireNonNull(HelloApplication.class.getResource("/style.css")).toExternalForm());

        stage.setTitle("Enroll");
        stage.setScene(scene);
        stage.show();
    }
    private void showGPAScene(Stage stage) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("GPA.fxml"));

        Scene scene = new Scene(fxmlLoader.load(), 873, 540);
        scene.getStylesheets().add(Objects.requireNonNull(HelloApplication.class.getResource("/style.css")).toExternalForm());

        stage.setTitle("Welcome");
        stage.setScene(scene);
        stage.show();
    }

    private void showSuggestScene(Stage stage) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Suggest.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 873, 540);
        scene.getStylesheets().add(Objects.requireNonNull(HelloApplication.class.getResource("/style.css")).toExternalForm());
        stage.setTitle("Welcome");
        stage.setScene(scene);
        stage.show();
    }
    private void showUpdateScene(Stage stage) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Update.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 873, 540);
        scene.getStylesheets().add(Objects.requireNonNull(HelloApplication.class.getResource("/style.css")).toExternalForm());
        stage.setTitle("Welcome");
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    void Update(ActionEvent event) throws IOException {
        ///////// API Calling Place
//        FXMLLoader loader = new FXMLLoader(getClass().getResource("Update.fxml"));
//        Parent root = loader.load();
//        Stage newStage = new Stage();
//        newStage.setTitle("Login");
//        newStage.setScene(new Scene(root));
//        newStage.setOnCloseRequest(e -> ((Stage) root.getScene().getWindow()).close());
//        newStage.show();
    }
    private void showDatabaseScene(Stage stage) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("DatabaseScene.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 873, 540);
        scene.getStylesheets().add(Objects.requireNonNull(HelloApplication.class.getResource("/style.css")).toExternalForm());

        stage.setTitle("Welcome");
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    void Suggest(ActionEvent event) {
        ///////// API Calling Place

    }
    @FXML
    void Enroll(ActionEvent event) throws IOException {
        ///////// API Calling Place
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Enroll.fxml"));
        Parent root = loader.load();
        Stage newStage = new Stage();
        newStage.setTitle("Enrollment");
        newStage.setScene(new Scene(root));
        newStage.setOnCloseRequest(e -> ((Stage) root.getScene().getWindow()).close());
        newStage.show();
    }
    @FXML

    public static void main(String[] args) {
        launch();
    }


//>>>>>>> af5db47bfae582f252ec99f47c4cdb44fa695504
    private void showCalculatorScene(Stage stage) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("GPACalculator.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 873, 540);
        scene.getStylesheets().add(Objects.requireNonNull(HelloApplication.class.getResource("/style.css")).toExternalForm());
        stage.setTitle("Welcome");
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    void GPACalculator(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("GPACalculator.fxml"));
        Parent root = loader.load();
        Stage newStage = new Stage();
        newStage.setTitle("Login");
        newStage.setScene(new Scene(root));
        newStage.setOnCloseRequest(e -> ((Stage) root.getScene().getWindow()).close());
        newStage.show();
    }
    @FXML
    void Help(ActionEvent event) {
        ///////// API Calling Place

    }
    public void Calculate(ActionEvent actionEvent) {
        ///////// API Calling Place

    }

}