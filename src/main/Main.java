/**
 * @Autor: Ruslan Hasanov
 * @Date: 20/12/2018
 * @Project: Sea Rescue - Java examen 2018
 * @Purpose: main application, launches app
 */
package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception{

        Parent root = FXMLLoader.load(getClass().getResource("gui/SeaRescueGui.fxml"));
        primaryStage.setTitle("Sea Rescue");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
