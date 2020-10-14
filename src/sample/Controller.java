package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private Label labelHello;

    @FXML
    private TextField txtName;

    @FXML
    private TextField txtEmail;

    @FXML
    public void pressButton(ActionEvent event){
        String valueName = txtName.getText();
//        labelHello.setText("Hello, " + value + "!");
        String valueEmail = txtEmail.getText();
        if (valueName.isEmpty() && valueEmail.isEmpty()) {
            labelHello.setText("Заполните поля.");
        } else if (valueName.isEmpty()){
            labelHello.setText("Введите имя.");
        } else if (valueEmail.isEmpty()){
            labelHello.setText("Введите Email.");
        } else if (!valueName.isEmpty() && !valueEmail.isEmpty()){
            labelHello.setText("Вы зарегистрировались!");
        }
    }
}