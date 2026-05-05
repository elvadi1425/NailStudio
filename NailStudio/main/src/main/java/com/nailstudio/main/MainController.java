package com.nailstudio.main;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class MainController {

    @FXML
    private void handleAdminClick(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/com/nailstudio/admin/AdminLogin.fxml"));
        Stage stage = new Stage();
        stage.setTitle("NailStudio - Администратор");
        stage.setScene(new Scene(root, 600, 400)); // 🔥 Фиксируем размер
        stage.setResizable(false);                 // 🔥 Блокируем растягивание
        stage.show();
    }

    @FXML
    private void handleClientClick(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/com/nailstudio/client/ClientLogin.fxml"));
        Stage stage = new Stage();
        stage.setTitle("NailStudio - Клиент");
        stage.setScene(new Scene(root, 600, 400)); // 🔥 Фиксируем размер
        stage.setResizable(false);                 // 🔥 Блокируем растягивание
        stage.show();
    }
}