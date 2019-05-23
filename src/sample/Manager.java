package sample;

import javafx.embed.swing.JFXPanel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Manager {

    @FXML
    public Button buttonClose;

    public void handleButtonCloseAction(ActionEvent actionEvent) {

        // get a handle to the stage
        Stage stage = (Stage) buttonClose.getScene().getWindow();
        // do what you have to do
        stage.close();
    }
}
