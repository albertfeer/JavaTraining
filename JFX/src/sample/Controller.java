package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;

import javafx.event.ActionEvent;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private TextField someText;
    @FXML
    private TextArea textArea;

    @FXML
    void sayText(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        String strTitle = someText.getText();
        alert.setTitle(strTitle);

        String strHeaderText = textArea.getText();
        alert.setHeaderText(strHeaderText);

        alert.setContentText("Got your input text length is: " + strHeaderText.length());

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
