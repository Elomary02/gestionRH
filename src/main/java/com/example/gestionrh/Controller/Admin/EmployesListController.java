package com.example.gestionrh.Controller.Admin;

import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class EmployesListController implements Initializable {
    public static ListView<String> lv_list_employes;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public static void appendEmployeToList(String fname, String lname, String post) {
        String employeDetails = fname + " " + lname + " - " + post;
        lv_list_employes.getItems().add(employeDetails);
    }
}
