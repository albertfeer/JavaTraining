package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private TextField someText;

    @FXML
    void sayText(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Information Dialog");

        String strText = someText.getText();
        alert.setHeaderText(strText);

        alert.setContentText("Got your input text: " + strText);

        alert.showAndWait();
    }

    @FXML
    void sayHello(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Hello");
        alert.setHeaderText(null);
        alert.setContentText("Hello");

        alert.showAndWait();
    }
}
