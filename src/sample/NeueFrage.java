package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class NeueFrage {

    @FXML
    public Button buttonAbbrechen;

    public void handleButtonAbbrechen(ActionEvent actionEvent) {

        // get a handle to the stage
        Stage stage = (Stage) buttonAbbrechen.getScene().getWindow();
        // do what you have to do
        stage.close();
    }
}
