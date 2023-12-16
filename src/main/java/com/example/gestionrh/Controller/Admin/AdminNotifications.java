package com.example.gestionrh.Controller.Admin;

import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class AdminNotifications implements Initializable {
    public TextField tf_serch_employe;
    public Button btn_search;
    public ListView<String> lv_result_notifs;
    public TextField tf_employe_name;
    public TextArea ta_message;
    public Button btn_send;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        lv_result_notifs.getItems().add("Le TECHNICIEN elhoucine a demandé un congé de 16/12/2023 à 20/12/2023 pour des raisons personnelles urgentes");
    }
}
