package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {
    public Label labelOutput;

    public void handleButtonAction(ActionEvent actionEvent) {

        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("Manager.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        Scene scene = new Scene(root, 800, 690);

        Stage stage = new Stage();
        stage.setTitle("Fragebogen-Manager");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }
}
