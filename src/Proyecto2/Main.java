package Proyecto2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main extends Application{

    public void start(Stage Stage) throws Exception{
        AnchorPane layout = (AnchorPane) FXMLLoader.load(getClass().getResource("Principal.fxml"));
        //Parent root = FXMLLoader.load(getClass().getResource("grafico.fxml"));
        Stage.setTitle("Proyecto 2");
        Stage.setScene(new Scene(layout, 444, 400));
        Stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
