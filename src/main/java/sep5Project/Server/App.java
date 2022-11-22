package sep5Project.Server;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;


public class App extends Application {


    public static void main(String[] args) {
        launch();
    }

    public void start(Stage primaryStage) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/View/Welcome.fxml"));
        Parent root = FXMLLoader.load(getClass().getResource(name: "/View/Register.fxml" ));
        primaryStage.setTitle("Welcome");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

