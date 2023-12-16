package com.example.gestionrh.Controller.User;

import com.example.gestionrh.Model.Model;
import javafx.fxml.Initializable;
import javafx.scene.layout.BorderPane;

import java.net.URL;
import java.util.ResourceBundle;

public class UserController implements Initializable {

    public BorderPane user_parent;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Model.getInstance().getViewFactory().getUserSelectedMenuItem().addListener((observableValue, oldVal, newVal) -> {
            switch (newVal) {
                case USERNOTIFICATIONS -> user_parent.setCenter(Model.getInstance().getViewFactory().getUserNotificationsView());
                case USERPROFIL -> user_parent.setCenter(Model.getInstance().getViewFactory().getUserProfilView());
                default -> user_parent.setCenter(Model.getInstance().getViewFactory().getUserDashboardView());
            }
        });
    }
}
