package com.example.gestionrh.Controller.User;

import javafx.fxml.Initializable;
import javafx.scene.control.ListView;

import java.net.URL;
import java.util.ResourceBundle;

public class UserNotificationsController implements Initializable {
    public ListView<String> notifications_lv;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        notifications_lv.getItems().add("Votre demande de congé est apprové");
    }
}
