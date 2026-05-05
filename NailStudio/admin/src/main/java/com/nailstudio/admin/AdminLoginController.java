package com.nailstudio.admin;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.io.IOException;

public class AdminLoginController {

    @FXML private TextField loginField;
    @FXML private PasswordField passwordField;

    @FXML
    private void handleLogin(ActionEvent event) throws IOException {
        String login = loginField.getText().trim();
        String pass = passwordField.getText().trim();

        if (login.isEmpty() || pass.isEmpty()) {
            showAlert("Ошибка", "Заполните все поля!");
            return;
        }

        if (login.equals("admin") && pass.equals("12345")) {
            Parent root = FXMLLoader.load(getClass().getResource("AdminMain.fxml"));
            Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } else {
            showAlert("Ошибка", "Неверный логин или пароль!");
        }
    }

    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}