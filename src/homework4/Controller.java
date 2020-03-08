package homework4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;

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

    String user;

    @FXML
    private ListView<String> usersList;

    @FXML
    private TextArea chatList;

    @FXML
    private TextField outgoingMessage;

    @FXML
    public void sendMessageAction(ActionEvent actionEvent) {
        if(outgoingMessage.getText().isEmpty()){
            return;
        }
        if (usersList.getFocusModel().getFocusedItem() == null){
            chatList.appendText("Выберите пользователя! \n");
            return;
        }
        chatList.appendText(usersList.getFocusModel().getFocusedItem() + ": " + outgoingMessage.getText() + "\n");
        outgoingMessage.clear();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        usersList.getItems().addAll(users);
    }

}