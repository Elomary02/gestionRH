package com.example.gestionrh.Controller.Admin;

import com.example.gestionrh.Model.Model;
import javafx.fxml.Initializable;
import javafx.scene.layout.BorderPane;

import java.net.URL;
import java.util.ResourceBundle;

import static com.example.gestionrh.View.AccountType.USER;

public class AdminController implements Initializable {

    public BorderPane admin_parent;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Model.getInstance().getViewFactory().getAdminSelectedMenuItem().addListener((observableValue, oldVal, newVal) -> {
            switch (newVal) {
                case LIST_EMPLOYES -> admin_parent.setCenter(Model.getInstance().getViewFactory().getEmployesListView());
                case ADMINNOTIFICATIONS -> admin_parent.setCenter(Model.getInstance().getViewFactory().getAdminNotificationsView());
                default -> admin_parent.setCenter(Model.getInstance().getViewFactory().getAddEmployeView());
            }
        });
    }
}
