package sample;

import javafx.embed.swing.JFXPanel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.URL;
import java.util.ResourceBundle;

public class Manager implements Initializable {

    @FXML
    public Button buttonClose;
    private AppData appData;

    public void handleButtonCloseAction(ActionEvent actionEvent) {

        // get a handle to the stage
        Stage stage = (Stage) buttonClose.getScene().getWindow();
        // do what you have to do
        stage.close();
    }

    public void loadData() {

        try {
            try (FileInputStream fileIn = new FileInputStream("struct.dat");
                 ObjectInputStream in = new ObjectInputStream(fileIn)) {
                appData = (AppData) in.readObject();
            }
        } catch (IOException i) {
            return;
        } catch (ClassNotFoundException c) {
            System.out.println("Daten konnten nicht gelesen werden.");
            return;
        }

        System.out.printf("Serialized data is loaded from struct.dat");
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
    }

    public void handleButtonNeuerFragebogen(ActionEvent actionEvent) {
        System.out.printf("Neuer Fragebogen geklickt.");
    }

    public void handleButtonNeueFrage(ActionEvent actionEvent) {

        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("NeueFrage.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        Scene scene = new Scene(root, 400, 200);

        Stage stage = new Stage();
        stage.setTitle("Neue Frage");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }
}
