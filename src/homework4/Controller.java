package homework4;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import static javafx.application.Application.launch;

public class Controller implements Initializable {

    String[] users = {
            "Денис",
            "Настя",
            "Вася",
            "Петя",
            "Коля",
            "Маша",
            "Миша",
            "Дима",
            "Саша",
            "Максим"
    };

    @FXML
    private ListView<String> usersList;

    @FXML
    private TextArea chatList;

    @FXML
    private TextField outgoingMessage;

    @FXML
    public void sendMessageAction(ActionEvent actionEvent) {

        chatList.appendText(usersList.getFocusModel().getFocusedItem() + ": " + outgoingMessage.getText() + "\n");
        outgoingMessage.clear();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        usersList.getItems().addAll(users);
    }

    public void aboutItemAction(ActionEvent actionEvent) {

    }
}