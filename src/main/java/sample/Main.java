package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        try {


            Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
            Parent parent = FXMLLoader.load(getClass().getResource("/img/login.png"));
            primaryStage.setTitle("CoderKids");
            primaryStage.setScene(new Scene(root, 900, 700));
            primaryStage.setMinWidth(primaryStage.getScene().getWidth());
            primaryStage.setMinHeight(primaryStage.getScene().getHeight());
            primaryStage.centerOnScreen();
            primaryStage.sizeToScene();
            primaryStage.show();

        } catch (Exception er) {
            System.out.println("ERROR !" + er.getMessage());
           // DBConnection.ClearDatabaseInfo();
        }

    }

    public static void main(String[] args) {
        launch(args);
    }
}
