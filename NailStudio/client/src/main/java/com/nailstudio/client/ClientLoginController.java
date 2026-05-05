package com.nailstudio.client;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.io.IOException;

public class ClientLoginController {

    @FXML private TextField phoneField;

    @FXML
    private void handleLogin(ActionEvent event) throws IOException {
        String phone = phoneField.getText().trim();

        if (phone.isEmpty()) {
            showAlert("Ошибка", "Введите номер телефона!");
            return;
        }

        Parent root = FXMLLoader.load(getClass().getResource("ClientMain.fxml"));
        Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }

    @FXML
    private void handleRegister(ActionEvent event) {
        String phone = phoneField.getText().trim();

        if (phone.isEmpty()) {
            showAlert("Ошибка", "Введите номер для регистрации!");
            return;
        }

        showAlert("Успех", "Регистрация: " + phone);
    }

    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}